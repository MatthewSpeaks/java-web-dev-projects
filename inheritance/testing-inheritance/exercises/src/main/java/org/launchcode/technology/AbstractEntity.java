package org.launchcode.technology;

public abstract class AbstractEntity {
    public static int uniqueID = 101;

    private int ID;

    public AbstractEntity() {
        this.ID = uniqueID;
        uniqueID++;
    }

    public int getID() {
        return this.ID;
    }
}
