# GradesExchangeApi

All URIs are relative to *http://localhost:5020/v2/grades*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listExchanges**](GradesExchangeApi.md#listExchanges) | **GET** /exchanges | List Grades Exchanges


<a name="listExchanges"></a>
# **listExchanges**
> java.util.List&lt;Exchange&gt; listExchanges()

List Grades Exchanges

Get a list of Grades Exchanges

### Example
```java
// Import classes:
//import kimono.api.v2.grades.ApiClient;
//import kimono.api.v2.grades.ApiException;
//import kimono.api.v2.grades.Configuration;
//import kimono.api.v2.grades.auth.*;
//import kimono.api.v2.grades.GradesExchangeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

GradesExchangeApi apiInstance = new GradesExchangeApi();
try {
    java.util.List<Exchange> result = apiInstance.listExchanges();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GradesExchangeApi#listExchanges");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**java.util.List&lt;Exchange&gt;**](Exchange.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

