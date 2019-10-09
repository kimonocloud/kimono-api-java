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
import kimono.api.v2.interopdata.model.Ingestion;
import kimono.api.v2.interopdata.model.IngestionResponse;
import kimono.api.v2.interopdata.model.IngestionsResponse;
import org.junit.Test;
import org.junit.Ignore;


/**
 * API tests for IngestionsApi
 */
@Ignore
public class IngestionsApiTest {

    private final IngestionsApi api = new IngestionsApi();

    
    /**
     * Cancel an Ingestion by id
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cancelIngestionTest() throws ApiException {
        java.util.UUID id = null;
        Ingestion response = api.cancelIngestion(id);

        // TODO: test validations
    }
    
    /**
     * Create an Ingestion
     *
     * Create an Ingestion. Use the resulting session_token to send Load messages containing raw data to be transformed by the Ingestion Pipeline.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createIngestionTest() throws ApiException {
        Ingestion ingestion = null;
        IngestionResponse response = api.createIngestion(ingestion);

        // TODO: test validations
    }
    
    /**
     * Find an Ingestion by id
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findIngestionTest() throws ApiException {
        java.util.UUID id = null;
        IngestionResponse response = api.findIngestion(id);

        // TODO: test validations
    }
    
    /**
     * List Ingestions
     *
     * Get a list of Ingestions. By default only incomplete Ingestions from the Ingestion Queue are returned.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listIngestionsTest() throws ApiException {
        Integer page = null;
        Integer pageSize = null;
        IngestionsResponse response = api.listIngestions(page, pageSize);

        // TODO: test validations
    }
    
}
