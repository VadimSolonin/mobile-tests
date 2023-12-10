# Мобильные автотесты
В репозитории представлены автотесты, разработанные при помощи:
- Browserstack на iOS и Android
- Appium Server & Appium Inspector

Для запуска тестов Browserstack на ОС android:
```shell
gradle clean android -DdeviceHost=browserstack -DenvMobile=browserstackAndroid
```

Для запуска тестов Browserstack на ОС ios:
```shell
gradle clean ios -DdeviceHost=browserstack -DenvMobile=browserstackIos
```

Для запуска тестов на устройстве android, подключенном по USB:
```shell
gradle clean wikipediaLocal -DdeviceHost=localDevice -DenvMobile=localDevice
```

Для запуска тестов на эмуляторе:
```shell
gradle clean wikipediaEmulator -DdeviceHost=localDevice -DenvMobile=emulator
```
