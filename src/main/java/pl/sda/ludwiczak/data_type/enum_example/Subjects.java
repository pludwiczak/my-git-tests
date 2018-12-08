package pl.sda.ludwiczak.data_type.enum_example;

public enum Subjects {
    MATHS(30),
    ECONOMICS(60),
    LANGUAGE(30),
    FINANCE(45);


    private int numberOfHours;

    private Subjects(int numberOfHours) {
        this.numberOfHours = numberOfHours;
    }

    public int getNumberOfHours() {
        return numberOfHours;
    }




}
