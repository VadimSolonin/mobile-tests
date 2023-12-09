package helpers;

import config.BrowserstackConfig;
import org.aeonbits.owner.ConfigFactory;

import static io.restassured.RestAssured.given;

// curl -u "vadimsolonin_v8kfot:CyiUu8iKg2Sz3aqpsgN9" -X GET "https://api.browserstack.com/app-automate/sessions/31bbcd513b76e67a1da5f1e21179ebb98f387bf1.json"
public class Browserstack {
    static final BrowserstackConfig config = ConfigFactory.create(BrowserstackConfig.class, System.getProperties());

    public static String videoUrl(String sessionId) {
        String url = String.format("https://api.browserstack.com/app-automate/sessions/%s.json", sessionId);

        return given()
                .auth().basic(config.getUserName(), config.getAccessKey())
                .get(url)
                .then()
                .log().status()
                .log().body()
                .statusCode(200)
                .extract().path("automation_session.video_url");
    }
}