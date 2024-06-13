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
import io.kubeblocks.apps.models.V1alpha1ComponentDefinitionSpecLifecycleActionsAccountProvisionCustomHandler;
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
 * Defines the procedure to add a new replica to the replication group.   This action is initiated after a replica pod becomes ready.   The role of the replica (e.g., primary, secondary) will be determined and assigned as part of the action command implementation, or automatically by the database kernel or a sidecar utility like Patroni that implements a consensus algorithm.   The container executing this action has access to following environment variables:   - KB_SERVICE_PORT: The port used by the database service. - KB_SERVICE_USER: The username with the necessary permissions to interact with the database service. - KB_SERVICE_PASSWORD: The corresponding password for KB_SERVICE_USER to authenticate with the database service. - KB_PRIMARY_POD_FQDN: The FQDN of the primary Pod within the replication group. - KB_MEMBER_ADDRESSES: A comma-separated list of Pod addresses for all replicas in the group. - KB_NEW_MEMBER_POD_NAME: The pod name of the replica being added to the group. - KB_NEW_MEMBER_POD_IP: The IP address of the replica being added to the group.   Expected action output: - On Failure: An error message detailing the reason for any failure encountered during the addition of the new member.   For example, to add a new OBServer to an OceanBase Cluster in &#39;zone1&#39;, the following command may be used:   &#x60;&#x60;&#x60;yaml command: - bash - -c - | ADDRESS&#x3D;$(KB_MEMBER_ADDRESSES%%,*) HOST&#x3D;$(echo $ADDRESS | cut -d &#39;:&#39; -f 1) PORT&#x3D;$(echo $ADDRESS | cut -d &#39;:&#39; -f 2) CLIENT&#x3D;\&quot;mysql -u $KB_SERVICE_USER -p$KB_SERVICE_PASSWORD -P $PORT -h $HOST -e\&quot; $CLIENT \&quot;ALTER SYSTEM ADD SERVER &#39;$KB_NEW_MEMBER_POD_IP:$KB_SERVICE_PORT&#39; ZONE &#39;zone1&#39;\&quot; &#x60;&#x60;&#x60;   Note: This field is immutable once it has been set.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-13T15:59:08.817252Z[Etc/UTC]")
public class V1alpha1ComponentDefinitionSpecLifecycleActionsMemberJoin {
  public static final String SERIALIZED_NAME_BUILTIN_HANDLER = "builtinHandler";
  @SerializedName(SERIALIZED_NAME_BUILTIN_HANDLER)
  private String builtinHandler;

  public static final String SERIALIZED_NAME_CUSTOM_HANDLER = "customHandler";
  @SerializedName(SERIALIZED_NAME_CUSTOM_HANDLER)
  private V1alpha1ComponentDefinitionSpecLifecycleActionsAccountProvisionCustomHandler customHandler;

  public V1alpha1ComponentDefinitionSpecLifecycleActionsMemberJoin() {
  }

  public V1alpha1ComponentDefinitionSpecLifecycleActionsMemberJoin builtinHandler(String builtinHandler) {
    
    this.builtinHandler = builtinHandler;
    return this;
  }

   /**
   * Specifies the name of the predefined action handler to be invoked for lifecycle actions.   Lorry, as a sidecar agent co-located with the database container in the same Pod, includes a suite of built-in action implementations that are tailored to different database engines. These are known as \&quot;builtin\&quot; handlers, includes: &#x60;mysql&#x60;, &#x60;redis&#x60;, &#x60;mongodb&#x60;, &#x60;etcd&#x60;, &#x60;postgresql&#x60;, &#x60;official-postgresql&#x60;, &#x60;apecloud-postgresql&#x60;, &#x60;wesql&#x60;, &#x60;oceanbase&#x60;, &#x60;polardbx&#x60;.   If the &#x60;builtinHandler&#x60; field is specified, it instructs Lorry to utilize its internal built-in action handler to execute the specified lifecycle actions.   The &#x60;builtinHandler&#x60; field is of type &#x60;BuiltinActionHandlerType&#x60;, which represents the name of the built-in handler. The &#x60;builtinHandler&#x60; specified within the same &#x60;ComponentLifecycleActions&#x60; should be consistent across all actions. This means that if you specify a built-in handler for one action, you should use the same handler for all other actions throughout the entire &#x60;ComponentLifecycleActions&#x60; collection.   If you need to define lifecycle actions for database engines not covered by the existing built-in support, or when the pre-existing built-in handlers do not meet your specific needs, you can use the &#x60;customHandler&#x60; field to define your own action implementation.   Deprecation Notice:   - In the future, the &#x60;builtinHandler&#x60; field will be deprecated in favor of using the &#x60;customHandler&#x60; field for configuring all lifecycle actions. - Instead of using a name to indicate the built-in action implementations in Lorry, the recommended approach will be to explicitly invoke the desired action implementation through a gRPC interface exposed by the sidecar agent. - Developers will have the flexibility to either use the built-in action implementations provided by Lorry or develop their own sidecar agent to implement custom actions and expose them via gRPC interfaces. - This change will allow for greater customization and extensibility of lifecycle actions, as developers can create their own \&quot;builtin\&quot; implementations tailored to their specific requirements.
   * @return builtinHandler
  **/
  @jakarta.annotation.Nullable
  public String getBuiltinHandler() {
    return builtinHandler;
  }


