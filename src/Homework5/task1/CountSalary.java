package Homework5.task1;

public class CountSalary {

    EmployeeType[] arrayPerson = EmployeeType.values();

    public void calculateSalary(int workdays) {
        for (int i = 0; i < arrayPerson.length; i++) {
            System.out.println(arrayPerson[i] + " " + arrayPerson[i].getSalary()*workdays + " average salary for a month");
        }
    }

}