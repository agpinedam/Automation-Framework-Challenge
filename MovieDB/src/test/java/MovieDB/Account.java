package MovieDB;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import utils.Credentials;
import utils.createUrl.CreateGet;

import java.io.IOException;

import static io.restassured.RestAssured.given;

public class Account
{
    private static final Logger log = LogManager.getLogger(Account.class);
    Credentials credentials = Credentials.getCredentials();
    CreateGet createGet = CreateGet.getCreate();
    String category ="account";
    String apiKey = credentials.getApiKey();
    public Account() throws IOException {
    }

    @Test
    public void getDetails()
    {
        String url= createGet.create(category,"","",apiKey);
        log.info("url "+url);
        given().get(url).then().statusCode(401);
    }
    @Test
    public void getDetailsJson() throws JSONException {
        JSONObject json = new JSONObject();
        json.put("success",true);
        JSONAssert.assertEquals("{success:true}",json,false);
    }

}
