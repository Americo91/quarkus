package org.acme.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Optional;

@ConfigurationProperties("greeting")
public class GreetingProperties {

    public Message message;

    public Optional<String> name;

    public static class Message {

        public String text;

        public String suffix = "!";
    }
}
