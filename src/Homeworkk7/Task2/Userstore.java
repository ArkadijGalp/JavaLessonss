package Homeworkk7.Task2;

public class Userstore extends User{

    private String account;

    public Userstore(String login, String password, String account) {
        super(login, password);
        this.account = account;
    }
    public String getAccount() {
        return account;
    }
    @Override
    public String toString() {
        return "Account's name: " + getAccount();
    }
}
