
# Summary

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**$section** | [**GradesRefType**](GradesRefType.md) |  |  [optional]
**$person** | [**GradesRefType**](GradesRefType.md) |  |  [optional]
**$grader** | [**GradesRefType**](GradesRefType.md) |  |  [optional]
**summaryType** | [**SummaryTypeEnum**](#SummaryTypeEnum) |  |  [optional]
**scoreType** | [**ScoreTypeEnum**](#ScoreTypeEnum) |  |  [optional]
**score** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**grade** | **String** |  |  [optional]
**lastActivity** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**comments** | **java.util.List&lt;String&gt;** |  |  [optional]
**$ext** | **java.util.Map&lt;String, String&gt;** |  |  [optional]


<a name="SummaryTypeEnum"></a>
## Enum: SummaryTypeEnum
Name | Value
---- | -----
MIDTERM | &quot;midterm&quot;
FINAL | &quot;final&quot;


<a name="ScoreTypeEnum"></a>
## Enum: ScoreTypeEnum
Name | Value
---- | -----
RAW | &quot;raw&quot;
PERCENTAGE | &quot;percentage&quot;



