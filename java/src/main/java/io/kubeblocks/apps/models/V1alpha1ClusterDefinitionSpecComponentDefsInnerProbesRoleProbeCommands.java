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
import java.util.ArrayList;
import java.util.List;

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
 * commands used to execute for probe.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T10:01:20.252122Z[Etc/UTC]")
public class V1alpha1ClusterDefinitionSpecComponentDefsInnerProbesRoleProbeCommands {
  public static final String SERIALIZED_NAME_QUERIES = "queries";
  @SerializedName(SERIALIZED_NAME_QUERIES)
  private List<String> queries;

  public static final String SERIALIZED_NAME_WRITES = "writes";
  @SerializedName(SERIALIZED_NAME_WRITES)
  private List<String> writes;

  public V1alpha1ClusterDefinitionSpecComponentDefsInnerProbesRoleProbeCommands() {
  }

  public V1alpha1ClusterDefinitionSpecComponentDefsInnerProbesRoleProbeCommands queries(List<String> queries) {
    
    this.queries = queries;
    return this;
  }

  public V1alpha1ClusterDefinitionSpecComponentDefsInnerProbesRoleProbeCommands addQueriesItem(String queriesItem) {
    if (this.queries == null) {
      this.queries = new ArrayList<>();
    }
    this.queries.add(queriesItem);
    return this;
  }

   /**
   * Read check executed on probe sidecar, used to check workload&#39;s readonly access.
   * @return queries
  **/
  @jakarta.annotation.Nullable
  public List<String> getQueries() {
    return queries;
  }


  public void setQueries(List<String> queries) {
    this.queries = queries;
  }


  public V1alpha1ClusterDefinitionSpecComponentDefsInnerProbesRoleProbeCommands writes(List<String> writes) {
    
    this.writes = writes;
    return this;
  }

  public V1alpha1ClusterDefinitionSpecComponentDefsInnerProbesRoleProbeCommands addWritesItem(String writesItem) {
    if (this.writes == null) {
      this.writes = new ArrayList<>();
    }
    this.writes.add(writesItem);
    return this;
  }

   /**
   * Write check executed on probe sidecar, used to check workload&#39;s allow write access.
   * @return writes
  **/
  @jakarta.annotation.Nullable
  public List<String> getWrites() {
    return writes;
  }


  public void setWrites(List<String> writes) {
    this.writes = writes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ClusterDefinitionSpecComponentDefsInnerProbesRoleProbeCommands v1alpha1ClusterDefinitionSpecComponentDefsInnerProbesRoleProbeCommands = (V1alpha1ClusterDefinitionSpecComponentDefsInnerProbesRoleProbeCommands) o;
    return Objects.equals(this.queries, v1alpha1ClusterDefinitionSpecComponentDefsInnerProbesRoleProbeCommands.queries) &&
        Objects.equals(this.writes, v1alpha1ClusterDefinitionSpecComponentDefsInnerProbesRoleProbeCommands.writes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queries, writes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ClusterDefinitionSpecComponentDefsInnerProbesRoleProbeCommands {\n");
    sb.append("    queries: ").append(toIndentedString(queries)).append("\n");
    sb.append("    writes: ").append(toIndentedString(writes)).append("\n");
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
    openapiFields.add("queries");
    openapiFields.add("writes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1ClusterDefinitionSpecComponentDefsInnerProbesRoleProbeCommands
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1ClusterDefinitionSpecComponentDefsInnerProbesRoleProbeCommands.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1ClusterDefinitionSpecComponentDefsInnerProbesRoleProbeCommands is not found in the empty JSON string", V1alpha1ClusterDefinitionSpecComponentDefsInnerProbesRoleProbeCommands.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1ClusterDefinitionSpecComponentDefsInnerProbesRoleProbeCommands.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1ClusterDefinitionSpecComponentDefsInnerProbesRoleProbeCommands` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("queries") != null && !jsonObj.get("queries").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `queries` to be an array in the JSON string but got `%s`", jsonObj.get("queries").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("writes") != null && !jsonObj.get("writes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `writes` to be an array in the JSON string but got `%s`", jsonObj.get("writes").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1ClusterDefinitionSpecComponentDefsInnerProbesRoleProbeCommands.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1ClusterDefinitionSpecComponentDefsInnerProbesRoleProbeCommands' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1ClusterDefinitionSpecComponentDefsInnerProbesRoleProbeCommands> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1ClusterDefinitionSpecComponentDefsInnerProbesRoleProbeCommands.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1ClusterDefinitionSpecComponentDefsInnerProbesRoleProbeCommands>() {
           @Override
           public void write(JsonWriter out, V1alpha1ClusterDefinitionSpecComponentDefsInnerProbesRoleProbeCommands value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1ClusterDefinitionSpecComponentDefsInnerProbesRoleProbeCommands read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1ClusterDefinitionSpecComponentDefsInnerProbesRoleProbeCommands given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1ClusterDefinitionSpecComponentDefsInnerProbesRoleProbeCommands
  * @throws IOException if the JSON string is invalid with respect to V1alpha1ClusterDefinitionSpecComponentDefsInnerProbesRoleProbeCommands
  */
  public static V1alpha1ClusterDefinitionSpecComponentDefsInnerProbesRoleProbeCommands fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1ClusterDefinitionSpecComponentDefsInnerProbesRoleProbeCommands.class);
  }

 /**
  * Convert an instance of V1alpha1ClusterDefinitionSpecComponentDefsInnerProbesRoleProbeCommands to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}
