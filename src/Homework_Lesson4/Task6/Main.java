package Homework_Lesson4.Task6;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Student("Andrey", "Kolotilin", 21);
        Person person2 = new Student("Maria", "Antasiuk", 19);
        Person person3 = new Lector("Daria", "Balik", 28);
        Person person4 = new Lector("Zygmunt", "Janiec", 55);

    Person persons[] = {person1, person2, person3, person4};
    PersonFullname personFullname = new PersonFullname(persons);

    personFullname.fullName(1);
    personFullname.allStudents();
    personFullname.OldPerson();
    personFullname.OldLector();
    }

    }

/*
Задание 6.
        По примеру с первым заданием создайте класс для работы с массивом Person.
        Иерархия Person: Person – абстрактный класс, реализации: Student, Lector. Объект типа
        Lector имеет дополнительное поле workingYears (int).
        У класса Person есть поля firstName, lastName, age.
        1) Добавьте метод, который выводит полное имя пользователя по его индексу в
        массиве.
        2) Метод, который находит самого старого человека из массива.
        3) Метод, который вернет всех студентов из этого массива.
        4) Вернет лектора, который работает дольше всех. Самое большое значение
        workingYears. Чтобы вы смогли обращаться к полю workingYears вы должны сделать
        следующие действия:
        1) проверить является ли объект типа Person инстанцем Lector. Используем instanceof.
        2) Если instanceof вернул true, тогда мы можем сделать явное преобразование Person к
        Lector. Так же как мы это делали с примитивами, а именно
        Person person = new Lector();
        Lector lector = (Lector) person*/
