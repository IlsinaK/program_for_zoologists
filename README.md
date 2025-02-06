# Sprint6
# Тестирование программы для зоологов

Цель данного проекта — протестировать компонент программы, используемой зоологами для записи наблюдений о семействе кошачьих. В проекте реализованы тесты для классов `Feline`, `Cat` и `Lion` с полным покрытием (не менее 100%) с использованием инструментов Jacoco, Mockito и JUnit.

## Содержание

- [Требования](#требования)
- [Установка](#установка)
- [Структура проекта](#структура-проекта)
- [Запуск тестов](#запуск-тестов)

## Требования

- **Java 11**
- **Maven**
- **JUnit**
- **Mockito**
- **Jacoco**

## Установка

1. Клонируйте репозиторий с проектом.

   ```bash
   git clone https://github.com/username/project.git
Перейдите в директорию проекта.
cd project

Соберите проект с использованием Maven и подключите необходимые зависимости.
mvn clean install

## Структура проекта
   
└── src
    ├── main
    │   └── java
    │       └── com
    │           └── example
    │               ├── Animal.java
    │               ├── Cat.java
    │               ├── Feline.java
    │               ├── Lion.java
    │               └── Predator.java
    └── test
        └── java
            ├── AnimalInvalidInputParamTest.java
            ├── AnimalParamTest.java
            ├── AnimalTest.java
            ├── CatTest.java
            ├── FelineParamTest.java
            ├── FelineTest.java
            ├── LionInvalidSexParamTest.java
            ├── LionMockTest.java
            └── LionParamTest.java

## Запуск тестов

mvn test
