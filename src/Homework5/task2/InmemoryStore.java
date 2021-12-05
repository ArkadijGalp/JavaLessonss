package Homework5.task2;

public class InmemoryStore implements Store {

    private User[] users;

    InmemoryStore () {
        users = new User[4];
        users[0] = new User("Andrey", "Isichenko", "isichan@gmail.com", "DIRECTOR", 1500);
        users[1] = new User("Ley", "Hao", "LH23@hotmail.com", "EMPLOYEE", 900);
        users[2] = new User("Maria", "Roben", "Mrxfont@gmail.com", "HR", 1000);
        users[3] = new User("Anton", "Babich", "Anton221@gmail.com", "EMPLOYEE", 1100);
    }

    @Override
    public String getUser(String email) {
        return email;
    }
    public User[] getUsers() {
        return users;
    }
}
