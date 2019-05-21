
# TaskAck

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**StatusEnum**](#StatusEnum) | Task processing status |  [optional]
**message** | **String** | Optional message to record and display in Kimono. |  [optional]
**error** | [**ErrorType**](ErrorType.md) |  |  [optional]
**params** | **java.util.Map&lt;String, String&gt;** | Optional key/value pairs to record in Kimono. Some Task types prescribe parameters be returned when a Task is acknowledged. |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
SUCCESS | &quot;success&quot;
ERROR | &quot;error&quot;
RETRY | &quot;retry&quot;
REAUTHENTICATE | &quot;reauthenticate&quot;



