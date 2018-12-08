package pl.sda.ludwiczak.data_type.enum_example;

import javax.swing.*;

public enum Seasons {
    WINTER(-10),
    SPRING(5),
    SUMMER(25),
    AUTUMN(7);

    private float averageTempInC;


    private Seasons(float averageTempInC) { // constructor typu wyliczeniowego jest zawsze private
        this.averageTempInC = averageTempInC;

    }

    public float getAverageTempInC() {
        return averageTempInC;
    }

}
