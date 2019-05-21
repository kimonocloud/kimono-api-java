/*
 * Interop API
 * Interop APIs provide access to Kimono Interop Cloud resources and operations
 *
 * OpenAPI spec version: 2.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package kimono.api.v2.interop;

import kimono.api.v2.interop.ApiException;
import kimono.api.v2.interop.model.Actor;
import org.junit.Test;
import org.junit.Ignore;


/**
 * API tests for ActorsApi
 */
@Ignore
public class ActorsApiTest {

    private final ActorsApi api = new ActorsApi();

    
    /**
     * List Actors
     *
     * Get a list of actors installed in Interop Clouds for accounts visible to you. This API is used to obtain coordinates and credentials essential for interacting with Integrations and other actors.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listActorsTest() throws ApiException {
        java.util.List<Actor> response = api.listActors();

        // TODO: test validations
    }
    
}
