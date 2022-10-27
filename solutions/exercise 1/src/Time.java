/**
 * Represents a time.
 *
 * @see Timeable
 * @see Stopwatch
 * @see Timer
 * @author Thomas Munguya
 */
public class Time {

    /**
     * The hour of the time.
     */
    private int hour;

    /**
     * The minute of the time.
     */
    private int minute;

    /**
     * The second of the time.
     */
    private int second;

    /**
     * Constructs a new {@code Time}.
     */
    public Time() {
    }

    /**
     * Constructs a new {@code Time} with the provided arguments.
     * @param hour the hour.
     * @param minute the minute.
     * @param second the second.
     */
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    /**
     * Returns the hour of the time.
     * @return the hour.
     */
    public int getHour() {
        return hour;
    }

    /**
     * Sets the hour of the time.
     * @param hour the hour.
     */
    public void setHour(int hour) {
        this.hour = hour;
    }

    /**
     * Returns the minute of the time.
     * @return the minute.
     */
    public int getMinute() {
        return minute;
    }

    /**
     * Sets the minute of the time.
     * @param minute the minute.
     */
    public void setMinute(int minute) {
        this.minute = minute;
    }

    /**
     * Returns the second of the time.
     * @return the second.
     */
    public int getSecond() {
        return second;
    }

    /**
     * Sets the second of the time.
     * @param second the second.
     */
    public void setSecond(int second) {
        this.second = second;
    }

    /**
     * Adds {@code t} to this time.
     * @param t the time to add to this time.
     * @return the result of adding {@code t} to this time.
     */
    public Time add(Time t) {
        // add the hours
        int resultHour = getHour() + t.getHour();

        // add the minutes
        int resultMinute = getMinute() + t.getMinute();
        // if the minutes are 60 or more,
        if(resultMinute >= 60) {
            // subtract 60 from the minutes
            resultMinute -= 60;
            // add 1 to the hour
            resultHour++;
        }

        // add the seconds
        int resultSecond = getSecond() + t.getSecond();
        // if the seconds are 60 or more,
        if(resultSecond >= 60) {
            // subtract 60 from the seconds
            resultSecond -= 60;
            // add 1 to the minute
            resultMinute++;
        }

        return new Time(resultHour, resultMinute, resultSecond);
    }

    /**
     * Subtracts {@code t} from this time.
     * @param t the time to add to this time.
     * @return the result of adding {@code t} to this time.
     */
    public Time subtract(Time t) {
        // subtract the hours
        int resultHour = getHour() - t.getHour();

        // subtract the minutes
        int resultMinute = getMinute() - t.getMinute();
        // if the minutes are less than 0
        if(resultMinute < 0) {
            // add 60 to the minutes
            resultMinute += 60;
            // subtract 1 from the hours
            resultHour--;
        }

        // subtract the seconds
        int resultSecond = getSecond() - t.getSecond();
        // if the seconds are less than 0
        if(resultSecond < 0) {
            // add 60 to the seconds.
            resultSecond += 60;
            // subtract 1 from the minute.
            resultMinute--;
        }

        return new Time(resultHour, resultMinute, resultSecond);
    }

    @Override
    public String toString() {
        return String.format("%d:%d:%d", getHour(), getMinute(), getSecond());
    }

    public static void main(String[] args) {
        Time t1 = new Time(2, 45, 0);
        Time t2 = new Time(1, 10, 0);
        Time t3 = t1.add(t2);
        System.out.println(t3);

        Time t4 = new Time(4, 10, 0);
        Time t5 = new Time(1, 5, 0);
        Time t6 =  t4.subtract(t5);
        System.out.println(t6);
    }
}
