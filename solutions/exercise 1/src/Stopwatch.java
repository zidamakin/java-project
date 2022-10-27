/**
 * Represents a stopwatch.
 * <p>
 * A stopwatch is characterized by its ability to count time up.
 *
 * @see Time
 * @see Timeable
 * @author Thomas Munguya
 */
public class Stopwatch extends Timeable {

    /**
     * Constructs a {@code Stopwatch} with the provided time.
     *
     * @param time the time.
     */
    public Stopwatch(Time time) {
        super(time);
    }

    /**
     * Counts the time up.
     */
    public void countUp() {
        // not implemented
        throw new UnsupportedOperationException();
    }
}
