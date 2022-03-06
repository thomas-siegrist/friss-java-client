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

/**
 * GeneralLiabilityPrivatePolicy
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-03-03T11:30:23.717Z[GMT]")
public class GeneralLiabilityPrivatePolicy extends Policy {
  @SerializedName("familyComposition")
  private Objekt familyComposition = null;

  public GeneralLiabilityPrivatePolicy familyComposition(Objekt familyComposition) {
    this.familyComposition = familyComposition;
    return this;
  }

   /**
   * The family composition for the people that live in the same household
   * @return familyComposition
  **/
  @Schema(description = "The family composition for the people that live in the same household")
  public Objekt getFamilyComposition() {
    return familyComposition;
  }

  public void setFamilyComposition(Objekt familyComposition) {
    this.familyComposition = familyComposition;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeneralLiabilityPrivatePolicy generalLiabilityPrivatePolicy = (GeneralLiabilityPrivatePolicy) o;
    return Objects.equals(this.familyComposition, generalLiabilityPrivatePolicy.familyComposition) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(familyComposition, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeneralLiabilityPrivatePolicy {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    familyComposition: ").append(toIndentedString(familyComposition)).append("\n");
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
