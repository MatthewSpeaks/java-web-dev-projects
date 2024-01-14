package org.launchcode.technology;

import java.util.HashMap;

public class SmartPhone extends Computer {

    //TODO For a child class add at least 1 additional property and 1 additional method.
    private final String camera;

    private HashMap<String, Double> photoLibrary = new HashMap<>();


    public SmartPhone(double aStorage, String aOperatingSystem, double aRandomActiveMemory, double aClockSpeed, String aCamera) {
        super(aStorage, aOperatingSystem, aRandomActiveMemory, aClockSpeed);
        this.camera = aCamera;
    }

    public void takePhoto(String aCaption, double aPhotoSize){
        this.photoLibrary.put(aCaption, aPhotoSize);
        this.setAvailableStorage(getAvailableStorage() - aPhotoSize);
    }

    public void viewPhotoLibrary() {
        System.out.println(photoLibrary.toString());
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "photoLibrary=" + photoLibrary +
                '}';
    }

    public String getCamera() {
        return camera;
    }
}
