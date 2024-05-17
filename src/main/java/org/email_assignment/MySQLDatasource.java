package org.email_assignment;

import org.springframework.stereotype.Component;

@Component
public class MySQLDatasource implements Datasource{
    @Override
    public String[] getEmails() {
        return new String[]{"sqlabc@gmail.com", "sqlpqr@gmail.com"};
    }
}
