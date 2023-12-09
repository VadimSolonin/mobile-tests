package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${deviceHost}.properties"
})

public interface LocalDeviceConfig extends Config {
    @Key("appiumServer")
    String appiumServer();

    @Key("deviceName")
    String deviceName();

    @Key("platformName")
    String platformName();

    @Key("platformVersion")
    String platformVersion();

    @Key("appURL")
    String appURL();

    @Key("appPath")
    String appPath();

    @Key("appPackage")
    String appPackage();

    @Key("appActivity")
    String appActivity();
}