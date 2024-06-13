/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.27.4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.kubeblocks.apps.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * V1alpha1OpsRequestSpecRebuildFromInnerInstancesInner
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-13T15:59:08.817252Z[Etc/UTC]")
public class V1alpha1OpsRequestSpecRebuildFromInnerInstancesInner {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TARGET_NODE_NAME = "targetNodeName";
  @SerializedName(SERIALIZED_NAME_TARGET_NODE_NAME)
  private String targetNodeName;

  public V1alpha1OpsRequestSpecRebuildFromInnerInstancesInner() {
  }

  public V1alpha1OpsRequestSpecRebuildFromInnerInstancesInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Pod name of the instance.
   * @return name
  **/
  @jakarta.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1alpha1OpsRequestSpecRebuildFromInnerInstancesInner targetNodeName(String targetNodeName) {
    
    this.targetNodeName = targetNodeName;
    return this;
  }

   /**
   * The instance will rebuild on the specified node when the instance uses local PersistentVolume as the storage disk. If not set, it will rebuild on a random node.
   * @return targetNodeName
  **/
  @jakarta.annotation.Nullable
  public String getTargetNodeName() {
    return targetNodeName;
  }


  public void setTargetNodeName(String targetNodeName) {
    this.targetNodeName = targetNodeName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1OpsRequestSpecRebuildFromInnerInstancesInner v1alpha1OpsRequestSpecRebuildFromInnerInstancesInner = (V1alpha1OpsRequestSpecRebuildFromInnerInstancesInner) o;
    return Objects.equals(this.name, v1alpha1OpsRequestSpecRebuildFromInnerInstancesInner.name) &&
        Objects.equals(this.targetNodeName, v1alpha1OpsRequestSpecRebuildFromInnerInstancesInner.targetNodeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, targetNodeName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1OpsRequestSpecRebuildFromInnerInstancesInner {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    targetNodeName: ").append(toIndentedString(targetNodeName)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("name");
    openapiFields.add("targetNodeName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1OpsRequestSpecRebuildFromInnerInstancesInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1OpsRequestSpecRebuildFromInnerInstancesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1OpsRequestSpecRebuildFromInnerInstancesInner is not found in the empty JSON string", V1alpha1OpsRequestSpecRebuildFromInnerInstancesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1OpsRequestSpecRebuildFromInnerInstancesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1OpsRequestSpecRebuildFromInnerInstancesInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha1OpsRequestSpecRebuildFromInnerInstancesInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("targetNodeName") != null && !jsonObj.get("targetNodeName").isJsonNull()) && !jsonObj.get("targetNodeName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `targetNodeName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("targetNodeName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1OpsRequestSpecRebuildFromInnerInstancesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1OpsRequestSpecRebuildFromInnerInstancesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1OpsRequestSpecRebuildFromInnerInstancesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1OpsRequestSpecRebuildFromInnerInstancesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1OpsRequestSpecRebuildFromInnerInstancesInner>() {
           @Override
           public void write(JsonWriter out, V1alpha1OpsRequestSpecRebuildFromInnerInstancesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1OpsRequestSpecRebuildFromInnerInstancesInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1OpsRequestSpecRebuildFromInnerInstancesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1OpsRequestSpecRebuildFromInnerInstancesInner
  * @throws IOException if the JSON string is invalid with respect to V1alpha1OpsRequestSpecRebuildFromInnerInstancesInner
  */
  public static V1alpha1OpsRequestSpecRebuildFromInnerInstancesInner fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1OpsRequestSpecRebuildFromInnerInstancesInner.class);
  }

 /**
  * Convert an instance of V1alpha1OpsRequestSpecRebuildFromInnerInstancesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

