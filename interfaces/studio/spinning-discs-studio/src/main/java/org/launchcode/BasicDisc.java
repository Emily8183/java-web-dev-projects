package org.launchcode;

public abstract class BasicDisc implements OpticalDisc{


    private String name;
    private Double storageCapacity;

    private String discType;

    private int spinSpeed;

    private static int id = 0;

    private int currentId;

    public BasicDisc(String name, Double storageCapacity, String discType, int spinSpeed) {
        this.name = name;
        this.storageCapacity = storageCapacity;
        this.discType = discType;
        this.spinSpeed = spinSpeed;
        this.currentId = id++;
        //once this.currentId happens, the right side will run "id=id+1"
    }

    public int getCurrentId() {
        return currentId;
    }

    public String getName() {
        return name;
    }

      public Double getStorageCapacity() {
        return storageCapacity;
    }

    public String getDiscType() {
        return discType;
    }

    public int getSpinSpeed() {
        return spinSpeed;
    }

  //dont need setters as there is a constructor for the abstractor
}
