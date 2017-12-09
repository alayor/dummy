import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class RequestProviderTest {
    private RequestProvider requestProvider;

    @Test
    public void shouldGetNonNullInstance() throws Exception {
        // when
        RequestProvider requestProvider = RequestProvider.getInstance();
        // then
        assertNotNull(requestProvider);
    }

    @Test
    public void shouldNotGetDifferentObjectWhenCreatingInstance() throws Exception {
        // given
        RequestProvider requestProvider1 = RequestProvider.getInstance();
        // when
        RequestProvider requestProvider2 = RequestProvider.getInstance();
        // then
        assertTrue(requestProvider1 == requestProvider2);
    }

    @Test
    public void shouldReturnNotNullRequest() throws Exception {
        // given
        RequestProvider requestProvider = RequestProvider.getInstance();
        // when
        Request request = requestProvider.getNextRequest();
        // then
        assertNotNull(request);
    }

    @Test
    public void shouldNotReturnTwoEqualsRequests() throws Exception {

    }
}
