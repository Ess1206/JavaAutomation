package imap;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.io.IOException;
import java.util.Properties;

public class EmailSender {

    String mailTo = "ess1206@gmail.com";

    final String username = "Stanislav.iermakov@gmail.com";
    final String password = "Ermakov1206";

    Properties props = new Properties();

    Session session = Session.getInstance(props,
            new javax.mail.Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(username, password);
                }
            });

    {
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
    }

    public EmailSender(String mailTo){
        this.mailTo = mailTo;
    }

    public EmailSender(){}

    public void sendEmail(String subjectText, String messageText){
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(mailTo));

            message.setSubject(subjectText);
            message.setText(messageText);

            Transport.send(message);

            System.out.println("Done");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }

    public void sendEmailWithImage(String subjectText, String imgPath){
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(mailTo));

            message.setSubject(subjectText);

            MimeMultipart content = new MimeMultipart();
            MimeBodyPart imagePart = new MimeBodyPart();

           // imagePart.attachFile("C:\\maksTableau.png");
            imagePart.attachFile(imgPath);

            content.addBodyPart(imagePart);

            message.setContent(content);

            Transport.send(message);

            System.out.println("Done");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
