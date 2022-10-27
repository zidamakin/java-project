/**
 * Represents a timer.
 * <p>
 * A timer is characterized by its ability to count down time.
 *
 * @see Time
 * @see Timeable
 * @author Thomas Munguya
 */
public class Timer extends Timeable {
    /**
     * Constructs a {@code Timer} with the provided time.
     *
     * @param time the time.
     */
    public Timer(Time time) {
        super(time);
    }

    /**
     * Counts down the time.
     */
    public void countDown() {
        // not implemented.
        throw new UnsupportedOperationException();
    }
}
