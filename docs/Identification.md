# Identification

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **Object** | The type of identification, according to the value list [IdentificationType](#identificationtype) |  [optional]
**value** | **String** | The identification number |  [optional]
**expiryDate** | [**OffsetDateTime**](OffsetDateTime.md) | The expiration date of the idenfication Validation: Date if not empty must be in a range between +-150 years from now. |  [optional]
