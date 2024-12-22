package com.vjulakan.springDI.demo.mail;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class mailConfiguration {
    @Bean
    @ConditionalOnProperty(name="spring.mail.host", havingValue="foo", matchIfMissing=true)
    public sendMail mockMailSender() {
        return new mockMailSender() ;
    }
    @Bean
    @ConditionalOnProperty("spring.mail.host")
    public sendMail smtpMailSender() {
        return new smtpMailSender() ;
    }
}
