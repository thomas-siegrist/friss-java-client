# SubClaimAccidentBenefit

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**injuredPerson** | **Object** | A reference to a [Legal Entity](#legalentity) (of type [Person](#person)) injured in the event |  [optional]
**icdStandard** | **Object** | The ICD standard that is used, according to the value list [ICDStandard](#icdstandard) |  [optional]
**icdCodes** | **List&lt;String&gt;** | The ICD code standard diagnostic codes of the injury |  [optional]
**bodyparts** | **List&lt;String&gt;** | A list of bodyparts that are injured in the subclaim |  [optional]
**injuryDescription** | **String** | A description of the injury and possible treatments |  [optional]
**severity** | **Object** | Severity of the injuries, according to the value list [SubClaimInjurySeverity](#subclaiminjuryseverity) |  [optional]
**ambulanceUsed** | **Boolean** | Boolean value indicating whether an ambulance was involved in the injury |  [optional]
**lostWages** | **Boolean** | Boolean value indicating whether the injured person lost wages |  [optional]
**receivedTreatment** | **Boolean** | Boolean value indicating whether the injured person received treatment for the injuries |  [optional]
**disabled** | **Boolean** | Boolean value indicating whether the injured person was disabled due to the accident |  [optional]
**medicalProviders** | [**List&lt;LegalEntityRef&gt;**](LegalEntityRef.md) | An list of references to [LegalEntities](#legalentity) (of type [Company](#company)) that were medical providers in the diagnosis or treatment of the injury |  [optional]
**treatmentDescription** | **String** | A free text field to describe the treatment. Used when ICD or CPT codes are not available, or as additional information. |  [optional]
**cptCodes** | **List&lt;String&gt;** | Applicable for USA only. A list of CPT codes according to the standard by the [American Medial Association](#https://www.ama-assn.org/practice-management/cpt) |  [optional]
