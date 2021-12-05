package Homework5.task2;

public class DirectorActionController implements ActionController {

    private Store store;

    public DirectorActionController(Store store) {
        this.store = store;
    }

    @Override
    public String getUserInformationByEmail(String email) {
        if (email == store.getUser(email)) {
            return null;
        } else {
            return "Пользователь с этим e-mail" + email + "не существует ";
        }
    }


    @Override
    public void ChangeSalaryByEmail(String email, int salary) {
        if (email == store.getUser(email)) {

        } else {
            System.out.println("Пользователь с таким e-mail " + email + "не существует ");
        }
    }
}


