
# MessageAck

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**disposition** | [**DispositionEnum**](#DispositionEnum) |  |  [optional]
**errorInfo** | **java.util.Map&lt;String, String&gt;** |  |  [optional]
**activityInfo** | **java.util.Map&lt;String, String&gt;** |  |  [optional]
**params** | **java.util.Map&lt;String, String&gt;** |  |  [optional]


<a name="DispositionEnum"></a>
## Enum: DispositionEnum
Name | Value
---- | -----
SUCCESS | &quot;success&quot;
WARNING | &quot;warning&quot;
ERROR | &quot;error&quot;
RETRY | &quot;retry&quot;



