package utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Conversions {

    private static final String FORMAT_DATE = "dd-MM";

    public static String format(Date date) {
        SimpleDateFormat formater;
        formater = new SimpleDateFormat(FORMAT_DATE);
        return formater.format(date);
    }
}