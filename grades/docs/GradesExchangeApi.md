# GradesExchangeApi

All URIs are relative to *https://api.us2.kimonocloud.com/v2/grades*

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

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

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

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

