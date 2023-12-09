# Разрабатываем автотесты с Browserstack
При помощи инспектора в Browserstack разработаны автотесты на iOS / Android с использованием Selenide.

Для запуска тестов на ОС android:
```shell
gradle clean android -Dos=android
```

Для запуска тестов на ОС ios:
```shell
gradle clean ios -Dos=ios
```

Для запуска тестов на устройстве, подключенном по USB:
```shell
gradle clean wikipediaLocal -DdeviceHost=localDevice
```

Для запуска тестов на эмуляторе:
```shell
gradle clean wikipediaEmulator -DdeviceHost=emulator
```
