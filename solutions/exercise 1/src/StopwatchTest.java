import org.junit.jupiter.api.*;
import java.lang.reflect.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for the {@code Stopwach} class.
 *
 * @see Stopwatch
 * @author Thomas Munguya
 */
class StopwatchTest {
    private Class<Stopwatch> stopwatchClass;

    @BeforeEach
    void setUp() {
        stopwatchClass = Stopwatch.class;
    }

    @Test
    void shouldInheritFromTimeable() {
        assertEquals(Timeable.class.toString(), stopwatchClass.getSuperclass().toString());
    }

    @Test
    void shouldHaveGetTimeMethod() {
        Method getTime = null;
        try {
            // should have getTime method
            getTime = stopwatchClass.getMethod("getTime");
            assertNotNull(getTime);
        } catch (NoSuchMethodException e) {
            assertNotNull(getTime);
        }
    }

    @Test
    void shouldHavePublicSetTimeMethod() {
        Method setTime = null;
        try {
            // should have getTime method
            setTime = stopwatchClass.getMethod("setTime", Time.class);
            assertNotNull(setTime);

            // setTime method should be public
            assertTrue(Modifier.isPublic(setTime.getModifiers()));
        } catch (NoSuchMethodException e) {
            assertNotNull(setTime);
        }
    }

    @Test
    void shouldHavePublicAllArgsConstructor() {
        Constructor<Stopwatch> allArgsConstructor = null;
        try {
            // should have all args constructor
            allArgsConstructor = stopwatchClass.getDeclaredConstructor(Time.class);
            assertNotNull(allArgsConstructor);

            // all args constructor should be public
            assertTrue(Modifier.isPublic(allArgsConstructor.getModifiers()));
        } catch (NoSuchMethodException e) {
            assertNotNull(allArgsConstructor);
        }
    }

    @Test
    void shouldHavePublicCountUpMethod() {
        Method countUp = null;
        try {
            // should have countUp method
            countUp = stopwatchClass.getMethod("countUp");
            assertNotNull(countUp);

            // countUp method should be public
            assertTrue(Modifier.isPublic(countUp.getModifiers()));
        } catch (NoSuchMethodException e) {
            assertNotNull(countUp);
        }
    }
}