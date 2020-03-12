
# ExchangeQueryConditions

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scope** | [**ScopeEnum**](#ScopeEnum) |  |  [optional]
**scopeBy** | [**ScopeByEnum**](#ScopeByEnum) |  |  [optional]
**scopeId** | [**GradesRefType**](GradesRefType.md) |  |  [optional]
**gradedAfter** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**summaryType** | [**SummaryTypeEnum**](#SummaryTypeEnum) |  |  [optional]


<a name="ScopeEnum"></a>
## Enum: ScopeEnum
Name | Value
---- | -----
COURSE | &quot;course&quot;
SECTION | &quot;section&quot;


<a name="ScopeByEnum"></a>
## Enum: ScopeByEnum
Name | Value
---- | -----
ID | &quot;id&quot;
ALL | &quot;all&quot;


<a name="SummaryTypeEnum"></a>
## Enum: SummaryTypeEnum
Name | Value
---- | -----
FINAL | &quot;final&quot;
MIDTERM | &quot;midterm&quot;



