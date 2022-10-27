/**
 * The {@code Timeable} class is the superclass of all entities that are timeable.
 *
 * @see Time
 * @author Thomas Munguya
 */
public abstract class Timeable {
    protected Time time;

    /**
     * Constructs a {@code Timeable} with the provided time.
     * @param time the time.
     */
    public Timeable(Time time) {
        this.time = time;
    }

    /**
     * Returns the time.
     * @return the time.
     */
    public Time getTime() {
        return time;
    }

    /**
     * Sets the time.
     * @param t the new time.
     */
    public void setTime(Time t) {
        time = t;
    }

    /**
     * Resets the time by setting the hour, minute and second to 0.
     */
    public void reset() {
        time.setHour(0);
        time.setMinute(0);
        time.setSecond(0);
    }
}
