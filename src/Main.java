//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Cat britishCat = new Cat("Smokey", "British", 5, "Grey");

        britishCat.sayNameAndWeight();
        System.out.print("and ");
        Pet.sayMyCountry(); /* использую статический метод */
        Pet.homeCountry = "Germany"; /* статическая переменная */
        Pet.sayMyCountry();

        britishCat.petACat("by");
        britishCat.feed();
        System.out.println(britishCat.getWeight());

    }
}


/* Домашнее задание 1:

Реализуйте классовую модель автомобиля или любой другой близкой вам предметной области. Модель должна включать:
• Иерархия классов (родитель и не менее 2 потомков).
• Не менее двух интерфейсов, каждый из которых реализован как минимум в одном из классов.
• Как минимум один абстрактный класс.
• Каждый класс должен содержать не менее 2 полей.
• Должна быть реализация хотя бы одного параметризованного конструктора.
• Реализация инкапсуляции включая разграничение с модификаторами доступа.
• Наличие статических полей и методов.
• Наличие методов в каждом классе.
• Методы должны реализовать какую либо усложненную логику (ветвления, циклы).*/