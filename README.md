# Мобильные автотесты
В репозитории представлены автотесты, разработанные при помощи:
- Browserstack на iOS и Android
- Appium Server & Appium Inspector

Для запуска тестов Browserstack на ОС android:
```shell
gradle clean android -DdeviceHost==browserstackAndroid
```

Для запуска тестов Browserstack на ОС ios:
```shell
gradle clean ios -DdeviceHost=browserstackIos
```

Для запуска тестов на устройстве android, подключенном по USB:
```shell
gradle clean wikipediaLocal -DdeviceHost=localDevice
```

Для запуска тестов на эмуляторе:
```shell
gradle clean wikipediaEmulator -DdeviceHost=emulator
```
