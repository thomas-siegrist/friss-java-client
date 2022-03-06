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

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
/**
 * Object
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-03-03T11:30:23.717Z[GMT]")

public class Objekt extends AdditionalFieldsBase {
  @SerializedName("owner")
  private LegalEntityRef owner = null;

  @SerializedName("owners")
  private List<LegalEntityRef> owners = null;

  @SerializedName("coverages")
  private List<Coverage> coverages = null;

  @SerializedName("reference")
  private String reference = null;

  @SerializedName("discriminator")
  private String discriminator = null;

  public Objekt() {
    this.discriminator = getClass().getSimpleName();
  }
  public Objekt owner(LegalEntityRef owner) {
    this.owner = owner;
    return this;
  }

   /**
   * [Deprecated]
   * @return owner
  **/
  @Schema(description = "[Deprecated]")
  public LegalEntityRef getOwner() {
    return owner;
  }

  public void setOwner(LegalEntityRef owner) {
    this.owner = owner;
  }

  public Objekt owners(List<LegalEntityRef> owners) {
    this.owners = owners;
    return this;
  }

  public Objekt addOwnersItem(LegalEntityRef ownersItem) {
    if (this.owners == null) {
      this.owners = new ArrayList<LegalEntityRef>();
    }
    this.owners.add(ownersItem);
    return this;
  }

   /**
   * An array of references to [LegalEntity](#LegalEntity) acting as an owner of the Object
   * @return owners
  **/
  @Schema(description = "An array of references to [LegalEntity](#LegalEntity) acting as an owner of the Object")
  public List<LegalEntityRef> getOwners() {
    return owners;
  }

  public void setOwners(List<LegalEntityRef> owners) {
    this.owners = owners;
  }

  public Objekt coverages(List<Coverage> coverages) {
    this.coverages = coverages;
    return this;
  }

  public Objekt addCoveragesItem(Coverage coveragesItem) {
    if (this.coverages == null) {
      this.coverages = new ArrayList<Coverage>();
    }
    this.coverages.add(coveragesItem);
    return this;
  }

   /**
   * an array of type Coverage
   * @return coverages
  **/
  @Schema(description = "an array of type Coverage")
  public List<Coverage> getCoverages() {
    return coverages;
  }

  public void setCoverages(List<Coverage> coverages) {
    this.coverages = coverages;
  }

  public Objekt reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * Get reference
   * @return reference
  **/
  @Schema(description = "")
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public Objekt discriminator(String discriminator) {
    this.discriminator = discriminator;
    return this;
  }

   /**
   * Get discriminator
   * @return discriminator
  **/
  @Schema(required = true, description = "")
  public String getDiscriminator() {
    return discriminator;
  }

  public void setDiscriminator(String discriminator) {
    this.discriminator = discriminator;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Objekt object = (Objekt) o;
    return Objects.equals(this.owner, object.owner) &&
        Objects.equals(this.owners, object.owners) &&
        Objects.equals(this.coverages, object.coverages) &&
        Objects.equals(this.reference, object.reference) &&
        Objects.equals(this.discriminator, object.discriminator) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(owner, owners, coverages, reference, discriminator, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Object {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    owners: ").append(toIndentedString(owners)).append("\n");
    sb.append("    coverages: ").append(toIndentedString(coverages)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    discriminator: ").append(toIndentedString(discriminator)).append("\n");
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
