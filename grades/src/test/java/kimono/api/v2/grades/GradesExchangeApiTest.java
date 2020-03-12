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
import kimono.api.v2.grades.model.ErrorType;
import kimono.api.v2.grades.model.ExchangeDataRequest;
import kimono.api.v2.grades.model.ExchangeDataResponse;
import kimono.api.v2.grades.model.ExchangeError;
import kimono.api.v2.grades.model.ExchangeErrorResponse;
import kimono.api.v2.grades.model.ExchangeErrorsResponse;
import kimono.api.v2.grades.model.ExchangeResponse;
import kimono.api.v2.grades.model.ExchangesRequest;
import kimono.api.v2.grades.model.ExchangesResponse;
import org.junit.Test;
import org.junit.Ignore;


/**
 * API tests for GradesExchangeApi
 */
@Ignore
public class GradesExchangeApiTest {

    private final GradesExchangeApi api = new GradesExchangeApi();

    
    /**
     * Create a Grades Exchange
     *
     * Create a Grades Exchange
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createExchangeTest() throws ApiException {
        ExchangesRequest exchangesRequest = null;
        ExchangeDataResponse response = api.createExchange(exchangesRequest);

        // TODO: test validations
    }
    
    /**
     * Create Grades Exchange Data
     *
     * Create Grades data for an Exchange
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createExchangeDataTest() throws ApiException {
        java.util.UUID id = null;
        ExchangeDataRequest exchangeDataRequest = null;
        ExchangeDataResponse response = api.createExchangeData(id, exchangeDataRequest);

        // TODO: test validations
    }
    
    /**
     * Create Grades Exchange Errors
     *
     * Create a list of Grades Exchange Errors
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createExchangeErrorTest() throws ApiException {
        java.util.UUID id = null;
        ExchangeError body = null;
        ExchangeErrorResponse response = api.createExchangeError(id, body);

        // TODO: test validations
    }
    
    /**
     * Find a Grades Exchange by id
     *
     * Get an Exchange
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findExchangeTest() throws ApiException {
        java.util.UUID id = null;
        ExchangeResponse response = api.findExchange(id);

        // TODO: test validations
    }
    
    /**
     * List Grades Exchange Errors
     *
     * Get a list of Grades Exchange Errors
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listExchangeErrorsTest() throws ApiException {
        java.util.UUID id = null;
        Integer page = null;
        Integer pageSize = null;
        ExchangeErrorsResponse response = api.listExchangeErrors(id, page, pageSize);

        // TODO: test validations
    }
    
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
        Integer page = null;
        Integer pageSize = null;
        ExchangesResponse response = api.listExchanges(page, pageSize);

        // TODO: test validations
    }
    
}
