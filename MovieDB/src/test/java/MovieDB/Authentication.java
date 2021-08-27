package MovieDB;

import static io.restassured.RestAssured.given;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import utils.Credentials;
import utils.createUrl.CreateGet;
import java.io.IOException;

public class Authentication
{
    private static Logger log = LogManager.getLogger(Authentication.class);
    Credentials credentials = Credentials.getCredentials();
    CreateGet createGet = CreateGet.getCreate();
    String category ="authentication";
    String apiKey = credentials.getApiKey();
    public Authentication() throws IOException {
    }

    @Test
    public void getCreateGuestSesion()
    {
        String url= createGet.create(category,"guest_session","new",apiKey);
        log.trace("url "+url);
        log.error("Test get Create Guest Session passed");
        given().get(url).then().statusCode(200);
    }
    @Test
    public void getRequestToken()
    {
        String url= createGet.create(category,"token","new",apiKey);
        log.error("url "+url);
        log.error("Test get Create Guest Session passed");
        given().get(url).then().statusCode(200);
    }
}
