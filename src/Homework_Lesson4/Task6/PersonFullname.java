package Homework_Lesson4.Task6;

public class PersonFullname {
    private Person[] arrayPerson;

    PersonFullname (Person[] arrayPerson) {
        this.arrayPerson = arrayPerson;
    }

    public void fullName(int i) {
        System.out.println("FullName: " + arrayPerson[i].getFirstname() + " " + arrayPerson[i].getLastname());

    }
    public void OldPerson() {
        Person person = arrayPerson[0];
        for (int i = 1; i < arrayPerson.length; i++) {
            if (arrayPerson[i].getAge() > person.getAge()) {
                person = arrayPerson[i];
            }
        }
        System.out.println("That is the oldest person of the listed: \n" + person);
    }
public void allStudents() {
    System.out.println("All student: ");

    for (int i = 0; i < arrayPerson.length; i++) {
        if (arrayPerson[i] instanceof Student) {
            System.out.println(arrayPerson[i]);
        }
    }
}

public String OldLector() {
        if (arrayPerson.length == 0) {
            return "there is no users";
        }
        int maxAgeExperience = 0;
        Lector lectorResult = new Lector();
        for (int i = 0; i < arrayPerson.length; i++ ){
            if (arrayPerson[i] instanceof  Lector) {
                Lector lector = (Lector) arrayPerson[i];
                if (lector.getWorkingYears() > lectorResult.getWorkingYears());

            }
        }
        if (lectorResult != null) {
            return ("The oldest people from the listed are: \n" + lectorResult);
        } else {
            return ("Lector is not absent in this array ");
        }
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
