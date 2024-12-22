package com.vjulakan.springDI.demo.mail;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
@Qualifier("smtpMail")
public class smtpMailSender implements sendMail{
    private static Log log = LogFactory.getLog(smtpMailSender.class) ;
    @Override
    public void send(String to, String subject, String body) {
        log.info("Sending SMTP mail to " + to);
        log.info("with Subject: " + subject);
        log.info("and Body: " + body);
    }
}
