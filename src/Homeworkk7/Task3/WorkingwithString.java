package Homeworkk7.Task3;

import java.util.Locale;

public class WorkingwithString extends Exception {

    private String stringEx;

    public WorkingwithString() {

    }

    public void getSeason(String stringEx) throws RuntimeException {
        this.stringEx = Season.valueOf(stringEx.toUpperCase(Locale.ROOT)).getNameseason();
    }
    @Override
    public String toString(){
        return "This is "+stringEx;
    }


}
