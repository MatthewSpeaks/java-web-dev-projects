package org.launchcode.technology;

public class Program {

    public static void main(String[] args) {
            Laptop mattLaptop = new Laptop(1000, "MacBook M2", 16, 4.2);
            System.out.println("Hello World");
            mattLaptop.saveGame("Red Dead Redemption" , 50);
            mattLaptop.saveFile("Photo", 12.0);
            System.out.println(mattLaptop.getID());
            mattLaptop.checkAvailableStorage();
            Laptop JanelLaptop = new Laptop(1500, "Desktop", 16, 5);
        System.out.println(JanelLaptop.getID());
        mattLaptop.viewFiles();

        SmartPhone mattPhone = new SmartPhone(250, "iPhone", 8, 2.4, "proCamera");


        mattPhone.takePhoto("family photo", 2);
        mattPhone.takePhoto("selfie", 2);
        mattPhone.viewPhotoLibrary();
        mattPhone.checkAvailableStorage();
        System.out.println(mattPhone.getID());
    }
}

