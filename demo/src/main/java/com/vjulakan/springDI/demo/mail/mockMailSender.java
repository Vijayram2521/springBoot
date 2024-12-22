package com.vjulakan.springDI.demo.mail;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.stereotype.Component;

@Component
public class mockMailSender implements  sendMail{
    private static Log log = LogFactory.getLog(mockMailSender.class) ;
    @Override
    public void send(String to, String subject, String body) {
        log.info("Sending mock mail to "+ to) ;
        log.info("Subject: " + subject) ;
        log.info("Body: " + body) ;
    }
}
