# SubClaim

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **Object** | Linked to the Sub Claim entity determine the type of sub claim |  [optional]
**payees** | [**List&lt;LegalEntityRef&gt;**](LegalEntityRef.md) | An array of references to the payees (of type [LegalEntity](#legalentity)) of the subclaim |  [optional]
**experts** | [**List&lt;LegalEntityRefOfCompany&gt;**](LegalEntityRefOfCompany.md) | A reference to a [LegalEntity](#legalentity) (of type [Company](#company)) that represents the expert assigned to a subclaim. For example an engineer for motor vehicle accident reconstruction, or private investigator for a personal injury claim |  [optional]
**employers** | [**List&lt;LegalEntityRefOfCompany&gt;**](LegalEntityRefOfCompany.md) | A reference to a [LegalEntity](#legalentity) (of type [Company](#company)) that represents the claimants employer. Used for injury claims where claimant is claiming lost wages for example |  [optional]
**reference** | **String** | The unique identifier of the subclaim | 
**calculateSubScore** | **Boolean** |  |  [optional]
**damageAmount** | **Integer** | The total value of subclaim related object damages |  [optional]
**status** | **Object** | The status of the subclaim |  [optional]
**liability** | **Integer** | The percentage of liability. In case a percentage is unknown and only a yes-no-flag is available, these should be translated to 0 (not liable) or 100 (liable) |  [optional]
**timeReported** | **String** | The time when the accident was reported Validation: Value should be a valid time in a range between 00:00 and 23:59. |  [optional]
**closingDate** | [**OffsetDateTime**](OffsetDateTime.md) | The closing date of the subclaim |  [optional]
**reportedDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date when the subclaim has been reported |  [optional]
**amountPaid** | [**BigDecimal**](BigDecimal.md) | The amount paid for the subclaim |  [optional]
**amountRecovered** | [**BigDecimal**](BigDecimal.md) | The amount recovered from a different party for the subclaim |  [optional]
**amountReserved** | [**BigDecimal**](BigDecimal.md) | The amount reserved for the subclaim |  [optional]
**amountClaimed** | [**BigDecimal**](BigDecimal.md) | The amount claimed for the subclaim |  [optional]
**coverages** | [**List&lt;Coverage&gt;**](Coverage.md) | The coverage that is applied for this subclaim |  [optional]
**damageType** | **String** | The type of damage for the subclaim |  [optional]
**claimant** | **Object** | A reference to a [LegalEntity](#legalentity) (of type [Person](#person) or [Company](#company)) that was the claimant for the subclaim |  [optional]
**customType** | **String** | The internal subclaim type by the insurance company |  [optional]
**cashSettlement** | **Boolean** | Boolean value indicating whether there was a cash settlement for this subclaim |  [optional]
**closedOutcome** | **String** | The reason a subclaim was closed |  [optional]
**reopenDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date at which the subclaim was reopened |  [optional]
**exposureOwners** | **List&lt;String&gt;** | Internal to organization- user name(s) assigned to the subclaim exposure for claims handling |  [optional]
**independentAdjusters** | **List&lt;String&gt;** | External to the organization - independent adjuster assigned to the exposure for claims handling |  [optional]
**discriminator** | **String** |  | 
