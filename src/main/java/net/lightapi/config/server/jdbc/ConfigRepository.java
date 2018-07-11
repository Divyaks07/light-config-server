
package net.lightapi.config.server.jdbc;



import net.lightapi.config.server.common.ConfigSecret;
import net.lightapi.config.server.common.ConfigValue;

import java.util.List;

/**
 * Repository for managing the lifecycle of config key-vale
 */
public interface ConfigRepository {

  static final String COMMON_KEY = "COMMON";
  /**
   * Deletes the config value pair by the given serviceId and the key
   *
   * @param key  key Id
   * @param serviceId service Id
   * @return records deleted
   */
  int  deleteServiceSecret(String key, String serviceId );

  /**
   * Deletes the config secret value pair by the given serviceId and the key
   *
   * @param key  key Id
   * @param serviceId service Id
   * @return records deleted
   */
  int  deleteServiceValue(String key, String serviceId );

  /**
   * Deletes the given serviceId.
   *
   * @param serviceId service Id
   * @return records deleted
   */
  int  deleteServiceValues(String serviceId );

  /**
   * Stores the given Config key value pair.
   * @param configValue a {@link ConfigValue}
   * @param serviceId service Id for config value
   * @return the stored {@link ConfigValue}
   */
  ConfigValue createServiceValue(ConfigValue configValue, String serviceId);

  /**
   * Stores the given Config key value pair.
   * @param configSecret a {@link ConfigSecret}
   * @param serviceId service Id for config value
   * @return the stored {@link ConfigValue}
   */
  ConfigSecret createServiceSecret(ConfigSecret configSecret, String serviceId);



  /**
   * Stores the given Config key value pair.
   * @param configValue a {@link ConfigValue}
   * @return the stored {@link ConfigValue}
   */
  ConfigValue createCommonService(ConfigValue configValue);


  /**
   * Stores the given Config key value pair.
   * @param configValues list of {@link ConfigValue}
   * @return the stored records number
   */
  int createCommonServices(List<ConfigValue> configValues);


  /**
   * Stores the given Config key value pair.
   * @param configValues list of {@link ConfigValue}
   * @param serviceId service Id for config value
   * @return the stored records number
   */
  int createServiceValues(List<ConfigValue> configValues, String serviceId);




  /**
   * update the given Config key value pair.
   * @param configValue a {@link ConfigValue}
   * @param serviceId service Id for config value
   * @return the stored {@link ConfigValue}
   */
  ConfigValue updateServiceValue(ConfigValue configValue, String serviceId);

  /**
   * update the given Config key value pair.
   * @param configSecret a {@link ConfigSecret}
   * @param serviceId service Id for config value
   * @return the stored {@link ConfigValue}
   */
  ConfigSecret updateServiceSecret(ConfigSecret configSecret, String serviceId);



  /**
   * udpate the given Config key value pair.
   * @param configValue a {@link ConfigValue}
   * @return the stored {@link ConfigValue}
   */
  ConfigValue updateCommonService(ConfigValue configValue);

  /**
   * query the config value by given key and serviceId.
   * @param key a key of the config value
   * @param serviceId service Id for config value
   * @return the result of  {@link ConfigValue}
   */
  ConfigValue queryServiceValue(String key, String serviceId);

  /**
   * query the config secret by given key and serviceId.
   * @param key a key of the config value
   * @param serviceId service Id for config value
   * @return the result of  {@link ConfigSecret}
   */
  ConfigSecret queryServiceSecret(String key, String serviceId);


  /**
   * query the config value by given  serviceId.
   * @param key a key of the config value
   * @return the result of  {@link ConfigValue}
   */
  ConfigValue queryCommonValue(String key);

  /**
   * query the config values by given  serviceId.
   * @param serviceId service Id for config value
   * @return the result list of  {@link ConfigValue}
   */
  List<ConfigValue> queryServiceValues(String serviceId);

  /**
   * query the config secret values by given  serviceId.
   * @param serviceId service Id for config value
   * @return the result list of  {@link ConfigSecret}
   */
  List<ConfigSecret> queryServiceSecrets(String serviceId);


  /**
   * query the common config values .
   * @return the result list of  {@link ConfigValue}
   */
  List<ConfigValue> queryCommonValues();
}
