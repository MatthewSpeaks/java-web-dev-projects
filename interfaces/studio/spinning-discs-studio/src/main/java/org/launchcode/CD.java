package org.launchcode;

import java.util.ArrayList;

public class CD extends Disc implements OpticalDisc {

    ArrayList<String> discData = new ArrayList<>();
    // TODO: Implement your custom interface.



    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of" + this.getRotationMin() + " - " + this.getRotationMax() + " rpm");
    }

    @Override
    public void writeDisc(String someDiscData) {
        discData.add(someDiscData);
    };

    @Override
    public void readDisc() {
        System.out.println(discData);
    };



    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
