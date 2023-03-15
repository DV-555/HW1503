
import java.util.Objects;

public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof MyDate)) return false;
        MyDate myDate = (MyDate) object;
        return day == myDate.day && year == myDate.year && Objects.equals(month, myDate.month);
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, month, year);
    }
}






