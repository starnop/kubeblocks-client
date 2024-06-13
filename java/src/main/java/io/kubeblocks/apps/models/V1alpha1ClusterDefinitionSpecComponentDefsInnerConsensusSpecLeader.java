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
 * Represents a single leader in the consensus set.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-13T15:59:08.817252Z[Etc/UTC]")
public class V1alpha1ClusterDefinitionSpecComponentDefsInnerConsensusSpecLeader {
  /**
   * Specifies the services that this member is capable of providing.
   */
  @JsonAdapter(AccessModeEnum.Adapter.class)
  public enum AccessModeEnum {
    NONE("None"),
    
    READONLY("Readonly"),
    
    READWRITE("ReadWrite");

    private String value;

    AccessModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AccessModeEnum fromValue(String value) {
      for (AccessModeEnum b : AccessModeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AccessModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AccessModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AccessModeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AccessModeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ACCESS_MODE = "accessMode";
  @SerializedName(SERIALIZED_NAME_ACCESS_MODE)
  private AccessModeEnum accessMode;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_REPLICAS = "replicas";
  @SerializedName(SERIALIZED_NAME_REPLICAS)
  private Integer replicas;

  public V1alpha1ClusterDefinitionSpecComponentDefsInnerConsensusSpecLeader() {
  }

  public V1alpha1ClusterDefinitionSpecComponentDefsInnerConsensusSpecLeader accessMode(AccessModeEnum accessMode) {
    
    this.accessMode = accessMode;
    return this;
  }

   /**
   * Specifies the services that this member is capable of providing.
   * @return accessMode
  **/
  @jakarta.annotation.Nonnull
  public AccessModeEnum getAccessMode() {
    return accessMode;
  }


  public void setAccessMode(AccessModeEnum accessMode) {
    this.accessMode = accessMode;
  }


  public V1alpha1ClusterDefinitionSpecComponentDefsInnerConsensusSpecLeader name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Specifies the name of the consensus member.
   * @return name
  **/
  @jakarta.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1alpha1ClusterDefinitionSpecComponentDefsInnerConsensusSpecLeader replicas(Integer replicas) {
    
    this.replicas = replicas;
    return this;
  }

   /**
   * Indicates the number of Pods that perform this role. The default is 1 for &#x60;Leader&#x60;, 0 for &#x60;Learner&#x60;, others for &#x60;Followers&#x60;.
   * minimum: 0
   * @return replicas
  **/
  @jakarta.annotation.Nullable
  public Integer getReplicas() {
    return replicas;
  }


  public void setReplicas(Integer replicas) {
    this.replicas = replicas;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ClusterDefinitionSpecComponentDefsInnerConsensusSpecLeader v1alpha1ClusterDefinitionSpecComponentDefsInnerConsensusSpecLeader = (V1alpha1ClusterDefinitionSpecComponentDefsInnerConsensusSpecLeader) o;
    return Objects.equals(this.accessMode, v1alpha1ClusterDefinitionSpecComponentDefsInnerConsensusSpecLeader.accessMode) &&
        Objects.equals(this.name, v1alpha1ClusterDefinitionSpecComponentDefsInnerConsensusSpecLeader.name) &&
        Objects.equals(this.replicas, v1alpha1ClusterDefinitionSpecComponentDefsInnerConsensusSpecLeader.replicas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessMode, name, replicas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ClusterDefinitionSpecComponentDefsInnerConsensusSpecLeader {\n");
    sb.append("    accessMode: ").append(toIndentedString(accessMode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
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
    openapiFields.add("accessMode");
    openapiFields.add("name");
    openapiFields.add("replicas");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("accessMode");
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1ClusterDefinitionSpecComponentDefsInnerConsensusSpecLeader
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1ClusterDefinitionSpecComponentDefsInnerConsensusSpecLeader.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1ClusterDefinitionSpecComponentDefsInnerConsensusSpecLeader is not found in the empty JSON string", V1alpha1ClusterDefinitionSpecComponentDefsInnerConsensusSpecLeader.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1ClusterDefinitionSpecComponentDefsInnerConsensusSpecLeader.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1ClusterDefinitionSpecComponentDefsInnerConsensusSpecLeader` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha1ClusterDefinitionSpecComponentDefsInnerConsensusSpecLeader.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("accessMode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accessMode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accessMode").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1ClusterDefinitionSpecComponentDefsInnerConsensusSpecLeader.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1ClusterDefinitionSpecComponentDefsInnerConsensusSpecLeader' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1ClusterDefinitionSpecComponentDefsInnerConsensusSpecLeader> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1ClusterDefinitionSpecComponentDefsInnerConsensusSpecLeader.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1ClusterDefinitionSpecComponentDefsInnerConsensusSpecLeader>() {
           @Override
           public void write(JsonWriter out, V1alpha1ClusterDefinitionSpecComponentDefsInnerConsensusSpecLeader value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1ClusterDefinitionSpecComponentDefsInnerConsensusSpecLeader read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1ClusterDefinitionSpecComponentDefsInnerConsensusSpecLeader given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1ClusterDefinitionSpecComponentDefsInnerConsensusSpecLeader
  * @throws IOException if the JSON string is invalid with respect to V1alpha1ClusterDefinitionSpecComponentDefsInnerConsensusSpecLeader
  */
  public static V1alpha1ClusterDefinitionSpecComponentDefsInnerConsensusSpecLeader fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1ClusterDefinitionSpecComponentDefsInnerConsensusSpecLeader.class);
  }

 /**
  * Convert an instance of V1alpha1ClusterDefinitionSpecComponentDefsInnerConsensusSpecLeader to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

