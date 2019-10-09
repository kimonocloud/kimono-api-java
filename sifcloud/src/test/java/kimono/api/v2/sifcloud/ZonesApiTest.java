/*
 * SIF Cloud API
 * SIF Cloud APIs provide access to SIF Cloud provisioning resources.
 *
 * OpenAPI spec version: 2.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package kimono.api.v2.sifcloud;

import kimono.api.v2.sifcloud.ApiException;
import kimono.api.v2.sifcloud.model.ErrorType;
import kimono.api.v2.sifcloud.model.SIFZone;
import kimono.api.v2.sifcloud.model.SIFZoneResponse;
import kimono.api.v2.sifcloud.model.SIFZonesResponse;
import org.junit.Test;
import org.junit.Ignore;


/**
 * API tests for ZonesApi
 */
@Ignore
public class ZonesApiTest {

    private final ZonesApi api = new ZonesApi();

    
    /**
     * Create a SIF Zone
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createZoneTest() throws ApiException {
        SIFZone siFZone = null;
        SIFZoneResponse response = api.createZone(siFZone);

        // TODO: test validations
    }
    
    /**
     * Find a &#x60;SIFZone&#x60;
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findZoneTest() throws ApiException {
        java.util.UUID id = null;
        SIFZoneResponse response = api.findZone(id);

        // TODO: test validations
    }
    
    /**
     * Get SIF Zones
     *
     * Get a list of &#x60;SIFZone&#x60;s
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listZonesTest() throws ApiException {
        Integer page = null;
        Integer pageSize = null;
        SIFZonesResponse response = api.listZones(page, pageSize);

        // TODO: test validations
    }
    
}
