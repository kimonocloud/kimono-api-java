# AccountsApi

All URIs are relative to *http://localhost:5001/v2/platform*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAccount**](AccountsApi.md#createAccount) | **POST** /accounts | Create an Account
[**deleteAccount**](AccountsApi.md#deleteAccount) | **DELETE** /accounts/{id} | Delete an Account
[**findAccount**](AccountsApi.md#findAccount) | **GET** /accounts/{id} | Find an Account
[**findOwnAccount**](AccountsApi.md#findOwnAccount) | **GET** /accounts/self | Find your Account
[**listAccounts**](AccountsApi.md#listAccounts) | **GET** /accounts | Get Accounts
[**updateAccount**](AccountsApi.md#updateAccount) | **PATCH** /accounts/{id} | Update an Account


<a name="createAccount"></a>
# **createAccount**
> AccountResponse createAccount(account)

Create an Account

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
Account account = new Account(); // Account | Account to create
try {
    AccountResponse result = apiInstance.createAccount(account);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#createAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account** | [**Account**](Account.md)| Account to create |

### Return type

[**AccountResponse**](AccountResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAccount"></a>
# **deleteAccount**
> deleteAccount(id)

Delete an Account

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
java.util.UUID id = new java.util.UUID(); // java.util.UUID | id of the Account to delete
try {
    apiInstance.deleteAccount(id);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#deleteAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)| id of the Account to delete |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="findAccount"></a>
# **findAccount**
> AccountResponse findAccount(id)

Find an Account

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
java.util.UUID id = new java.util.UUID(); // java.util.UUID | id of the object
try {
    AccountResponse result = apiInstance.findAccount(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#findAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)| id of the object |

### Return type

[**AccountResponse**](AccountResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findOwnAccount"></a>
# **findOwnAccount**
> AccountResponse findOwnAccount()

Find your Account

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
    AccountResponse result = apiInstance.findOwnAccount();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#findOwnAccount");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AccountResponse**](AccountResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listAccounts"></a>
# **listAccounts**
> AccountsResponse listAccounts(page, pageSize)

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
Integer page = 56; // Integer | Specify the page number (defaults to 1)
Integer pageSize = 56; // Integer | Specify the page_size (defaults to the maximum page size)
try {
    AccountsResponse result = apiInstance.listAccounts(page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#listAccounts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Specify the page number (defaults to 1) | [optional]
 **pageSize** | **Integer**| Specify the page_size (defaults to the maximum page size) | [optional]

### Return type

[**AccountsResponse**](AccountsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateAccount"></a>
# **updateAccount**
> updateAccount(id, account)

Update an Account

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
java.util.UUID id = new java.util.UUID(); // java.util.UUID | id of the object
Account account = new Account(); // Account | Account properties to update
try {
    apiInstance.updateAccount(id, account);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#updateAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)| id of the object |
 **account** | [**Account**](Account.md)| Account properties to update |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

