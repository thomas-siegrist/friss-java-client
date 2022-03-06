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
import io.swagger.client.model.BankAccount;
import io.swagger.client.model.Contact;
import io.swagger.client.model.Identification;
import io.swagger.client.model.LegalEntity;
import io.swagger.client.model.LegalEntityRef;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.List;
/**
 * Company
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-03-03T11:30:23.717Z[GMT]")
public class Company extends LegalEntity {
  @SerializedName("name")
  private String name = null;

  @SerializedName("legalForm")
  private String legalForm = null;

  public Company name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The (trade) name of the company
   * @return name
  **/
  @Schema(description = "The (trade) name of the company")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Company legalForm(String legalForm) {
    this.legalForm = legalForm;
    return this;
  }

   /**
   * The legal form of the company
   * @return legalForm
  **/
  @Schema(description = "The legal form of the company")
  public String getLegalForm() {
    return legalForm;
  }

  public void setLegalForm(String legalForm) {
    this.legalForm = legalForm;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Company company = (Company) o;
    return Objects.equals(this.name, company.name) &&
        Objects.equals(this.legalForm, company.legalForm) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, legalForm, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Company {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    legalForm: ").append(toIndentedString(legalForm)).append("\n");
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
