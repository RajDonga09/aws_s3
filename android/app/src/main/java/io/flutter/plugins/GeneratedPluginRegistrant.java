package io.flutter.plugins;

import io.flutter.plugin.common.PluginRegistry;
import com.blasanka.s3flutter.aws_s3.AwsS3Plugin;

/**
 * Generated file. Do not edit.
 */
public final class GeneratedPluginRegistrant {
  public static void registerWith(PluginRegistry registry) {
    if (alreadyRegisteredWith(registry)) {
      return;
    }
    AwsS3Plugin.registerWith(registry.registrarFor("com.blasanka.s3flutter.aws_s3.AwsS3Plugin"));
  }

  private static boolean alreadyRegisteredWith(PluginRegistry registry) {
    final String key = GeneratedPluginRegistrant.class.getCanonicalName();
    if (registry.hasPlugin(key)) {
      return true;
    }
    registry.registrarFor(key);
    return false;
  }
}
