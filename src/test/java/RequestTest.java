import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class RequestTest {

    private Request request;

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void shouldRequestToGoUp() throws Exception {
        // given
        request = new Request(0);
        // when
        request.goUp();
        // then
        assertTrue(request.goingUp());
        assertFalse(request.goingDown());
    }

    @Test
    public void shouldRequestToGoDown() throws Exception {
        // given
        request = new Request(1);
        // when
        request.goDown();
        // then
        assertTrue(request.goingDown());
    }

    @Test
    public void shouldThrowAnExceptionIfRequestToGoDownBeingInFirstFloor() throws Exception {
        // given
        request = new Request(0);
        try {
            // when
            request.goDown();
        } catch (Exception ex) {
            // then
            assertEquals("Cannot go down on ground floor!", ex.getMessage());
            return;
        }
        throw new AssertionError("No expected exception was thrown.");
    }

    @Test
    public void shouldThrowAnExceptionIfRequestToGoUpBeingInFifthFloor() throws Exception {
        // given
        request = new Request(5);
        try {
            // when
            request.goUp();
        } catch (Exception ex) {
            // then
            assertEquals("Cannot go up on fifth floor!", ex.getMessage());
            return;
        }
        throw new AssertionError("No expected exception was thrown.");
    }

    @Test
    public void shouldGetDestinationFloor() throws Exception {
        // given
        request = new Request(2);
        request.goToFloor(5);
        // when
        int destinationFloor = request.getDestinationFloor();
        // then
        assertEquals(5, destinationFloor);
    }
}
