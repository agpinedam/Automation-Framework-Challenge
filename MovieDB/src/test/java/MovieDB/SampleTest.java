package MovieDB;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import utils.Credentials;
import utils.GetDetails;
import java.io.IOException;
import static io.restassured.RestAssured.given;


public class SampleTest {
    Credentials credentials = Credentials.getCredentials();
    GetDetails getDetails = GetDetails.getGetDetails(credentials.getApiKey());

    private static Logger logger = LogManager.getLogger(SampleTest.class);

    public SampleTest() throws IOException {
    }


    @Test
    public void createRequestToken() throws IOException {
        System.out.println(credentials.getApiKey());
        System.out.println(getDetails.getUrl());
        given().get(getDetails.getUrl()).then().statusCode(200);
    }
    @Test
    public void test(){
        logger.error("Lo is configured correctly");

        int a=1;
        int b =2;
        Assert.assertEquals("Expected result was incorrect",a+b,3);
    }
}
