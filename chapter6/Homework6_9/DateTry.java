import DateDemo.java;

public class DateTry {
    private String month;
    private int day;
    private int year;

    public DateTry(String month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public boolean equals(DateTry date) {
        boolean result = false;
        // Code start
        result = (this.month == date.month) && (this.day == date.day) && (this.year == date.year);
        // Code end
        return result;
    }

    public String getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    public boolean setMonth(String month) {
        boolean result = true;
        this.month = month;
        return result;

    }

    public boolean setDay(int day) {
        boolean result = true;
        // Code strat
        if (day >= 1 && day <= 31) {
            this.day = day;
        } else {
            return false;
        }
        // Code end
        return result;
    }

    public boolean setYear(int year) {
        boolean result = true;
        // Code strat
        this.year = year;
        // Code end
        return result;
    }

    public boolean setDate(String month, int day, int year) {
        boolean result = true;
        this.month = month;
        result = setDay(day) && setYear(year);
        return result;
    }

    public boolean setDate(int monthInt, int day, int year) {
        boolean result = true;
        // Code strat
        this.month = new String(monthString(monthInt));
        setDay(day);
        setYear(year);
        // Code end
        return result;
    }

    public boolean setDate(DateTry date) {
        boolean result = true;
        // Code strat
        result = setMonth(date.month) && setDay(date.day) && setYear(date.year);
        // Code end
        return result;
    }

    public String monthString(int monthNumber) {
        switch (monthNumber) {
        case 1:
            return "January";
        case 2:
            return "February";
        case 3:
            return "March";
        case 4:
            return "April";
        case 5:
            return "May";
        case 6:
            return "June";
        case 7:
            return "July";
        case 8:
            return "August";
        case 9:
            return "September";
        case 10:
            return "October";
        case 11:
            return "November";
        case 12:
            return "December";
        default:
            System.out.println("Fatal Error");
            System.exit(0);
            return "Error";
        }
    }
}