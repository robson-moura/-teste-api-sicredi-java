import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class FunctionalTest extends BaseTest{

    @Test
    public void ValidaRetornoDeSimulacao(){

          given()
              .log().all()
          .when()
              .get(URL_BASE)
          .then()
              .log().all()
              .statusCode(200)
              .body("id", Matchers.is(1))
              .body("meses", Matchers.hasItems(CONTENT_MES))
              .body("valor", Matchers.hasItems(CONTENT_VALOR))
           ;
    }

}
