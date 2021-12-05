package Homework5.task1;

public enum EmployeeType {
  DIRECTOR(250),
  ENGINEER(150),
    DEPARTMENT_HEAD(170),
    TRAINEE(70);

    private int salary;

    EmployeeType(int salary) {
        this.salary = salary;
    }
    public int getSalary() {
        return salary;
    }
}


/*
Задание 1.
        Создайте enum EmployeeType, который содержит следующие значения: DIRECTOR, ENGINEER,
        DEPARTMENT_HEAD, TRAINEE. В enum есть поле, которое содержит в себе зарплату за день для
        каждой из ролей. Напишите класс, в котором есть метод рассчитать заработную плату, для
        всех типов сотрудников. Метод принимает количество, отработанных дней. (Считаем, что все
        сотрудники работали одинаковое количество дней в месяц).*/
