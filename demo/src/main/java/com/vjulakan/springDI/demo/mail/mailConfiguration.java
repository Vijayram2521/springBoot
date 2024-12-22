package com.vjulakan.springDI.demo.mail;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class mailConfiguration {
    @Bean
    public sendMail mockMailSender() {
        return new mockMailSender() ;
    }
    @Bean
    public sendMail smtpMailSender() {
        return new smtpMailSender() ;
    }
}
