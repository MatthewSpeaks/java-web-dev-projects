package org.launchcode.technology;

import java.util.HashMap;

public abstract class Computer extends AbstractEntity {
    // TODO For a parent class add 3 properties, 2 methods, and a constructor.
    private double maxStorage;
    private double availableStorage;
    private String operatingSystem;
    private double randomActiveMemory;

    private HashMap<String, Double> files = new HashMap<>();
    private double clockSpeed;

    // Constructor, uses super to properly extend abstract class
    public Computer(double aStorage, String aOperatingSystem, double aRandomActiveMemory, double aClockSpeed ) {
        super();
        this.maxStorage = aStorage;
        this.availableStorage = this.maxStorage;
        this.operatingSystem = aOperatingSystem;
        this.randomActiveMemory = aRandomActiveMemory;
        this.clockSpeed = aClockSpeed;
    }

    //Method to save a file, takes a file name and size. Then appropriately calculates available storage

    public void saveFile(String aFileName, Double aFileSize) {
        this.files.put(aFileName, aFileSize);
        if (this.availableStorage >= aFileSize){
            this.availableStorage -= aFileSize;
            System.out.println("file saved successfully");
        } else {
            System.out.println("not enough space available on drive");
        }
    }

    public void checkAvailableStorage(){
        System.out.println("You have " + this.getAvailableStorage() + " GB available");
    }

    public void viewFiles(){
        System.out.println(getFiles().toString());
    }

    @Override
    public String toString() {
        return "Computer{" +
                "files = " + files + "GB" +
                '}';
    }

    public double getMaxStorage() {
        return maxStorage;
    }

    private void setMaxStorage(double storage) {
        this.maxStorage = storage;
    }

    public double getAvailableStorage() {
        return availableStorage;
    }

    public void setAvailableStorage(double availableStorage) {
        this.availableStorage = availableStorage;
    }

    public HashMap<String, Double> getFiles() {
        return files;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    private void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public double getRandomActiveMemory() {
        return randomActiveMemory;
    }

    private void setRandomActiveMemory(double randomActiveMemory) {
        this.randomActiveMemory = randomActiveMemory;
    }

    public double getClockSpeed() {
        return clockSpeed;
    }

    private void setClockSpeed(double clockSpeed) {
        this.clockSpeed = clockSpeed;
    }
}
