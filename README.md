## Домашнее задание 6
### Добавление Allure в HW_3

### Cделано:
    1) Добавлены properties
    2) Убраны все time.sleeps, установлено время ожидания по умолчанию
    3) Авторизация перенесена в @BeforeAll
    4) Исправлены прошлые ошибки и переработаны некоторые шаги и методы.
    5) На Page-ах добавлены @Step-ы, а так же описания xpath
    6) Настроен Allure

### Тест кейс:
` 1) Авторизоваться в edujira.ifellow.ru`

`2) Перейти в проект "Test"`

`3) Перейти в задачу "TestSilenium" проверить:`

`   - "статус задачи" - "Сделать"`

`   - "Исправить в версиях" - "Version 2.0"`

`4) Создать новый баг, проверить его создание и провести его по всем статусам`