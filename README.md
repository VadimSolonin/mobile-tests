# Мобильные автотесты
В репозитории представлены автотесты:
- Разработанные при помощи инспектора в Browserstack на iOS / Android
- Разработанные при помощи Appium Server & Appium Inspector

Для запуска тестов на ОС android:
```shell
gradle clean android -DdeviceHost==browserstackAndroid
```

Для запуска тестов на ОС ios:
```shell
gradle clean ios -DdeviceHost=browserstackIos
```

Для запуска тестов на устройстве, подключенном по USB:
```shell
gradle clean wikipediaLocal -DdeviceHost=localDevice
```

Для запуска тестов на эмуляторе:
```shell
gradle clean wikipediaEmulator -DdeviceHost=emulator
```
