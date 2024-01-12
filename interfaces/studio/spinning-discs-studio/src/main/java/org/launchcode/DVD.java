package org.launchcode;

import java.util.HashMap;

public class DVD extends Disc implements OpticalDisc {

    HashMap<Integer, String> discData = new HashMap<>();
    private Integer index;


    public DVD (double aRotationMin, double aRotationMax, double aStorageCapacity, String aTitle) {
        super(aRotationMin, aRotationMax, aStorageCapacity, aTitle);
        index = 1;
    };
    // TODO: Implement your custom interface.
    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of" + this.getRotationMin() + " - " + this.getRotationMax() + " rpm");
    };

    @Override
    public void writeDisc(String someDiscData) {
        this.discData.put(getIndex(), someDiscData);
        this.setIndex(getIndex() + 1);
    };

    @Override
    public void readDisc() {
        System.out.println(discData);
    };


    public Integer getIndex() {
        return index;
    };

    public void setIndex(Integer index) {
        this.index = index;
    };

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
};
