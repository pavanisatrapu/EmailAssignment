package org.email_assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Client {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(AppConfig.class);

        EmailService emailService = applicationContext.getBean(EmailService.class);
        emailService.sendEmail();

//        PostgreSQLDatabase postgreSQLDatabase=applicationContext.getBean(PostgreSQLDatabase.class);
//        System.out.println(Arrays.toString(postgreSQLDatabase.getEmails()));
    }
}