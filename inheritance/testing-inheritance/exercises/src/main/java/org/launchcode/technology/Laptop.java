package org.launchcode.technology;

import java.util.ArrayList;

public class Laptop extends Computer{
    //TODO For a child class add at least 1 additional property and 1 additional method.

    private ArrayList<String> games = new ArrayList<>();

    public Laptop(double aStorage, String aOperatingSystem, double aRandomActiveMemory, double aClockSpeed) {
        super(aStorage, aOperatingSystem, aRandomActiveMemory, aClockSpeed);
    }


    public void saveGame(String aGameTitle, double aSize){
        this.games.add(aGameTitle);
        this.saveFile(aGameTitle, aSize);
    }


}
