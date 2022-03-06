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
 * Gets or Sets PropertyUsage
 */
@JsonAdapter(PropertyUsage.Adapter.class)
public enum PropertyUsage {
  PERSONAL("Personal"),
  COMMERCIAL("Commercial"),
  PUBLIC("Public");

  private String value;

  PropertyUsage(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PropertyUsage fromValue(String input) {
    for (PropertyUsage b : PropertyUsage.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<PropertyUsage> {
    @Override
    public void write(final JsonWriter jsonWriter, final PropertyUsage enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public PropertyUsage read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PropertyUsage.fromValue((String)(value));
    }
  }
}
