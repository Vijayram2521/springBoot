package com.vjulakan.springDI.demo.controllers;

import com.vjulakan.springDI.demo.mail.mockMailSender;
import com.vjulakan.springDI.demo.mail.sendMail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mailController {

    private sendMail mailsender;

//    @Autowired
//    public void mailController(sendMail smtpMailSender) {
//        this.mailsender = smtpMailSender ;
//    }

    public mailController(sendMail smtpMailSender) {
        this.mailsender = smtpMailSender;
    }

    @RequestMapping("/mail")
    public String sendMail() {
        mailsender.send("example@eg.com", "Testing MailSender", "This is a test message");
        return "Mail sent";
    }
}
