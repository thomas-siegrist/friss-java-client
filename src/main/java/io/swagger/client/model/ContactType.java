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

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets ContactType
 */
@JsonAdapter(ContactType.Adapter.class)
public enum ContactType {
  EMAIL("Email"),
  MOBILE("Mobile"),
  PHONE("Phone"),
  FAX("Fax"),
  OTHER("Other");

  private String value;

  ContactType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ContactType fromValue(String input) {
    for (ContactType b : ContactType.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ContactType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ContactType enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public ContactType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ContactType.fromValue((String)(value));
    }
  }
}
