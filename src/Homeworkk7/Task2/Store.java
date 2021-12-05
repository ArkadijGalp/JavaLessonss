package Homeworkk7.Task2;

import java.util.Arrays;

public class Store {

    Userstore [] users;

    public Store(int numberOfUsers) {
        users = new Userstore[numberOfUsers];
        users[0] = new Userstore("Amazontop", "JeffBizus", "CatsNameisDonger" );
        users[1] = new Userstore("Baltika7", "Blanshik123", "Lena328");
        users[2] = new Userstore("KapitanKakao", "qwe123qwer", "CaptainKakao");

    }


    void addUser(Userstore userstore) throws ArrayIsFull {
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                users[i] = userstore;
                return;
            }
        }
        throw new ArrayIsFull("Impossible to add a new user");
    }
    void searchUser(String loginAuthorise, String passwordAuthorise) throws UserNotFoundException {
        for (Userstore user : users) {
            if (user != null && user.getLogin().equals(loginAuthorise) && user.getPassword().equals(passwordAuthorise))
            System.out.println(user.getAccount());
            return;
        }
        throw new UserNotFoundException("This user does not exist in a base ");
    }
    @Override
    public String toString() {
        return "Store " + "users:" + Arrays.toString(users);
    }
}
