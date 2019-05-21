/*
 * Grades Exchange API
 * Use the Grades Exchange APIs to implement a Grades Producer or Grades Consumer client application and to manage Exchanges between producers and consumers.
 *
 * OpenAPI spec version: 2.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package kimono.api.v2.grades;

import kimono.api.v2.grades.ApiException;
import kimono.api.v2.grades.model.Exchange;
import org.junit.Test;
import org.junit.Ignore;


/**
 * API tests for GradesExchangeApi
 */
@Ignore
public class GradesExchangeApiTest {

    private final GradesExchangeApi api = new GradesExchangeApi();

    
    /**
     * List Grades Exchanges
     *
     * Get a list of Grades Exchanges
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listExchangesTest() throws ApiException {
        java.util.List<Exchange> response = api.listExchanges();

        // TODO: test validations
    }
    
}
