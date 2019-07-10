# MessagesApi

All URIs are relative to *http://localhost/v2/broker*

Method | HTTP request | Description
------------- | ------------- | -------------
[**acknowledgeMessage**](MessagesApi.md#acknowledgeMessage) | **PUT** /messages/{id}/ack | Acknowledge Message
[**listMessages**](MessagesApi.md#listMessages) | **GET** /messages | List Messages
[**sendMessage**](MessagesApi.md#sendMessage) | **POST** /messages | Send Message


<a name="acknowledgeMessage"></a>
# **acknowledgeMessage**
> acknowledgeMessage(id, messageAck)

Acknowledge Message

Each Message that is returned from &#x60;listMessages&#x60; must be acknowledged to remove it from the Message Queue. If a Message is not acknowledged in a timely fashion Kimono may consider it to have timed-out and will return it in the next &#x60;listMessages&#x60; response for an actor. See [Messages](doc:broker-api-messages) for details.

### Example
```java
// Import classes:
//import kimono.api.v2.broker.ApiClient;
//import kimono.api.v2.broker.ApiException;
//import kimono.api.v2.broker.Configuration;
//import kimono.api.v2.broker.auth.*;
//import kimono.api.v2.broker.MessagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

MessagesApi apiInstance = new MessagesApi();
java.util.UUID id = new java.util.UUID(); // java.util.UUID | id of the Message to acknowledge
MessageAck messageAck = new MessageAck(); // MessageAck | Parameters describing how to acknowledge the Message
try {
    apiInstance.acknowledgeMessage(id, messageAck);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagesApi#acknowledgeMessage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)| id of the Message to acknowledge |
 **messageAck** | [**MessageAck**](MessageAck.md)| Parameters describing how to acknowledge the Message | [optional]

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="listMessages"></a>
# **listMessages**
> java.util.List&lt;Message&gt; listMessages(page, pageSize)

List Messages

Get the next batch of Messages for the authenticated actor. The number of Messages returned is determined by Kimono and may change from time to time. See [Messages](doc:broker-api-messages) for details.

### Example
```java
// Import classes:
//import kimono.api.v2.broker.ApiClient;
//import kimono.api.v2.broker.ApiException;
//import kimono.api.v2.broker.Configuration;
//import kimono.api.v2.broker.auth.*;
//import kimono.api.v2.broker.MessagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

MessagesApi apiInstance = new MessagesApi();
Integer page = 56; // Integer | Specify the page number (defaults to 1)
Integer pageSize = 56; // Integer | Specify the page_size (defaults to the maximum page size)
try {
    java.util.List<Message> result = apiInstance.listMessages(page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagesApi#listMessages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Specify the page number (defaults to 1) | [optional]
 **pageSize** | **Integer**| Specify the page_size (defaults to the maximum page size) | [optional]

### Return type

[**java.util.List&lt;Message&gt;**](Message.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sendMessage"></a>
# **sendMessage**
> MessageResponse sendMessage(message)

Send Message

Send a Message

### Example
```java
// Import classes:
//import kimono.api.v2.broker.ApiClient;
//import kimono.api.v2.broker.ApiException;
//import kimono.api.v2.broker.Configuration;
//import kimono.api.v2.broker.auth.*;
//import kimono.api.v2.broker.MessagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

MessagesApi apiInstance = new MessagesApi();
Message message = new Message(); // Message | The JSON-encoded Message to send
try {
    MessageResponse result = apiInstance.sendMessage(message);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagesApi#sendMessage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **message** | [**Message**](Message.md)| The JSON-encoded Message to send |

### Return type

[**MessageResponse**](MessageResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

