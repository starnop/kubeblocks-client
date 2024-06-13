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
 * Executes expressions regularly, based on the value of PeriodSeconds, to determine if the action has been completed.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-13T15:59:08.817252Z[Etc/UTC]")
public class V1alpha1OpsDefinitionSpecActionsInnerResourceModifierCompletionProbeMatchExpressions {
  public static final String SERIALIZED_NAME_FAILURE = "failure";
  @SerializedName(SERIALIZED_NAME_FAILURE)
  private String failure;

  public static final String SERIALIZED_NAME_SUCCESS = "success";
  @SerializedName(SERIALIZED_NAME_SUCCESS)
  private String success;

  public V1alpha1OpsDefinitionSpecActionsInnerResourceModifierCompletionProbeMatchExpressions() {
  }

  public V1alpha1OpsDefinitionSpecActionsInnerResourceModifierCompletionProbeMatchExpressions failure(String failure) {
    
    this.failure = failure;
    return this;
  }

   /**
   * Specifies a failure condition for an action using a Go template expression. Should evaluate to either &#x60;true&#x60; or &#x60;false&#x60;. The current resource object is parsed into the Go template. for example, you can use &#39;{{ eq .spec.replicas 1 }}&#39;.
   * @return failure
  **/
  @jakarta.annotation.Nullable
  public String getFailure() {
    return failure;
  }


  public void setFailure(String failure) {
    this.failure = failure;
  }


  public V1alpha1OpsDefinitionSpecActionsInnerResourceModifierCompletionProbeMatchExpressions success(String success) {
    
    this.success = success;
    return this;
  }

   /**
   * Specifies a success condition for an action using a Go template expression. Should evaluate to either &#x60;true&#x60; or &#x60;false&#x60;. The current resource object is parsed into the Go template. for example, using &#39;{{ eq .spec.replicas 1 }}&#39;
   * @return success
  **/
  @jakarta.annotation.Nonnull
  public String getSuccess() {
    return success;
  }


  public void setSuccess(String success) {
    this.success = success;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1OpsDefinitionSpecActionsInnerResourceModifierCompletionProbeMatchExpressions v1alpha1OpsDefinitionSpecActionsInnerResourceModifierCompletionProbeMatchExpressions = (V1alpha1OpsDefinitionSpecActionsInnerResourceModifierCompletionProbeMatchExpressions) o;
    return Objects.equals(this.failure, v1alpha1OpsDefinitionSpecActionsInnerResourceModifierCompletionProbeMatchExpressions.failure) &&
        Objects.equals(this.success, v1alpha1OpsDefinitionSpecActionsInnerResourceModifierCompletionProbeMatchExpressions.success);
  }

  @Override
  public int hashCode() {
    return Objects.hash(failure, success);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1OpsDefinitionSpecActionsInnerResourceModifierCompletionProbeMatchExpressions {\n");
    sb.append("    failure: ").append(toIndentedString(failure)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
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
    openapiFields.add("failure");
    openapiFields.add("success");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("success");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1OpsDefinitionSpecActionsInnerResourceModifierCompletionProbeMatchExpressions
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1OpsDefinitionSpecActionsInnerResourceModifierCompletionProbeMatchExpressions.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1OpsDefinitionSpecActionsInnerResourceModifierCompletionProbeMatchExpressions is not found in the empty JSON string", V1alpha1OpsDefinitionSpecActionsInnerResourceModifierCompletionProbeMatchExpressions.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1OpsDefinitionSpecActionsInnerResourceModifierCompletionProbeMatchExpressions.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1OpsDefinitionSpecActionsInnerResourceModifierCompletionProbeMatchExpressions` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha1OpsDefinitionSpecActionsInnerResourceModifierCompletionProbeMatchExpressions.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("failure") != null && !jsonObj.get("failure").isJsonNull()) && !jsonObj.get("failure").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `failure` to be a primitive type in the JSON string but got `%s`", jsonObj.get("failure").toString()));
      }
      if (!jsonObj.get("success").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `success` to be a primitive type in the JSON string but got `%s`", jsonObj.get("success").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1OpsDefinitionSpecActionsInnerResourceModifierCompletionProbeMatchExpressions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1OpsDefinitionSpecActionsInnerResourceModifierCompletionProbeMatchExpressions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1OpsDefinitionSpecActionsInnerResourceModifierCompletionProbeMatchExpressions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1OpsDefinitionSpecActionsInnerResourceModifierCompletionProbeMatchExpressions.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1OpsDefinitionSpecActionsInnerResourceModifierCompletionProbeMatchExpressions>() {
           @Override
           public void write(JsonWriter out, V1alpha1OpsDefinitionSpecActionsInnerResourceModifierCompletionProbeMatchExpressions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1OpsDefinitionSpecActionsInnerResourceModifierCompletionProbeMatchExpressions read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1OpsDefinitionSpecActionsInnerResourceModifierCompletionProbeMatchExpressions given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1OpsDefinitionSpecActionsInnerResourceModifierCompletionProbeMatchExpressions
  * @throws IOException if the JSON string is invalid with respect to V1alpha1OpsDefinitionSpecActionsInnerResourceModifierCompletionProbeMatchExpressions
  */
  public static V1alpha1OpsDefinitionSpecActionsInnerResourceModifierCompletionProbeMatchExpressions fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1OpsDefinitionSpecActionsInnerResourceModifierCompletionProbeMatchExpressions.class);
  }

 /**
  * Convert an instance of V1alpha1OpsDefinitionSpecActionsInnerResourceModifierCompletionProbeMatchExpressions to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

