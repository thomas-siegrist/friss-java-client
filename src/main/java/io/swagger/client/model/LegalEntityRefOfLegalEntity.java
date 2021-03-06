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
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.AdditionalFieldsBase;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.List;
import java.util.Map;
/**
 * LegalEntityRefOfLegalEntity
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-03-03T11:30:23.717Z[GMT]")
public class LegalEntityRefOfLegalEntity extends AdditionalFieldsBase {
  @SerializedName("reference")
  private String reference = null;

  public LegalEntityRefOfLegalEntity reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * A reference to a [Legal Entity](#legalentity)
   * @return reference
  **/
  @Schema(description = "A reference to a [Legal Entity](#legalentity)")
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LegalEntityRefOfLegalEntity legalEntityRefOfLegalEntity = (LegalEntityRefOfLegalEntity) o;
    return Objects.equals(this.reference, legalEntityRefOfLegalEntity.reference) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reference, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LegalEntityRefOfLegalEntity {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
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
