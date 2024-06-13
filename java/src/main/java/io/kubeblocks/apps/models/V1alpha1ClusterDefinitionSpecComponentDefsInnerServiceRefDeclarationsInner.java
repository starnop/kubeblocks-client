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
import io.kubeblocks.apps.models.V1alpha1ClusterDefinitionSpecComponentDefsInnerServiceRefDeclarationsInnerServiceRefDeclarationSpecsInner;
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
 * ServiceRefDeclaration represents a reference to a service that can be either provided by a KubeBlocks Cluster or an external service. It acts as a placeholder for the actual service reference, which is determined later when a Cluster is created.   The purpose of ServiceRefDeclaration is to declare a service dependency without specifying the concrete details of the service. It allows for flexibility and abstraction in defining service references within a Component. By using ServiceRefDeclaration, you can define service dependencies in a declarative manner, enabling loose coupling and easier management of service references across different components and clusters.   Upon Cluster creation, the ServiceRefDeclaration is bound to an actual service through the ServiceRef field, effectively resolving and connecting to the specified service.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-13T15:59:08.817252Z[Etc/UTC]")
public class V1alpha1ClusterDefinitionSpecComponentDefsInnerServiceRefDeclarationsInner {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OPTIONAL = "optional";
  @SerializedName(SERIALIZED_NAME_OPTIONAL)
  private Boolean optional;

  public static final String SERIALIZED_NAME_SERVICE_REF_DECLARATION_SPECS = "serviceRefDeclarationSpecs";
  @SerializedName(SERIALIZED_NAME_SERVICE_REF_DECLARATION_SPECS)
  private List<V1alpha1ClusterDefinitionSpecComponentDefsInnerServiceRefDeclarationsInnerServiceRefDeclarationSpecsInner> serviceRefDeclarationSpecs = new ArrayList<>();

  public V1alpha1ClusterDefinitionSpecComponentDefsInnerServiceRefDeclarationsInner() {
  }

  public V1alpha1ClusterDefinitionSpecComponentDefsInnerServiceRefDeclarationsInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Specifies the name of the ServiceRefDeclaration.
   * @return name
  **/
  @jakarta.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1alpha1ClusterDefinitionSpecComponentDefsInnerServiceRefDeclarationsInner optional(Boolean optional) {
    
    this.optional = optional;
    return this;
  }

   /**
   * Specifies whether the service reference can be optional.   For an optional service-ref, the component can still be created even if the service-ref is not provided.
   * @return optional
  **/
  @jakarta.annotation.Nullable
  public Boolean getOptional() {
    return optional;
  }


  public void setOptional(Boolean optional) {
    this.optional = optional;
  }


  public V1alpha1ClusterDefinitionSpecComponentDefsInnerServiceRefDeclarationsInner serviceRefDeclarationSpecs(List<V1alpha1ClusterDefinitionSpecComponentDefsInnerServiceRefDeclarationsInnerServiceRefDeclarationSpecsInner> serviceRefDeclarationSpecs) {
    
    this.serviceRefDeclarationSpecs = serviceRefDeclarationSpecs;
    return this;
  }

  public V1alpha1ClusterDefinitionSpecComponentDefsInnerServiceRefDeclarationsInner addServiceRefDeclarationSpecsItem(V1alpha1ClusterDefinitionSpecComponentDefsInnerServiceRefDeclarationsInnerServiceRefDeclarationSpecsInner serviceRefDeclarationSpecsItem) {
    if (this.serviceRefDeclarationSpecs == null) {
      this.serviceRefDeclarationSpecs = new ArrayList<>();
    }
    this.serviceRefDeclarationSpecs.add(serviceRefDeclarationSpecsItem);
    return this;
  }

   /**
   * Defines a list of constraints and requirements for services that can be bound to this ServiceRefDeclaration upon Cluster creation. Each ServiceRefDeclarationSpec defines a ServiceKind and ServiceVersion, outlining the acceptable service types and versions that are compatible.   This flexibility allows a ServiceRefDeclaration to be fulfilled by any one of the provided specs. For example, if it requires an OLTP database, specs for both MySQL and PostgreSQL are listed, either MySQL or PostgreSQL services can be used when binding.
   * @return serviceRefDeclarationSpecs
  **/
  @jakarta.annotation.Nonnull
  public List<V1alpha1ClusterDefinitionSpecComponentDefsInnerServiceRefDeclarationsInnerServiceRefDeclarationSpecsInner> getServiceRefDeclarationSpecs() {
    return serviceRefDeclarationSpecs;
  }


