package Homeworkk7.Task3;

public enum Season {
    WINTER("winter"),
    SUMMER("summer"),
    AUTUMN("autumn"),
    SPRING("spring");


    private String nameseason;


    Season(String nameseason) {
        this.nameseason = nameseason;
    }

    public String getNameseason() {
        return nameseason;
    }

    }
