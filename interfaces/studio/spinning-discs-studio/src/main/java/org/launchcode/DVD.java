package org.launchcode;

public class DVD extends BasicDisc{
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

    String studio;

    public DVD(String name, Double storageCapacity, String discType, int spinSpeed, String studio) {
        super(name, storageCapacity, discType, spinSpeed);
        this.studio = studio;
    }


    public String getStudio() {
        return studio;
    }

    @Override
    public void spinDisc(){
        System.out.println("dvd spinning");

    }
    @Override
    public String readDisc(){
        return "dvd can read Disc"; //the class must meet the contract(which is the interface). So if the type is String, you can't change to void etc
        // you also can't add any parameter

    }

    @Override
    public void writeDisc(){
        System.out.println("write dvd Disc");
    }

    public void reportData(){
        System.out.println("report dvd data");
    }

    //You can add more methods, but can't skip any methods from interface

}
