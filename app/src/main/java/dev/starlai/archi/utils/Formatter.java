package dev.starlai.archi.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by izayoi on 11/9/2016.
 */

public class Formatter {

    public static String formatDate(long date){

        String displayDate = new SimpleDateFormat("MMM dd").format(new Date(date));
        return displayDate;
    }
}
