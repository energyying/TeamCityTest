import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by DEV001 on 2014/8/27.
 */

public class TeamCityTest {

    @Test
    public void testGetLong(){
        TeamCity teamCity = new TeamCity();

        Long result = teamCity.getLong("123");

        assertEquals(new Long(123L), result);
    }
}
