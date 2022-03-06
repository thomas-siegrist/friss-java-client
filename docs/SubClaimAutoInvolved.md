# SubClaimAutoInvolved

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**driver** | **Object** | A reference to a [LegalEntity](#legalentity) (of type [Person](#person)) driving vehicle, mandatory for the SubClaimAutoInvolved |  [optional]
**driverRelationToOwner** | **String** | The relationship of the driver of the vehicle to the owner of the vehicle |  [optional]
**ownerPermissionToDrive** | **Boolean** | Boolean value indicating whether the driver had permission to use the vehicle at the time of the accident |  [optional]
**passengers** | [**List&lt;LegalEntityRefOfPerson&gt;**](LegalEntityRefOfPerson.md) | An list of references to [LegalEntities](#legalentity) (of type [Person](#person)) that were passengers in the vehicle |  [optional]
**reasonForUse** | **String** | The reason for using the vehicle at the time of the accident, as provided by the driver of the vehicle |  [optional]
**vehicle** | **Object** | Represents the involved vehicle of type [Vehicle](#vehicle) |  [optional]
