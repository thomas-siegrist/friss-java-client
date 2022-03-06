/*
 * FRISS API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.ArrayList;
import java.util.List;

/**
 * SubClaimAccidentBenefit
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-03-03T11:30:23.717Z[GMT]")
public class SubClaimAccidentBenefit extends SubClaim {
  @SerializedName("injuredPerson")
  private Objekt injuredPerson = null;

  @SerializedName("icdStandard")
  private Objekt icdStandard = null;

  @SerializedName("icdCodes")
  private List<String> icdCodes = null;

  @SerializedName("bodyparts")
  private List<String> bodyparts = null;

  @SerializedName("injuryDescription")
  private String injuryDescription = null;

  @SerializedName("severity")
  private Objekt severity = null;

  @SerializedName("ambulanceUsed")
  private Boolean ambulanceUsed = null;

  @SerializedName("lostWages")
  private Boolean lostWages = null;

  @SerializedName("receivedTreatment")
  private Boolean receivedTreatment = null;

  @SerializedName("disabled")
  private Boolean disabled = null;

  @SerializedName("medicalProviders")
  private List<LegalEntityRef> medicalProviders = null;

  @SerializedName("treatmentDescription")
  private String treatmentDescription = null;

  @SerializedName("cptCodes")
  private List<String> cptCodes = null;

  public SubClaimAccidentBenefit injuredPerson(Objekt injuredPerson) {
    this.injuredPerson = injuredPerson;
    return this;
  }

   /**
   * A reference to a [Legal Entity](#legalentity) (of type [Person](#person)) injured in the event
   * @return injuredPerson
  **/
  @Schema(description = "A reference to a [Legal Entity](#legalentity) (of type [Person](#person)) injured in the event")
  public Objekt getInjuredPerson() {
    return injuredPerson;
  }

  public void setInjuredPerson(Objekt injuredPerson) {
    this.injuredPerson = injuredPerson;
  }

  public SubClaimAccidentBenefit icdStandard(Objekt icdStandard) {
    this.icdStandard = icdStandard;
    return this;
  }

   /**
   * The ICD standard that is used, according to the value list [ICDStandard](#icdstandard)
   * @return icdStandard
  **/
  @Schema(description = "The ICD standard that is used, according to the value list [ICDStandard](#icdstandard)")
  public Objekt getIcdStandard() {
    return icdStandard;
  }

  public void setIcdStandard(Objekt icdStandard) {
    this.icdStandard = icdStandard;
  }

  public SubClaimAccidentBenefit icdCodes(List<String> icdCodes) {
    this.icdCodes = icdCodes;
    return this;
  }

  public SubClaimAccidentBenefit addIcdCodesItem(String icdCodesItem) {
    if (this.icdCodes == null) {
      this.icdCodes = new ArrayList<String>();
    }
    this.icdCodes.add(icdCodesItem);
    return this;
  }

   /**
   * The ICD code standard diagnostic codes of the injury
   * @return icdCodes
  **/
  @Schema(description = "The ICD code standard diagnostic codes of the injury")
  public List<String> getIcdCodes() {
    return icdCodes;
  }

  public void setIcdCodes(List<String> icdCodes) {
    this.icdCodes = icdCodes;
  }

  public SubClaimAccidentBenefit bodyparts(List<String> bodyparts) {
    this.bodyparts = bodyparts;
    return this;
  }

  public SubClaimAccidentBenefit addBodypartsItem(String bodypartsItem) {
    if (this.bodyparts == null) {
      this.bodyparts = new ArrayList<String>();
    }
    this.bodyparts.add(bodypartsItem);
    return this;
  }

   /**
   * A list of bodyparts that are injured in the subclaim
   * @return bodyparts
  **/
  @Schema(description = "A list of bodyparts that are injured in the subclaim")
  public List<String> getBodyparts() {
    return bodyparts;
  }

  public void setBodyparts(List<String> bodyparts) {
    this.bodyparts = bodyparts;
  }

  public SubClaimAccidentBenefit injuryDescription(String injuryDescription) {
    this.injuryDescription = injuryDescription;
    return this;
  }

   /**
   * A description of the injury and possible treatments
   * @return injuryDescription
  **/
  @Schema(description = "A description of the injury and possible treatments")
  public String getInjuryDescription() {
    return injuryDescription;
  }

  public void setInjuryDescription(String injuryDescription) {
    this.injuryDescription = injuryDescription;
  }

  public SubClaimAccidentBenefit severity(Objekt severity) {
    this.severity = severity;
    return this;
  }

   /**
   * Severity of the injuries, according to the value list [SubClaimInjurySeverity](#subclaiminjuryseverity)
   * @return severity
  **/
  @Schema(description = "Severity of the injuries, according to the value list [SubClaimInjurySeverity](#subclaiminjuryseverity)")
  public Objekt getSeverity() {
    return severity;
  }

  public void setSeverity(Objekt severity) {
    this.severity = severity;
  }

  public SubClaimAccidentBenefit ambulanceUsed(Boolean ambulanceUsed) {
    this.ambulanceUsed = ambulanceUsed;
    return this;
  }

   /**
   * Boolean value indicating whether an ambulance was involved in the injury
   * @return ambulanceUsed
  **/
  @Schema(description = "Boolean value indicating whether an ambulance was involved in the injury")
  public Boolean isAmbulanceUsed() {
    return ambulanceUsed;
  }

  public void setAmbulanceUsed(Boolean ambulanceUsed) {
    this.ambulanceUsed = ambulanceUsed;
  }

  public SubClaimAccidentBenefit lostWages(Boolean lostWages) {
    this.lostWages = lostWages;
    return this;
  }

   /**
   * Boolean value indicating whether the injured person lost wages
   * @return lostWages
  **/
  @Schema(description = "Boolean value indicating whether the injured person lost wages")
  public Boolean isLostWages() {
    return lostWages;
  }

  public void setLostWages(Boolean lostWages) {
    this.lostWages = lostWages;
  }

  public SubClaimAccidentBenefit receivedTreatment(Boolean receivedTreatment) {
    this.receivedTreatment = receivedTreatment;
    return this;
  }

   /**
   * Boolean value indicating whether the injured person received treatment for the injuries
   * @return receivedTreatment
  **/
  @Schema(description = "Boolean value indicating whether the injured person received treatment for the injuries")
  public Boolean isReceivedTreatment() {
    return receivedTreatment;
  }

  public void setReceivedTreatment(Boolean receivedTreatment) {
    this.receivedTreatment = receivedTreatment;
  }

  public SubClaimAccidentBenefit disabled(Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

   /**
   * Boolean value indicating whether the injured person was disabled due to the accident
   * @return disabled
  **/
  @Schema(description = "Boolean value indicating whether the injured person was disabled due to the accident")
  public Boolean isDisabled() {
    return disabled;
  }

  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }

  public SubClaimAccidentBenefit medicalProviders(List<LegalEntityRef> medicalProviders) {
    this.medicalProviders = medicalProviders;
    return this;
  }

  public SubClaimAccidentBenefit addMedicalProvidersItem(LegalEntityRef medicalProvidersItem) {
    if (this.medicalProviders == null) {
      this.medicalProviders = new ArrayList<LegalEntityRef>();
    }
    this.medicalProviders.add(medicalProvidersItem);
    return this;
  }

   /**
   * An list of references to [LegalEntities](#legalentity) (of type [Company](#company)) that were medical providers in the diagnosis or treatment of the injury
   * @return medicalProviders
  **/
  @Schema(description = "An list of references to [LegalEntities](#legalentity) (of type [Company](#company)) that were medical providers in the diagnosis or treatment of the injury")
  public List<LegalEntityRef> getMedicalProviders() {
    return medicalProviders;
  }

  public void setMedicalProviders(List<LegalEntityRef> medicalProviders) {
    this.medicalProviders = medicalProviders;
  }

  public SubClaimAccidentBenefit treatmentDescription(String treatmentDescription) {
    this.treatmentDescription = treatmentDescription;
    return this;
  }

   /**
   * A free text field to describe the treatment. Used when ICD or CPT codes are not available, or as additional information.
   * @return treatmentDescription
  **/
  @Schema(description = "A free text field to describe the treatment. Used when ICD or CPT codes are not available, or as additional information.")
  public String getTreatmentDescription() {
    return treatmentDescription;
  }

  public void setTreatmentDescription(String treatmentDescription) {
    this.treatmentDescription = treatmentDescription;
  }

  public SubClaimAccidentBenefit cptCodes(List<String> cptCodes) {
    this.cptCodes = cptCodes;
    return this;
  }

  public SubClaimAccidentBenefit addCptCodesItem(String cptCodesItem) {
    if (this.cptCodes == null) {
      this.cptCodes = new ArrayList<String>();
    }
    this.cptCodes.add(cptCodesItem);
    return this;
  }

   /**
   * Applicable for USA only. A list of CPT codes according to the standard by the [American Medial Association](#https://www.ama-assn.org/practice-management/cpt)
   * @return cptCodes
  **/
  @Schema(description = "Applicable for USA only. A list of CPT codes according to the standard by the [American Medial Association](#https://www.ama-assn.org/practice-management/cpt)")
  public List<String> getCptCodes() {
    return cptCodes;
  }

  public void setCptCodes(List<String> cptCodes) {
    this.cptCodes = cptCodes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubClaimAccidentBenefit subClaimAccidentBenefit = (SubClaimAccidentBenefit) o;
    return Objects.equals(this.injuredPerson, subClaimAccidentBenefit.injuredPerson) &&
        Objects.equals(this.icdStandard, subClaimAccidentBenefit.icdStandard) &&
        Objects.equals(this.icdCodes, subClaimAccidentBenefit.icdCodes) &&
        Objects.equals(this.bodyparts, subClaimAccidentBenefit.bodyparts) &&
        Objects.equals(this.injuryDescription, subClaimAccidentBenefit.injuryDescription) &&
        Objects.equals(this.severity, subClaimAccidentBenefit.severity) &&
        Objects.equals(this.ambulanceUsed, subClaimAccidentBenefit.ambulanceUsed) &&
        Objects.equals(this.lostWages, subClaimAccidentBenefit.lostWages) &&
        Objects.equals(this.receivedTreatment, subClaimAccidentBenefit.receivedTreatment) &&
        Objects.equals(this.disabled, subClaimAccidentBenefit.disabled) &&
        Objects.equals(this.medicalProviders, subClaimAccidentBenefit.medicalProviders) &&
        Objects.equals(this.treatmentDescription, subClaimAccidentBenefit.treatmentDescription) &&
        Objects.equals(this.cptCodes, subClaimAccidentBenefit.cptCodes) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(injuredPerson, icdStandard, icdCodes, bodyparts, injuryDescription, severity, ambulanceUsed, lostWages, receivedTreatment, disabled, medicalProviders, treatmentDescription, cptCodes, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubClaimAccidentBenefit {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    injuredPerson: ").append(toIndentedString(injuredPerson)).append("\n");
    sb.append("    icdStandard: ").append(toIndentedString(icdStandard)).append("\n");
    sb.append("    icdCodes: ").append(toIndentedString(icdCodes)).append("\n");
    sb.append("    bodyparts: ").append(toIndentedString(bodyparts)).append("\n");
    sb.append("    injuryDescription: ").append(toIndentedString(injuryDescription)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    ambulanceUsed: ").append(toIndentedString(ambulanceUsed)).append("\n");
    sb.append("    lostWages: ").append(toIndentedString(lostWages)).append("\n");
    sb.append("    receivedTreatment: ").append(toIndentedString(receivedTreatment)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    medicalProviders: ").append(toIndentedString(medicalProviders)).append("\n");
    sb.append("    treatmentDescription: ").append(toIndentedString(treatmentDescription)).append("\n");
    sb.append("    cptCodes: ").append(toIndentedString(cptCodes)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
