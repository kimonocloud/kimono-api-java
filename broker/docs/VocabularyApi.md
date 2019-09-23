# VocabularyApi

All URIs are relative to *https://api.us2.kimonocloud.com/v2/broker*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createModel**](VocabularyApi.md#createModel) | **POST** /models | Create Data Models
[**deleteModel**](VocabularyApi.md#deleteModel) | **DELETE** /models/{id} | Delete a Data Model
[**findModel**](VocabularyApi.md#findModel) | **GET** /models/{id} | Get a Data Model by id
[**findVocabulary**](VocabularyApi.md#findVocabulary) | **GET** /vocabulary/{id} | Get a Vocabulary by id
[**listModels**](VocabularyApi.md#listModels) | **GET** /models | List Data Models
[**listVocabularies**](VocabularyApi.md#listVocabularies) | **GET** /vocabularies | List Vocabularies
[**updateModel**](VocabularyApi.md#updateModel) | **PUT** /models/{id} | Update the properties of a Data Model
[**updateVocabulary**](VocabularyApi.md#updateVocabulary) | **PUT** /vocabulary/{id} | Update the properties of a Vocabulary


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

// Configure OAuth2 access token for authorization: Actor
OAuth Actor = (OAuth) defaultClient.getAuthentication("Actor");
Actor.setAccessToken("YOUR ACCESS TOKEN");

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

[Actor](../README.md#Actor)

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

// Configure OAuth2 access token for authorization: Actor
OAuth Actor = (OAuth) defaultClient.getAuthentication("Actor");
Actor.setAccessToken("YOUR ACCESS TOKEN");

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

[Actor](../README.md#Actor)

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

// Configure OAuth2 access token for authorization: Actor
OAuth Actor = (OAuth) defaultClient.getAuthentication("Actor");
Actor.setAccessToken("YOUR ACCESS TOKEN");

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

[Actor](../README.md#Actor)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findVocabulary"></a>
# **findVocabulary**
> ModelsResponse findVocabulary(id)

Get a Vocabulary by id

### Example
```java
// Import classes:
//import kimono.api.v2.broker.ApiClient;
//import kimono.api.v2.broker.ApiException;
//import kimono.api.v2.broker.Configuration;
//import kimono.api.v2.broker.auth.*;
//import kimono.api.v2.broker.VocabularyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: Actor
OAuth Actor = (OAuth) defaultClient.getAuthentication("Actor");
Actor.setAccessToken("YOUR ACCESS TOKEN");

VocabularyApi apiInstance = new VocabularyApi();
java.util.UUID id = new java.util.UUID(); // java.util.UUID | id of the Vocabulary to find
try {
    ModelsResponse result = apiInstance.findVocabulary(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VocabularyApi#findVocabulary");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)| id of the Vocabulary to find |

### Return type

[**ModelsResponse**](ModelsResponse.md)

### Authorization

[Actor](../README.md#Actor)

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

// Configure OAuth2 access token for authorization: Actor
OAuth Actor = (OAuth) defaultClient.getAuthentication("Actor");
Actor.setAccessToken("YOUR ACCESS TOKEN");

VocabularyApi apiInstance = new VocabularyApi();
Integer page = 56; // Integer | Specify the page number (defaults to 0)
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
 **page** | **Integer**| Specify the page number (defaults to 0) | [optional]
 **pageSize** | **Integer**| Specify the page_size (defaults to the maximum page size) | [optional]

### Return type

[**ModelsResponse**](ModelsResponse.md)

### Authorization

[Actor](../README.md#Actor)

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

// Configure OAuth2 access token for authorization: Actor
OAuth Actor = (OAuth) defaultClient.getAuthentication("Actor");
Actor.setAccessToken("YOUR ACCESS TOKEN");

VocabularyApi apiInstance = new VocabularyApi();
Integer page = 56; // Integer | Specify the page number (defaults to 0)
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
 **page** | **Integer**| Specify the page number (defaults to 0) | [optional]
 **pageSize** | **Integer**| Specify the page_size (defaults to the maximum page size) | [optional]

### Return type

[**VocabularysResponse**](VocabularysResponse.md)

### Authorization

[Actor](../README.md#Actor)

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

// Configure OAuth2 access token for authorization: Actor
OAuth Actor = (OAuth) defaultClient.getAuthentication("Actor");
Actor.setAccessToken("YOUR ACCESS TOKEN");

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

[Actor](../README.md#Actor)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateVocabulary"></a>
# **updateVocabulary**
> VocabularysResponse updateVocabulary(id)

Update the properties of a Vocabulary

### Example
```java
// Import classes:
//import kimono.api.v2.broker.ApiClient;
//import kimono.api.v2.broker.ApiException;
//import kimono.api.v2.broker.Configuration;
//import kimono.api.v2.broker.auth.*;
//import kimono.api.v2.broker.VocabularyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: Actor
OAuth Actor = (OAuth) defaultClient.getAuthentication("Actor");
Actor.setAccessToken("YOUR ACCESS TOKEN");

VocabularyApi apiInstance = new VocabularyApi();
java.util.UUID id = new java.util.UUID(); // java.util.UUID | id of the Vocabulary
try {
    VocabularysResponse result = apiInstance.updateVocabulary(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VocabularyApi#updateVocabulary");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)| id of the Vocabulary |

### Return type

[**VocabularysResponse**](VocabularysResponse.md)

### Authorization

[Actor](../README.md#Actor)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

