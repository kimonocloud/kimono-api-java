/*
 * Broker API
 * Broker APIs provide access to Kimono Broker resources and operations
 *
 * OpenAPI spec version: 2.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package kimono.api.v2.broker;

import kimono.api.v2.broker.ApiException;
import kimono.api.v2.broker.model.Model;
import kimono.api.v2.broker.model.ModelsResponse;
import kimono.api.v2.broker.model.VocabularysResponse;
import org.junit.Test;
import org.junit.Ignore;


/**
 * API tests for VocabularyApi
 */
@Ignore
public class VocabularyApiTest {

    private final VocabularyApi api = new VocabularyApi();

    
    /**
     * Create Data Models
     *
     * Create a Data Model
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createModelTest() throws ApiException {
        ModelsResponse response = api.createModel();

        // TODO: test validations
    }
    
    /**
     * Delete a Data Model
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteModelTest() throws ApiException {
        java.util.UUID id = null;
        api.deleteModel(id);

        // TODO: test validations
    }
    
    /**
     * Get a Data Model by id
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findModelTest() throws ApiException {
        java.util.UUID id = null;
        Model response = api.findModel(id);

        // TODO: test validations
    }
    
    /**
     * Get a Data Model by id
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findModel_0Test() throws ApiException {
        java.util.UUID id = null;
        ModelsResponse response = api.findModel_0(id);

        // TODO: test validations
    }
    
    /**
     * List Data Models
     *
     * Get a list of all defined Data Models
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listModelsTest() throws ApiException {
        ModelsResponse response = api.listModels();

        // TODO: test validations
    }
    
    /**
     * List Vocabularies
     *
     * Get a list of all defined Vocabularies
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listVocabulariesTest() throws ApiException {
        VocabularysResponse response = api.listVocabularies();

        // TODO: test validations
    }
    
    /**
     * Update the properties of a Data Model
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateModelTest() throws ApiException {
        java.util.UUID id = null;
        Model response = api.updateModel(id);

        // TODO: test validations
    }
    
    /**
     * Update the properties of a Data Model
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateModel_0Test() throws ApiException {
        java.util.UUID id = null;
        ModelsResponse response = api.updateModel_0(id);

        // TODO: test validations
    }
    
}
