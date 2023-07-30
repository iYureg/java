package Exceptions.Lections.lesson3_exceptionsAdvanced;

import java.io.IOException;
import java.sql.Date;

public class MyIOException extends IOException {

    private Date startDate;

    public MyIOException(String msg, Date startDate, Exception e) {
        super("exception with message: " + msg, e);
        this.startDate = startDate;
    }

    public Date getStartDate() {
        return this.startDate;
    }
}
