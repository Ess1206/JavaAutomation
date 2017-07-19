package mailTest;

import imap.ImapClient;
import imap.With;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.testng.annotations.Test;

import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMultipart;
import java.io.IOException;
import java.util.List;

/**
 * Created by Stan on 05.07.2017.
 */
public class TestsendMAil {

    @Test
    public void sendMail() throws EmailException {

        Email email = new SimpleEmail();
        email.setHostName("smtp.gmail.com");
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator("Stanislav.iermakov", "Ermakov1206"));
        email.setSSLOnConnect(true);
        email.setFrom("Stanislav.iermakov@gmail.com");
        email.setSubject("TestMail");
        email.setMsg("This is a test mail ... :-)");
        email.addTo("ess1206@gmail.com");
        email.send();
    }

    @Test
    public void getMail() throws EmailException, InterruptedException, MessagingException, IOException {
        ImapClient imapClient = new ImapClient( "stanislav.iermakov@gmail.com", "Ermakov1206");
        imapClient.connect();
       /* ArrayList<Message> Allmessages = imapClient.findMessages();
        for (Message message: Allmessages) {
            System.out.println(message.getSubject());
        }*/

        List<Message> messages = imapClient.findMessages(With.from("ess1206@gmail.com"));
        for (Message message: messages) {
            System.out.println(getTextFromMessage(message));
            //imapClient.deleteAllMessages();
            //imapClient.delete(message);
        }





    }
    //move to seporate class
    private String getTextFromMessage(Message message) throws MessagingException, IOException {
        String result = "";
        if (message.isMimeType("text/plain")) {
            result = message.getContent().toString();
        } else if (message.isMimeType("multipart/*")) {
            MimeMultipart mimeMultipart = (MimeMultipart) message.getContent();
            result = getTextFromMimeMultipart(mimeMultipart);
        }
        return result;
    }

    private String getTextFromMimeMultipart(
            MimeMultipart mimeMultipart)  throws MessagingException, IOException{
        String result = "";
        int count = mimeMultipart.getCount();
        for (int i = 0; i < count; i++) {
            BodyPart bodyPart = mimeMultipart.getBodyPart(i);
            System.out.println(bodyPart.getContentType());
            if (bodyPart.isMimeType("text/plain")) {
                result = result + "\n" + bodyPart.getContent();
                break; // without break same text appears twice in my tests
            } else if (bodyPart.isMimeType("text/html")) {
                String html = (String) bodyPart.getContent();
                result = html;
            } else if (bodyPart.getContent() instanceof MimeMultipart){
                result = result + getTextFromMimeMultipart((MimeMultipart)bodyPart.getContent());
            }
        }
        return result;
    }
}