  public void setServiceRefDeclarationSpecs(List<V1alpha1ClusterDefinitionSpecComponentDefsInnerServiceRefDeclarationsInnerServiceRefDeclarationSpecsInner> serviceRefDeclarationSpecs) {
    this.serviceRefDeclarationSpecs = serviceRefDeclarationSpecs;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ClusterDefinitionSpecComponentDefsInnerServiceRefDeclarationsInner v1alpha1ClusterDefinitionSpecComponentDefsInnerServiceRefDeclarationsInner = (V1alpha1ClusterDefinitionSpecComponentDefsInnerServiceRefDeclarationsInner) o;
    return Objects.equals(this.name, v1alpha1ClusterDefinitionSpecComponentDefsInnerServiceRefDeclarationsInner.name) &&
        Objects.equals(this.optional, v1alpha1ClusterDefinitionSpecComponentDefsInnerServiceRefDeclarationsInner.optional) &&
        Objects.equals(this.serviceRefDeclarationSpecs, v1alpha1ClusterDefinitionSpecComponentDefsInnerServiceRefDeclarationsInner.serviceRefDeclarationSpecs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, optional, serviceRefDeclarationSpecs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ClusterDefinitionSpecComponentDefsInnerServiceRefDeclarationsInner {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    optional: ").append(toIndentedString(optional)).append("\n");
    sb.append("    serviceRefDeclarationSpecs: ").append(toIndentedString(serviceRefDeclarationSpecs)).append("\n");
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
    openapiFields.add("optional");
    openapiFields.add("serviceRefDeclarationSpecs");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("serviceRefDeclarationSpecs");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1ClusterDefinitionSpecComponentDefsInnerServiceRefDeclarationsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1ClusterDefinitionSpecComponentDefsInnerServiceRefDeclarationsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1ClusterDefinitionSpecComponentDefsInnerServiceRefDeclarationsInner is not found in the empty JSON string", V1alpha1ClusterDefinitionSpecComponentDefsInnerServiceRefDeclarationsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1ClusterDefinitionSpecComponentDefsInnerServiceRefDeclarationsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1ClusterDefinitionSpecComponentDefsInnerServiceRefDeclarationsInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha1ClusterDefinitionSpecComponentDefsInnerServiceRefDeclarationsInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("serviceRefDeclarationSpecs").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `serviceRefDeclarationSpecs` to be an array in the JSON string but got `%s`", jsonObj.get("serviceRefDeclarationSpecs").toString()));
      }

      JsonArray jsonArrayserviceRefDeclarationSpecs = jsonObj.getAsJsonArray("serviceRefDeclarationSpecs");
      // validate the required field `serviceRefDeclarationSpecs` (array)
      for (int i = 0; i < jsonArrayserviceRefDeclarationSpecs.size(); i++) {
        V1alpha1ClusterDefinitionSpecComponentDefsInnerServiceRefDeclarationsInnerServiceRefDeclarationSpecsInner.validateJsonObject(jsonArrayserviceRefDeclarationSpecs.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1ClusterDefinitionSpecComponentDefsInnerServiceRefDeclarationsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1ClusterDefinitionSpecComponentDefsInnerServiceRefDeclarationsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1ClusterDefinitionSpecComponentDefsInnerServiceRefDeclarationsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1ClusterDefinitionSpecComponentDefsInnerServiceRefDeclarationsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1ClusterDefinitionSpecComponentDefsInnerServiceRefDeclarationsInner>() {
           @Override
           public void write(JsonWriter out, V1alpha1ClusterDefinitionSpecComponentDefsInnerServiceRefDeclarationsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1ClusterDefinitionSpecComponentDefsInnerServiceRefDeclarationsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1ClusterDefinitionSpecComponentDefsInnerServiceRefDeclarationsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1ClusterDefinitionSpecComponentDefsInnerServiceRefDeclarationsInner
  * @throws IOException if the JSON string is invalid with respect to V1alpha1ClusterDefinitionSpecComponentDefsInnerServiceRefDeclarationsInner
  */
  public static V1alpha1ClusterDefinitionSpecComponentDefsInnerServiceRefDeclarationsInner fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1ClusterDefinitionSpecComponentDefsInnerServiceRefDeclarationsInner.class);
  }

 /**
  * Convert an instance of V1alpha1ClusterDefinitionSpecComponentDefsInnerServiceRefDeclarationsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

