package Homework_Lesson4.Task4;

public abstract class Animal {

        int age;
        String nickname;
        String color;
        String breed;
        double weight;

        public Animal(int age, String nickname, String color, String breed, double weight) {
this.age = age;
this.nickname = nickname;
this.color = color;
this.breed = breed;
this.weight = weight;
        }
        abstract void castVote();

public void infoAnimal() {
    System.out.println("Age "+ age);
    System.out.println("Nickname " + nickname);
    System.out.println("Color " + color);
    System.out.println("breed " + breed);
    System.out.println("Weight " + weight);
}
}



/*    Создайте иерархию классов животных. Базовый абстрактный класс Animal. Добавьте
        поля на свой выбор , которые будут общими для всех животных, например, кличка,
        возраст и так далее. Добавьте метод абстрактный метод "подать голос". Добавьте
        метод , который выводит всю информацию о вашем животном. Добавьте класс Dog,
        Cat, Mouse,которые расширяют класс Animal. Реализуйте абстрактные методы.
        Добавьте методы присущие только конкретному животному. Например Dog метод
        "охранять". Cat - "спать весь день". Mouse - "что-нибудь погрызть". Можете придумать
        свои.
        В методе main создайте по экземпляру каждого класса. Например Dog dog = new
        Dog(); и так далее.
        После этого создайте еще по экземпляру каждого класса, но в этот раз присвойте все
        объекты типу данных Animal.
        Например, Animal dog = new Dog()
        И так далее.
        Попробуйте вызвать все доступные методы для каждого из полученных 6 объектов.
        Какие методы и в каком случае доступны?
        Возьмите один из объектов типа Animal, например Animal dog = new Dog(); и сделайте
        проверку этого объекта на соответствие типу Animal, Dog и Cat. Для того, чтобы это
        сделать необходимо использовать ключевое слово instanceof.
        Последние пункты не были пройдены на лекции. Присвоить переменной типа Animal
        объект типа Dog возможно благодаря полиморфизму и тому, что объект Dog вляется
        потомком класса Animal. В обратном порядке так работать не будет. Попробуйте
        выполнить следующий код: Dog animal = new Animal(); такой код не будет
        откомпилирован.*/
