Данный проект представляет собой автоматизированный тестовый фреймворк функционала интернет-магазина mi.by 

Проект состоит из следующих компонентов:

- в пакете main.java.by.mi.api присутствуют два класса: LoginRequest - который служит для передачи данных при отправке api-запросов и класс ApiMessage содержит сообщения для выполнения проверок;
- в пакете main.java.by.mi.ui.pages присутствуют пакеты searchPage, homePage, loginPage, steps. Каждый из этих пакетов содержит класс реализованный по шаблону PageObject.
- в пакете driver содержатся классы Driver и Wait реализующие WevDriver и WevDriverWait проекта.
- в пакете domain присутствуют два класса: User и Users - предназначен для генерации различных пользовательских данных с разными комбинациями логинов и паролей.
- в пакете utils содержит константы с названиями соответвтующих товаров, используемых при тестировании. А также класс GenerationDataUtil - для генерации случайных данных email и password при помощи фреймворка Faker;

- в пакете test.java.by.mi.api содержится класс LoginApiTest с тремя тестами для отправки различных api-запросов
и проверки полученной информации от сервера. 
- пакет test.java.by.mi.ui содержит класс BaseTest с предварительными настройками запуска и завершения ui-тестов.
Классы HomePageTest, LoginPageTest, SearchPageTest содержат тесты для проверки различных ui-элементов сайта.