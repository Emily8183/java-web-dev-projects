package org.launchcode;

//interface defines the template of the behaviors

public interface OpticalDisc {
    //接口就是用abstract提一些功能，大方向
    //不能声明构造器

    int maxRPM = 5000;


    void spinDisc();

    String readDisc();
    // read the data, which is String

    void writeDisc();

    void reportData();//prints
    //String reportDate() //return string both are correct


}
