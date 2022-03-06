# Person

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**firstName** | **String** | The first name(s) |  [optional]
**lastName** | **String** | The surname or family name |  [optional]
**fullName** | **String** | The first name(s) and family name(s) combined |  [optional]
**initials** | **String** | The initials, stripped from all additional characters such as points, commas and dashes |  [optional]
**gender** | **String** | The gender of the person |  [optional]
**prefix** | **String** | The title before a person&#x27;s name |  [optional]
**birthCountryCode** | **String** | The country code, according to the [ISO 3166-2](https://www.iso.org/obp/ui/#search/code/) or [ISO 3166-3](https://www.iso.org/obp/ui/#search/code/) standards Validation: Country code must be either in the ISO2 or ISO3 format. |  [optional]
**nationality** | **String** | The nationality of the person |  [optional]
**birthDate** | [**OffsetDateTime**](OffsetDateTime.md) | The birth date of the person Validation: Date if not empty must be in a range between +-150 years from now. |  [optional]
**occupation** | **Object** | The category of occupation, according to the value list [Occupation](#occupation) |  [optional]
**fraudRegistration** | **Boolean** | Boolean value indicating whether the person is registered in an internal or external fraud register |  [optional]
**numberOfActivePolicies** | **Integer** | The number of active policies at the insurance company |  [optional]
**maritalStatus** | **Object** | The marital status of the person |  [optional]
**numberOfCancellations** | **Integer** | The number of policy cancellations known at the insurance company Validation: Person number of cancellations must be greater than 0 |  [optional]
**claimIntoxication** | **Boolean** | Boolean value indicating whether the person was under the influence of alcohol or drugs during the claim |  [optional]
