# SubClaimAutoDamage

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**vehicle** | **Object** | Represents the damaged vehicle of type [Vehicle](#vehicle) |  [optional]
**repairer** | **Object** | A reference to a [LegalEntity](#legalentity) (of type [Company](#company)) responsible for repairing the vehicle |  [optional]
**surveyor** | **Object** | A reference to a [LegalEntity](#legalentity) (of type [Person](#person)) responsible for surveying the vehicle |  [optional]
**driver** | **Object** | A reference to a [LegalEntity](#legalentity) (of type [Person](#person)) driving vehicle, mandatory for the SubClaimAutoDamage |  [optional]
**passengers** | [**List&lt;LegalEntityRefOfPerson&gt;**](LegalEntityRefOfPerson.md) | An list of references to [LegalEntities](#legalentity) (of type [Person](#person)) that were passengers in the vehicle |  [optional]
**damageList** | **List&lt;String&gt;** | A list of damages to the object |  [optional]
**reasonForUse** | **String** | The reason for using the vehicle at the time of the accident, as provided by the driver of the vehicle |  [optional]
**driverRelationToOwner** | **String** | The relationship of the driver of the vehicle to the owner of the vehicle |  [optional]
**ownerPermissionToDrive** | **Boolean** | Boolean value indicating whether the driver had permission to use the vehicle at the time of the accident |  [optional]
**towingAgency** | **Object** | A reference to a [LegalEntity](#LegalEntity) (of type [Company](#company)) responsible for towing the vehicle |  [optional]
