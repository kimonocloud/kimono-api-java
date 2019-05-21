# CloudsApi

All URIs are relative to *http://localhost:5010/v2/interop*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listClouds**](CloudsApi.md#listClouds) | **GET** /clouds | List Interop Clouds


<a name="listClouds"></a>
# **listClouds**
> java.util.List&lt;Cloud&gt; listClouds()

List Interop Clouds

Get a list of Interop Clouds for accounts visible to you.

### Example
```java
// Import classes:
//import kimono.api.v2.interop.ApiClient;
//import kimono.api.v2.interop.ApiException;
//import kimono.api.v2.interop.Configuration;
//import kimono.api.v2.interop.auth.*;
//import kimono.api.v2.interop.CloudsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

CloudsApi apiInstance = new CloudsApi();
try {
    java.util.List<Cloud> result = apiInstance.listClouds();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudsApi#listClouds");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**java.util.List&lt;Cloud&gt;**](Cloud.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

