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

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * SubClaimContentDamage
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-03-03T11:30:23.717Z[GMT]")
public class SubClaimContentDamage extends SubClaim {
  @SerializedName("property")
  private Objekt property = null;

  @SerializedName("claimedItems")
  private Map<String, BigDecimal> claimedItems = null;

  @SerializedName("personRef")
  private String personRef = null;

  @SerializedName("damageList")
  private List<String> damageList = null;

  public SubClaimContentDamage property(Objekt property) {
    this.property = property;
    return this;
  }

   /**
   * The property, of type [Property](#property) where the contents were damaged
   * @return property
  **/
  @Schema(description = "The property, of type [Property](#property) where the contents were damaged")
  public Objekt getProperty() {
    return property;
  }

  public void setProperty(Objekt property) {
    this.property = property;
  }

  public SubClaimContentDamage claimedItems(Map<String, BigDecimal> claimedItems) {
    this.claimedItems = claimedItems;
    return this;
  }

  public SubClaimContentDamage putClaimedItemsItem(String key, BigDecimal claimedItemsItem) {
    if (this.claimedItems == null) {
      this.claimedItems = new HashMap<String, BigDecimal>();
    }
    this.claimedItems.put(key, claimedItemsItem);
    return this;
  }

   /**
   * A dictionary of claimed items (defined as String) and their value (defined as Decimal)
   * @return claimedItems
  **/
  @Schema(description = "A dictionary of claimed items (defined as String) and their value (defined as Decimal)")
  public Map<String, BigDecimal> getClaimedItems() {
    return claimedItems;
  }

  public void setClaimedItems(Map<String, BigDecimal> claimedItems) {
    this.claimedItems = claimedItems;
  }

  public SubClaimContentDamage personRef(String personRef) {
    this.personRef = personRef;
    return this;
  }

   /**
   * Get personRef
   * @return personRef
  **/
  @Schema(description = "")
  public String getPersonRef() {
    return personRef;
  }

  public void setPersonRef(String personRef) {
    this.personRef = personRef;
  }

  public SubClaimContentDamage damageList(List<String> damageList) {
    this.damageList = damageList;
    return this;
  }

  public SubClaimContentDamage addDamageListItem(String damageListItem) {
    if (this.damageList == null) {
      this.damageList = new ArrayList<String>();
    }
    this.damageList.add(damageListItem);
    return this;
  }

   /**
   * A list of damages to the object
   * @return damageList
  **/
  @Schema(description = "A list of damages to the object")
  public List<String> getDamageList() {
    return damageList;
  }

  public void setDamageList(List<String> damageList) {
    this.damageList = damageList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubClaimContentDamage subClaimContentDamage = (SubClaimContentDamage) o;
    return Objects.equals(this.property, subClaimContentDamage.property) &&
        Objects.equals(this.claimedItems, subClaimContentDamage.claimedItems) &&
        Objects.equals(this.personRef, subClaimContentDamage.personRef) &&
        Objects.equals(this.damageList, subClaimContentDamage.damageList) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(property, claimedItems, personRef, damageList, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubClaimContentDamage {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
    sb.append("    claimedItems: ").append(toIndentedString(claimedItems)).append("\n");
    sb.append("    personRef: ").append(toIndentedString(personRef)).append("\n");
    sb.append("    damageList: ").append(toIndentedString(damageList)).append("\n");
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