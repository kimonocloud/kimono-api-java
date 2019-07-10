# GradesApi

All URIs are relative to *http://localhost/v2/interop/data*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listGradingCategories**](GradesApi.md#listGradingCategories) | **GET** /grades/categories | List all Grading Categories


<a name="listGradingCategories"></a>
# **listGradingCategories**
> GradingCategorysResponse listGradingCategories(page, pageSize)

List all Grading Categories

### Example
```java
// Import classes:
//import kimono.api.v2.interopdata.ApiClient;
//import kimono.api.v2.interopdata.ApiException;
//import kimono.api.v2.interopdata.Configuration;
//import kimono.api.v2.interopdata.auth.*;
//import kimono.api.v2.interopdata.GradesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

GradesApi apiInstance = new GradesApi();
Integer page = 56; // Integer | Specify the page number (defaults to 1)
Integer pageSize = 56; // Integer | Specify the page_size (defaults to the maximum page size)
try {
    GradingCategorysResponse result = apiInstance.listGradingCategories(page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GradesApi#listGradingCategories");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Specify the page number (defaults to 1) | [optional]
 **pageSize** | **Integer**| Specify the page_size (defaults to the maximum page size) | [optional]

### Return type

[**GradingCategorysResponse**](GradingCategorysResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

