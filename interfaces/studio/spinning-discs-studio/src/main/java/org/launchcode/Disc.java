package org.launchcode;

public abstract class Disc {
    private double rotationMin;

    private double rotationMax;

    private double storageCapacity;

    private String title;

    public Disc (double aRotationMin, double aRotationMax, double aStorageCapacity, String aTitle) {
        this.rotationMin = aRotationMin;
        this.rotationMax = aRotationMax;
        this.storageCapacity = aStorageCapacity;
        this.title = aTitle;
    }

    public double getRotationMin() {
        return rotationMin;
    }

    public void setRotationMin(double rotationMin) {
        this.rotationMin = rotationMin;
    }

    public double getRotationMax() {
        return rotationMax;
    }

    public void setRotationMax(double rotationMax) {
        this.rotationMax = rotationMax;
    }

    public double getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(double storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
