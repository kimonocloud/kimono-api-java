
# ExchangeError

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**code** | [**CodeEnum**](#CodeEnum) |  |  [optional]
**message** | **String** |  |  [optional]
**details** | **String** |  |  [optional]


<a name="CodeEnum"></a>
## Enum: CodeEnum
Name | Value
---- | -----
QUERY_TYPE_NOT_SUPPORTED | &quot;query_type_not_supported&quot;
QUERY_CONDITIONS_NOT_SUPPORTED | &quot;query_conditions_not_supported&quot;
PRODUCER_ERROR | &quot;producer_error&quot;
PRODUCER_FAILURE | &quot;producer_failure&quot;



