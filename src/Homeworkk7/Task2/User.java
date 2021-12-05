package Homeworkk7.Task2;

public class User {

private String login;
private String password;

public User(String login, String password) {
    this.login = login;
    this.password = password;
}
public String getLogin(){
    return login;
}
public String getPassword() {
    return password;
}
}




/*
    Имеется класс user, у которого есть два поля login и password. Имеется класс Store, в котором
        хранится массив наших пользователей. Добавьте в этот класс метод для получения
        пользователя по login и password. В случае, если пользователя не существует метод бросает
        исключение типа Exception. Также добавьте в этот класс метод, который добавляет нового user
        в массив, в случае, если массив заполнен, генерируется исключение типа Exception. В методе
        main создайте экземпляр класса Store. Вызовите эти методы и обработайте ошибки.
        Исключения создайте свои. MyException extends Exception*/
