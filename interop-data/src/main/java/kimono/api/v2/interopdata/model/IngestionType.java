/*
 * Interop Data API
 * Interop Data APIs provide access to the data objects and events from Interop Cloud repositories and Integration repositories
 *
 * OpenAPI spec version: 2.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package kimono.api.v2.interopdata.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets IngestionType
 */
@JsonAdapter(IngestionType.Adapter.class)
public enum IngestionType {
  
  UNSPECIFIED("unspecified"),
  
  COLLECTION("collection"),
  
  BULK_LOAD("bulk_load"),
  
  EVENT_BUNDLE("event_bundle"),
  
  BULK_ATTR_CHANGE("bulk_attr_change"),
  
  MIRROR("mirror");

  private String value;

  IngestionType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static IngestionType fromValue(String text) {
    for (IngestionType b : IngestionType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }

  public static class Adapter extends TypeAdapter<IngestionType> {
    @Override
    public void write(final JsonWriter jsonWriter, final IngestionType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public IngestionType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return IngestionType.fromValue(String.valueOf(value));
    }
  }
}

