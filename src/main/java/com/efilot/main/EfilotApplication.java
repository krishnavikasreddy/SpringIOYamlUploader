
package com.efilot.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan(basePackages = {"com.efilot.endpoint"})
public class EfilotApplication {
    public static void main(String args[]) {
        SpringApplication.run(EfilotApplication.class, args);
    }
}
