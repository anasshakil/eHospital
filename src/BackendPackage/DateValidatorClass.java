package BackendPackage;

import com.toedter.calendar.IDateEvaluator;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class DateValidatorClass implements IDateEvaluator {

    private int[] weekDayNameInt;
    private ArrayList<String> reservedDates;
    private int x = 0;

    public DateValidatorClass(int[] data, ArrayList<String> reservedDates) {
        this.weekDayNameInt = data;
        this.reservedDates = reservedDates;
    }

    @Override
    public boolean isSpecial(Date date) {
        return false;
    }

    @Override
    public Color getSpecialForegroundColor() {
        return null;
    }

    @Override
    public Color getSpecialBackroundColor() {
        return null;
    }

    @Override
    public String getSpecialTooltip() {
        return null;
    }

    @Override
    public boolean isInvalid(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        for (int i : weekDayNameInt) {
            try {
                if (cal.get(Calendar.DAY_OF_WEEK) == i + 1) {
                    for (int j = x; j < reservedDates.size(); j++) {
                        Calendar cal1 = Calendar.getInstance();
                        cal1.setTime(new SimpleDateFormat("yyyy-MM-dd").parse(reservedDates.get(j)));
                        if ((cal.get(Calendar.DAY_OF_MONTH) == cal1.get(Calendar.DAY_OF_MONTH))
                                && (cal.get(Calendar.MONTH) == cal1.get(Calendar.MONTH))
                                && (cal.get(Calendar.YEAR) == cal1.get(Calendar.YEAR))) {
                            x++;
                            return true;
                        }
                    }
                    x = 0;
                    return false;
                }
            } catch (Exception ex) {
            }
        }
        return true;
    }

    @Override
    public Color getInvalidForegroundColor() {
        return null;
    }

    @Override
    public Color getInvalidBackroundColor() {
        return null;
    }

    @Override
    public String getInvalidTooltip() {
        return null;
    }

//    private void dateToInt(String rawDate) {
//        String[] rawSplit = rawDate.split("-");
//        year = Integer.parseInt(rawSplit[0]);
//        month = Integer.parseInt(rawSplit[1]);
//        day = Integer.parseInt(rawSplit[2]);
//    }
}
