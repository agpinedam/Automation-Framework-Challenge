package MovieDB;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import utils.Credentials;
import utils.createUrl.CreateGet;

import java.io.IOException;

import static io.restassured.RestAssured.given;

public class Certification
{
    private static final Logger log = LogManager.getLogger(Certification.class);
    Credentials credentials = Credentials.getCredentials();
    CreateGet createGet = CreateGet.getCreate();
    String category ="certification";
    String apiKey = credentials.getApiKey();
    public Certification() throws IOException {
    }

    @Test
    public void getMovieCertification()
    {
        String url= createGet.create(category,"movie","list",apiKey);
        log.info("url "+url);
        given().get(url).then().statusCode(200);
    }
    @Test
    public void getTvCertification()
    {
        String url= createGet.create(category,"tv","list",apiKey);
        log.info("url "+url);
        given().get(url).then().statusCode(200);
    }

}
