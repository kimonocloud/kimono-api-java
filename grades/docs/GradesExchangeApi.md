# GradesExchangeApi

All URIs are relative to *http://localhost:5020/v2/grades*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listExchanges**](GradesExchangeApi.md#listExchanges) | **GET** /exchanges | List Grades Exchanges


<a name="listExchanges"></a>
# **listExchanges**
> ExchangesResponse listExchanges(page, pageSize)

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
Integer page = 56; // Integer | Specify the page number (defaults to 1)
Integer pageSize = 56; // Integer | Specify the page_size (defaults to the maximum page size)
try {
    ExchangesResponse result = apiInstance.listExchanges(page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GradesExchangeApi#listExchanges");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Specify the page number (defaults to 1) | [optional]
 **pageSize** | **Integer**| Specify the page_size (defaults to the maximum page size) | [optional]

### Return type

[**ExchangesResponse**](ExchangesResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

