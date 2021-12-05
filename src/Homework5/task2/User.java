package Homework5.task2;

public class User {

    private String firstName;
    private String lastName;
    private String email;
    private String role;
    private int salary;

    public User(String firstName, String lastName, String email, String role, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.role = role;
        this.salary = salary;
    }
    public String toString() {
        return "Firstname: " + firstName + "\n" + "LastName: " + lastName +
                "\n" + "E-mail: " + email + "\n" + "Role: " + role + "\n"
                + "Salary: " + salary + "\n";
    }
}

/*
    Имеется класс User. В нем есть следующие поля: firstName, lastName, email, role, salary –
        значение типа int копейки. Salary хранит значение заработной платы пользователя. Все
        имеющиеся роли пользователя перечислены в enum Role. Значение ролей:
        DIRECTOR(директор), EMPLOYEE(рядовой сотрудник), HR(Мэнеджер отдела кадров).
        Переопределить метод toString, который будет возвращать следующую информацию о
        пользователе: firstName, lastName, salary (в виде рубли и копейки), role (значение, которое я
        написал в скобках).*/
