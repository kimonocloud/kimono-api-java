# AccountsApi

All URIs are relative to *http://localhost:5001/v2/platform*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listAccounts**](AccountsApi.md#listAccounts) | **GET** /accounts | Get Accounts


<a name="listAccounts"></a>
# **listAccounts**
> java.util.List&lt;Account&gt; listAccounts()

Get Accounts

Get a list of Accounts

### Example
```java
// Import classes:
//import kimono.api.v2.platform.ApiClient;
//import kimono.api.v2.platform.ApiException;
//import kimono.api.v2.platform.Configuration;
//import kimono.api.v2.platform.auth.*;
//import kimono.api.v2.platform.AccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

AccountsApi apiInstance = new AccountsApi();
try {
    java.util.List<Account> result = apiInstance.listAccounts();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#listAccounts");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**java.util.List&lt;Account&gt;**](Account.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

