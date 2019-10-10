/*
 * Interop API
 * Interop APIs provide access to Kimono Interop Cloud resources and operations
 *
 * OpenAPI spec version: 2.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package kimono.api.v2.interop.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets ActorType
 */
@JsonAdapter(ActorType.Adapter.class)
public enum ActorType {
  
  CONNECTOR("connector"),
  
  INTEGRATION("integration"),
  
  REPOSITORY("repository"),
  
  APPLICATION("application");

  private String value;

  ActorType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ActorType fromValue(String text) {
    for (ActorType b : ActorType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }

  public static class Adapter extends TypeAdapter<ActorType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ActorType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ActorType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ActorType.fromValue(String.valueOf(value));
    }
  }
}
