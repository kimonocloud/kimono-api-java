/*
 * Interop Data API
 * Interop Data APIs provide access to the data objects and events from Interop Cloud repositories and Integration repositories
 *
 * OpenAPI spec version: 2.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package kimono.api.v2.interopdata;

import kimono.api.v2.interopdata.ApiException;
import kimono.api.v2.interopdata.model.GradingCategorysResponse;
import org.junit.Test;
import org.junit.Ignore;


/**
 * API tests for GradesApi
 */
@Ignore
public class GradesApiTest {

    private final GradesApi api = new GradesApi();

    
    /**
     * List all Grading Categories
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listGradingCategoriesTest() throws ApiException {
        Integer page = null;
        Integer pageSize = null;
        GradingCategorysResponse response = api.listGradingCategories(page, pageSize);

        // TODO: test validations
    }
    
}
