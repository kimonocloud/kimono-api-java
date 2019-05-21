# ZonesApi

All URIs are relative to *https://api.kimonocloud.com/v2/sifcloud*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listZones**](ZonesApi.md#listZones) | **GET** /zones | Get SIF Zones


<a name="listZones"></a>
# **listZones**
> java.util.List&lt;SIFZone&gt; listZones()

Get SIF Zones

Get a list of &#x60;SIFZone&#x60;s

### Example
```java
// Import classes:
//import kimono.api.v2.sifcloud.ApiClient;
//import kimono.api.v2.sifcloud.ApiException;
//import kimono.api.v2.sifcloud.Configuration;
//import kimono.api.v2.sifcloud.auth.*;
//import kimono.api.v2.sifcloud.ZonesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ZonesApi apiInstance = new ZonesApi();
try {
    java.util.List<SIFZone> result = apiInstance.listZones();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZonesApi#listZones");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**java.util.List&lt;SIFZone&gt;**](SIFZone.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

