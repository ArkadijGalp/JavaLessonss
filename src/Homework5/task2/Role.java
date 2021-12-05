package Homework5.task2;

public enum Role {
    DIRECTOR ("Директор"),
    EMPLOYEE ("Рядовой сотрудник "),
    HR ("Отвечающий за рекрутинг ") ;

    private String role;

    Role (String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}
