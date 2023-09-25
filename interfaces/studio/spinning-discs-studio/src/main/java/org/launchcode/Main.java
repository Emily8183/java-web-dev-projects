package org.launchcode;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.
        CD cd1 = new CD("Emily", 104.96,"album", 4999,2);
        //DVD dvd1 = new DVD;

        // TODO: Call each CD and DVD method to verify that they work as expected.

        cd1.spinDisc();
        cd1.writeDisc();
        cd1.readDisc();
        cd1.reportData();

        DVD dvd1 = new DVD("Em",99.98,"Movie",5000,"Hollywood");

        dvd1.spinDisc();
        dvd1.writeDisc();
        dvd1.readDisc();
        dvd1.reportData();
    }
}