# VocabularyApi

All URIs are relative to *https://api.us2.kimonocloud.com/v2/broker*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createModel**](VocabularyApi.md#createModel) | **POST** /models | Create Data Models
[**deleteModel**](VocabularyApi.md#deleteModel) | **DELETE** /models/{id} | Delete a Data Model
[**findModel**](VocabularyApi.md#findModel) | **GET** /models/{id} | Get a Data Model by id
[**findModel_0**](VocabularyApi.md#findModel_0) | **GET** /vocabulary/{id} | Get a Data Model by id
[**listModels**](VocabularyApi.md#listModels) | **GET** /models | List Data Models
[**listVocabularies**](VocabularyApi.md#listVocabularies) | **GET** /vocabularies | List Vocabularies
[**updateModel**](VocabularyApi.md#updateModel) | **PUT** /models/{id} | Update the properties of a Data Model
[**updateModel_0**](VocabularyApi.md#updateModel_0) | **PUT** /vocabulary/{id} | Update the properties of a Data Model


<a name="createModel"></a>
# **createModel**
> ModelsResponse createModel()

Create Data Models

Create a Data Model

### Example
```java
// Import classes:
//import kimono.api.v2.broker.ApiClient;
//import kimono.api.v2.broker.ApiException;
//import kimono.api.v2.broker.Configuration;
//import kimono.api.v2.broker.auth.*;
//import kimono.api.v2.broker.VocabularyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

VocabularyApi apiInstance = new VocabularyApi();
try {
    ModelsResponse result = apiInstance.createModel();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VocabularyApi#createModel");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ModelsResponse**](ModelsResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteModel"></a>
# **deleteModel**
> deleteModel(id)

Delete a Data Model

### Example
```java
// Import classes:
//import kimono.api.v2.broker.ApiClient;
//import kimono.api.v2.broker.ApiException;
//import kimono.api.v2.broker.Configuration;
//import kimono.api.v2.broker.auth.*;
//import kimono.api.v2.broker.VocabularyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

VocabularyApi apiInstance = new VocabularyApi();
java.util.UUID id = new java.util.UUID(); // java.util.UUID | id of the Model
try {
    apiInstance.deleteModel(id);
} catch (ApiException e) {
    System.err.println("Exception when calling VocabularyApi#deleteModel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)| id of the Model |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="findModel"></a>
# **findModel**
> Model findModel(id)

Get a Data Model by id

### Example
```java
// Import classes:
//import kimono.api.v2.broker.ApiClient;
//import kimono.api.v2.broker.ApiException;
//import kimono.api.v2.broker.Configuration;
//import kimono.api.v2.broker.auth.*;
//import kimono.api.v2.broker.VocabularyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

VocabularyApi apiInstance = new VocabularyApi();
java.util.UUID id = new java.util.UUID(); // java.util.UUID | id of the Model to find
try {
    Model result = apiInstance.findModel(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VocabularyApi#findModel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)| id of the Model to find |

### Return type

[**Model**](Model.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findModel_0"></a>
# **findModel_0**
> ModelsResponse findModel_0(id)

Get a Data Model by id

### Example
```java
// Import classes:
//import kimono.api.v2.broker.ApiClient;
//import kimono.api.v2.broker.ApiException;
//import kimono.api.v2.broker.Configuration;
//import kimono.api.v2.broker.auth.*;
//import kimono.api.v2.broker.VocabularyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

VocabularyApi apiInstance = new VocabularyApi();
java.util.UUID id = new java.util.UUID(); // java.util.UUID | id of the Model to find
try {
    ModelsResponse result = apiInstance.findModel_0(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VocabularyApi#findModel_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)| id of the Model to find |

### Return type

[**ModelsResponse**](ModelsResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listModels"></a>
# **listModels**
> ModelsResponse listModels(page, pageSize)

List Data Models

Get a list of all defined Data Models

### Example
```java
// Import classes:
//import kimono.api.v2.broker.ApiClient;
//import kimono.api.v2.broker.ApiException;
//import kimono.api.v2.broker.Configuration;
//import kimono.api.v2.broker.auth.*;
//import kimono.api.v2.broker.VocabularyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

VocabularyApi apiInstance = new VocabularyApi();
Integer page = 56; // Integer | Specify the page number (defaults to 1)
Integer pageSize = 56; // Integer | Specify the page_size (defaults to the maximum page size)
try {
    ModelsResponse result = apiInstance.listModels(page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VocabularyApi#listModels");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Specify the page number (defaults to 1) | [optional]
 **pageSize** | **Integer**| Specify the page_size (defaults to the maximum page size) | [optional]

### Return type

[**ModelsResponse**](ModelsResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVocabularies"></a>
# **listVocabularies**
> VocabularysResponse listVocabularies(page, pageSize)

List Vocabularies

Get a list of all defined Vocabularies

### Example
```java
// Import classes:
//import kimono.api.v2.broker.ApiClient;
//import kimono.api.v2.broker.ApiException;
//import kimono.api.v2.broker.Configuration;
//import kimono.api.v2.broker.auth.*;
//import kimono.api.v2.broker.VocabularyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

VocabularyApi apiInstance = new VocabularyApi();
Integer page = 56; // Integer | Specify the page number (defaults to 1)
Integer pageSize = 56; // Integer | Specify the page_size (defaults to the maximum page size)
try {
    VocabularysResponse result = apiInstance.listVocabularies(page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VocabularyApi#listVocabularies");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Specify the page number (defaults to 1) | [optional]
 **pageSize** | **Integer**| Specify the page_size (defaults to the maximum page size) | [optional]

### Return type

[**VocabularysResponse**](VocabularysResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateModel"></a>
# **updateModel**
> Model updateModel(id)

Update the properties of a Data Model

### Example
```java
// Import classes:
//import kimono.api.v2.broker.ApiClient;
//import kimono.api.v2.broker.ApiException;
//import kimono.api.v2.broker.Configuration;
//import kimono.api.v2.broker.auth.*;
//import kimono.api.v2.broker.VocabularyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

VocabularyApi apiInstance = new VocabularyApi();
java.util.UUID id = new java.util.UUID(); // java.util.UUID | id of the Model
try {
    Model result = apiInstance.updateModel(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VocabularyApi#updateModel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)| id of the Model |

### Return type

[**Model**](Model.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateModel_0"></a>
# **updateModel_0**
> ModelsResponse updateModel_0(id)

Update the properties of a Data Model

### Example
```java
// Import classes:
//import kimono.api.v2.broker.ApiClient;
//import kimono.api.v2.broker.ApiException;
//import kimono.api.v2.broker.Configuration;
//import kimono.api.v2.broker.auth.*;
//import kimono.api.v2.broker.VocabularyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

VocabularyApi apiInstance = new VocabularyApi();
java.util.UUID id = new java.util.UUID(); // java.util.UUID | id of the Model
try {
    ModelsResponse result = apiInstance.updateModel_0(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VocabularyApi#updateModel_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)| id of the Model |

### Return type

[**ModelsResponse**](ModelsResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

