package org.email_assignment;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PostgreSQLDatabase implements Datasource{

    @Override
    public String[] getEmails() {
        return new String[]{"pgsqlabc@gmail.com","pgsqlpqr@gmail.com"};
    }
}