  public void setBuiltinHandler(String builtinHandler) {
    this.builtinHandler = builtinHandler;
  }


  public V1alpha1ComponentDefinitionSpecLifecycleActionsMemberJoin customHandler(V1alpha1ComponentDefinitionSpecLifecycleActionsAccountProvisionCustomHandler customHandler) {
    
    this.customHandler = customHandler;
    return this;
  }

   /**
   * Get customHandler
   * @return customHandler
  **/
  @jakarta.annotation.Nullable
  public V1alpha1ComponentDefinitionSpecLifecycleActionsAccountProvisionCustomHandler getCustomHandler() {
    return customHandler;
  }


  public void setCustomHandler(V1alpha1ComponentDefinitionSpecLifecycleActionsAccountProvisionCustomHandler customHandler) {
    this.customHandler = customHandler;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ComponentDefinitionSpecLifecycleActionsMemberJoin v1alpha1ComponentDefinitionSpecLifecycleActionsMemberJoin = (V1alpha1ComponentDefinitionSpecLifecycleActionsMemberJoin) o;
    return Objects.equals(this.builtinHandler, v1alpha1ComponentDefinitionSpecLifecycleActionsMemberJoin.builtinHandler) &&
        Objects.equals(this.customHandler, v1alpha1ComponentDefinitionSpecLifecycleActionsMemberJoin.customHandler);
  }

  @Override
  public int hashCode() {
    return Objects.hash(builtinHandler, customHandler);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ComponentDefinitionSpecLifecycleActionsMemberJoin {\n");
    sb.append("    builtinHandler: ").append(toIndentedString(builtinHandler)).append("\n");
    sb.append("    customHandler: ").append(toIndentedString(customHandler)).append("\n");
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
    openapiFields.add("builtinHandler");
    openapiFields.add("customHandler");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1ComponentDefinitionSpecLifecycleActionsMemberJoin
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1ComponentDefinitionSpecLifecycleActionsMemberJoin.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1ComponentDefinitionSpecLifecycleActionsMemberJoin is not found in the empty JSON string", V1alpha1ComponentDefinitionSpecLifecycleActionsMemberJoin.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1ComponentDefinitionSpecLifecycleActionsMemberJoin.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1ComponentDefinitionSpecLifecycleActionsMemberJoin` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("builtinHandler") != null && !jsonObj.get("builtinHandler").isJsonNull()) && !jsonObj.get("builtinHandler").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `builtinHandler` to be a primitive type in the JSON string but got `%s`", jsonObj.get("builtinHandler").toString()));
      }
      // validate the optional field `customHandler`
      if (jsonObj.get("customHandler") != null && !jsonObj.get("customHandler").isJsonNull()) {
        V1alpha1ComponentDefinitionSpecLifecycleActionsAccountProvisionCustomHandler.validateJsonObject(jsonObj.getAsJsonObject("customHandler"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1ComponentDefinitionSpecLifecycleActionsMemberJoin.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1ComponentDefinitionSpecLifecycleActionsMemberJoin' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1ComponentDefinitionSpecLifecycleActionsMemberJoin> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1ComponentDefinitionSpecLifecycleActionsMemberJoin.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1ComponentDefinitionSpecLifecycleActionsMemberJoin>() {
           @Override
           public void write(JsonWriter out, V1alpha1ComponentDefinitionSpecLifecycleActionsMemberJoin value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1ComponentDefinitionSpecLifecycleActionsMemberJoin read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1ComponentDefinitionSpecLifecycleActionsMemberJoin given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1ComponentDefinitionSpecLifecycleActionsMemberJoin
  * @throws IOException if the JSON string is invalid with respect to V1alpha1ComponentDefinitionSpecLifecycleActionsMemberJoin
  */
  public static V1alpha1ComponentDefinitionSpecLifecycleActionsMemberJoin fromJson(String jsonString) throws IOException {
    return new JSON().getGson().fromJson(jsonString, V1alpha1ComponentDefinitionSpecLifecycleActionsMemberJoin.class);
  }

 /**
  * Convert an instance of V1alpha1ComponentDefinitionSpecLifecycleActionsMemberJoin to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return new JSON().getGson().toJson(this);
  }
}

