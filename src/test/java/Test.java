import com.donkeigy.ffn.bo.Team;
import com.donkeigy.ffn.webservice.FFNAPIWebService;
import static org.junit.Assert.assertEquals;

import java.util.List;

/**
 * Created by cedric on 10/20/15.
 */
public class Test
{
    @org.junit.Test
    public void testFFNTeams() throws Exception {
        FFNAPIWebService ffnapiWebService = new FFNAPIWebService();

        List<Team> teams = ffnapiWebService.getNFLTeamsList();
        assertEquals("Teams should be 32", 32, teams.size());

    }
}
