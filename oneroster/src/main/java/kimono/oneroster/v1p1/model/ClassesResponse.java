/*
 * OneRoster 1.1
 * OneRoster 1.1. API
 *
 * OpenAPI spec version: 2.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package kimono.oneroster.v1p1.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import kimono.oneroster.v1p1.model.ModelClass;

/**
 * ClassesResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-10T14:18:38.309-06:00[America/Denver]")
public class ClassesResponse {
  public static final String SERIALIZED_NAME_CLASSES = "classes";
  @SerializedName(SERIALIZED_NAME_CLASSES)
  private java.util.List<ModelClass> classes = null;

  public ClassesResponse classes(java.util.List<ModelClass> classes) {
    this.classes = classes;
    return this;
  }

  public ClassesResponse addClassesItem(ModelClass classesItem) {
    if (this.classes == null) {
      this.classes = new java.util.ArrayList<>();
    }
    this.classes.add(classesItem);
    return this;
  }

   /**
   * Get classes
   * @return classes
  **/
  @ApiModelProperty(value = "")
  public java.util.List<ModelClass> getClasses() {
    return classes;
  }

  public void setClasses(java.util.List<ModelClass> classes) {
    this.classes = classes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClassesResponse classesResponse = (ClassesResponse) o;
    return Objects.equals(this.classes, classesResponse.classes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClassesResponse {\n");
    
    sb.append("    classes: ").append(toIndentedString(classes)).append("\n");
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

