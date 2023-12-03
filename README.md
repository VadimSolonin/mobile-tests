# Разрабатываем автотесты с Browserstack
При помощи инспектора в Browserstack разработаны автотесты на iOS / Android с исползованием Selenide.

Для запуска тестов на ОС android:
```shell
gradle clean android -Denv=android
```

Для запуска тестов на ОС ios:
```shell
gradle clean ios -Denv=ios
```
