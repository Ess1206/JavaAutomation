package lesson22.HW;

import imap.EmailSender;
import org.apache.commons.mail.EmailException;
import org.testng.annotations.Test;

/**
 * Created by Stan on 09.07.2017.
 */
public class SendMail {

    @Test
    public void sendMailwithAtthach() throws EmailException {

        EmailSender emailSender = new EmailSender();
        emailSender.sendEmailWithImage("IMAX for Today","c:\\tmp\\screenshot.png");

    }

}
