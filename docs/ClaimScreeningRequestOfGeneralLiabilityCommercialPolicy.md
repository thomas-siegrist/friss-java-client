# ClaimScreeningRequestOfGeneralLiabilityCommercialPolicy

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**parties** | [**Map&lt;String, LegalEntity&gt;**](LegalEntity.md) | The parties entity, with a reference assigned to each legal entity in the claim. These references are used in the claim entity to define relations between the parties | 
**claim** | **Object** | The claim entity, with a policy and sub-claims. Here it is possible to assign roles to the parties previously defined | 
**branch** | **String** | The branch to which the insurance claim applies |  [optional]
**label** | **String** | The reference to the requesting insurance company or label |  [optional]
**process** | **String** | A system parameter for defining the process from which a call to FRISS has been initiated. |  [optional]
**externalSource** | **String** |  |  [optional]
**externalScore** | **Boolean** |  |  [optional]
**contactUserId** | **Object** | The user ID of the assigned contact |  [optional]
