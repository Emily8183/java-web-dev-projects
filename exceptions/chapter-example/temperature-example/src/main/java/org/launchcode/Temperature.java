package org.launchcode;

public class Temperature {


    private double fahrenheit;
    //private String message;

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double aFahrenheit) {

        double absoluteZeroFahrenheit = -459.67;

        if (aFahrenheit < absoluteZeroFahrenheit) {
            try{
                throw new TemperatureException("that temperature is too low");
            } catch (TemperatureException e){
                e.printStackTrace()
            }
            System.out.println("Value is below absolute zero");
        }

        fahrenheit = aFahrenheit;
    }
}
