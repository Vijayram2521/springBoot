package com.vjulakan.springDI.demo.mail;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class mailConfiguration {
    @Bean
    @Profile("dev")
    public sendMail mockMailSender() {
        return new mockMailSender() ;
    }
    @Bean
    @Profile("Prod")
    public sendMail smtpMailSender() {
        return new smtpMailSender() ;
    }
}
