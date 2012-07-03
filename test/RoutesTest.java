import org.junit.Test;
import play.mvc.Result;

import static play.test.Helpers.*;
import static org.fest.assertions.Assertions.*;

public class RoutesTest {

    @Test
    public void testNotices() {
        Result result = routeAndCall(fakeRequest(GET, "/notices"));
        assertThat(result).isNotNull();
    }

}