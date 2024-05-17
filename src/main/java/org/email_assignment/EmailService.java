package org.email_assignment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class EmailService {

    private Datasource datasource;

    public EmailService(Datasource datasource) {
        this.datasource = datasource;
    }

    public void sendEmail(){
        System.out.println(Arrays.toString(datasource.getEmails()));
    }
}
