package org.launchcode;

public class CD extends BasicDisc{
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

    int tracks;

    public CD(String name, Double storageCapacity, String discType, int spinSpeed, int tracks) {
        super(name, storageCapacity, discType, spinSpeed);
        this.tracks = tracks;
    }

    public int getTracks() {
        return tracks;
    }

    @Override
   public void spinDisc(){
        System.out.println("disc spinning");

    };

    @Override
    public String readDisc(){
        return "cd can read Disc";

    };
    // read the data, which is String

    @Override
    public void writeDisc(){
        System.out.println("write Disc");
    };

    @Override
    public void reportData(){
        System.out.println("name = " + getName());
        System.out.println("Storage Capacity = " + getStorageCapacity());
        System.out.println("disc type = " + getDiscType());
        System.out.println("spin speed = " + getSpinSpeed());
        System.out.println("number of tracks " + getTracks());
    };

}
