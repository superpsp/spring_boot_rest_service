package org.psp.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestWebService {
    public static String PROTOCOL = "http";
    public static String HOST = "localhost";
    public static int PORT = 8080;

    public static void main(String[] args) {
        SpringApplication.run(RestWebService.class, args);
    }
}