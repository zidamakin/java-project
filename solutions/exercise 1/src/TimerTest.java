import org.junit.jupiter.api.*;
import java.lang.reflect.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for the {@code Timer} class.
 *
 * @see Timer
 * @author Thomas Munguya
 */
class TimerTest {
    private Class<Timer> timerClass;

    @BeforeEach
    void setUp() {
        timerClass = Timer.class;
    }

    @Test
    void shouldInheritFromTimeable() {
        assertEquals(Timeable.class.toString(), timerClass.getSuperclass().toString());
    }

    @Test
    void shouldHavePublicGetTimeMethod() {
        Method getTime = null;
        try {
            // should have getTime method
            getTime = timerClass.getMethod("getTime");
            assertNotNull(getTime);

            // getTime method should be public.
            assertTrue(Modifier.isPublic(getTime.getModifiers()));
        } catch (NoSuchMethodException e) {
            assertNotNull(getTime);
        }
    }

    @Test
    void shouldHavePublicSetTimeMethod() {
        Method setTime = null;
        try {
            // should have getTime method
            setTime = timerClass.getMethod("setTime", Time.class);
            assertNotNull(setTime);

            // setTime method should be public
            assertTrue(Modifier.isPublic(setTime.getModifiers()));
        } catch (NoSuchMethodException e) {
            assertNotNull(setTime);
        }
    }

    @Test
    void shouldHavePublicAllArgsConstructor() {
        Constructor<Timer> allArgsConstructor = null;
        try {
            // should have all args constructor
            allArgsConstructor = timerClass.getDeclaredConstructor(Time.class);
            assertNotNull(allArgsConstructor);

            // all args constructor should be public.
            assertTrue(Modifier.isPublic(allArgsConstructor.getModifiers()));
        } catch (NoSuchMethodException e) {
            assertNotNull(allArgsConstructor);
        }
    }

    @Test
    void shouldHavePublicCountDownMethod() {
        Method countDown = null;
        try {
            // should have countDown method
            countDown = timerClass.getMethod("countDown");
            assertNotNull(countDown);

            // countDown method should be public.
            assertTrue(Modifier.isPublic(countDown.getModifiers()));
        } catch (NoSuchMethodException e) {
            assertNotNull(countDown);
        }
    }

}