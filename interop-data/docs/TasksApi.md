# TasksApi

All URIs are relative to *http://localhost:5016/v2/interop/data*

Method | HTTP request | Description
------------- | ------------- | -------------
[**acknowledgeTask**](TasksApi.md#acknowledgeTask) | **PUT** /tasks/{id}/ack | Acknowledge Task
[**listTasks**](TasksApi.md#listTasks) | **GET** /tasks | List Tasks


<a name="acknowledgeTask"></a>
# **acknowledgeTask**
> acknowledgeTask(id, taskAck)

Acknowledge Task

Each Task that is returned from &#x60;listTasks&#x60; must be acknowledged to remove it from the Task Queue. If a Task is not acknowledged in a timely fashion Kimono may consider it to have timed-out and will return it in the next &#x60;listTasks&#x60; response for an Integration tenant. See [Tasks](doc:interop-data-api-tasks) for details.

### Example
```java
// Import classes:
//import kimono.api.v2.interopdata.ApiClient;
//import kimono.api.v2.interopdata.ApiException;
//import kimono.api.v2.interopdata.Configuration;
//import kimono.api.v2.interopdata.auth.*;
//import kimono.api.v2.interopdata.TasksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

TasksApi apiInstance = new TasksApi();
java.util.UUID id = new java.util.UUID(); // java.util.UUID | id of the Task to acknowledge
TaskAck taskAck = new TaskAck(); // TaskAck | Parameters describing how to acknowledge the Task
try {
    apiInstance.acknowledgeTask(id, taskAck);
} catch (ApiException e) {
    System.err.println("Exception when calling TasksApi#acknowledgeTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)| id of the Task to acknowledge |
 **taskAck** | [**TaskAck**](TaskAck.md)| Parameters describing how to acknowledge the Task | [optional]

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="listTasks"></a>
# **listTasks**
> TasksResponse listTasks(page, pageSize)

List Tasks

Get the next batch of Tasks for the authenticated actor. The number of Tasks returned is determined by Kimono and may change from time to time. See [Tasks](doc:interop-data-api-tasks) for details.

### Example
```java
// Import classes:
//import kimono.api.v2.interopdata.ApiClient;
//import kimono.api.v2.interopdata.ApiException;
//import kimono.api.v2.interopdata.Configuration;
//import kimono.api.v2.interopdata.auth.*;
//import kimono.api.v2.interopdata.TasksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

TasksApi apiInstance = new TasksApi();
Integer page = 56; // Integer | Specify the page number (defaults to 1)
Integer pageSize = 56; // Integer | Specify the page_size (defaults to the maximum page size)
try {
    TasksResponse result = apiInstance.listTasks(page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TasksApi#listTasks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Specify the page number (defaults to 1) | [optional]
 **pageSize** | **Integer**| Specify the page_size (defaults to the maximum page size) | [optional]

### Return type

[**TasksResponse**](TasksResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

