# LegalEntity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**referenceId** | **String** |  |  [optional]
**contacts** | [**List&lt;Contact&gt;**](Contact.md) | An array of contact information objects of a Legal Entity |  [optional]
**identifications** | [**List&lt;Identification&gt;**](Identification.md) | An array of identifications of a Legal Entity |  [optional]
**bankAccounts** | [**List&lt;BankAccount&gt;**](BankAccount.md) | An array of bank accounts of a Legal Entity |  [optional]
**address** | **Object** | The address of the LegalEntity |  [optional]
**lawyer** | **Object** | [Deprecated] |  [optional]
**lawyers** | [**List&lt;LegalEntityRef&gt;**](LegalEntityRef.md) | An array of references to [LegalEntity](#LegalEntity) acting as a lawyer of the LegalEntity |  [optional]
**discriminator** | **String** |  | 
