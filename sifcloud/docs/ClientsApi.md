# ClientsApi

All URIs are relative to *https://api.kimonocloud.com/v2/sifcloud*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listClients**](ClientsApi.md#listClients) | **GET** /clients | Get SIF Clients


<a name="listClients"></a>
# **listClients**
> java.util.List&lt;SIFClient&gt; listClients()

Get SIF Clients

Get a list of &#x60;SIFClient&#x60;s

### Example
```java
// Import classes:
//import kimono.api.v2.sifcloud.ApiClient;
//import kimono.api.v2.sifcloud.ApiException;
//import kimono.api.v2.sifcloud.Configuration;
//import kimono.api.v2.sifcloud.auth.*;
//import kimono.api.v2.sifcloud.ClientsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ClientsApi apiInstance = new ClientsApi();
try {
    java.util.List<SIFClient> result = apiInstance.listClients();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientsApi#listClients");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**java.util.List&lt;SIFClient&gt;**](SIFClient.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

