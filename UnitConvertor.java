/*The `UnitConvertor` class handles temperature conversions between Celsius, Fahrenheit, and Kelvin units.
It provides methods for setting and retrieving temperature values in each unit,
along with a straightforward conversion formulas.
This class aims to simplify temperature manipulation by offering easy-to-use conversion functionalities.
 */


public class UnitConvertor {

    /*The Formula Used for Temperature Conversion of Celsius and Kelvin is:
     The formula used to convert temperature from Celsius to Kelvin is K = C + 273.15.
     The formula used to convert temperature from Kelvin to Celcius is C = K − 273.15

     The Formula Used for Temperature Conversion of Fahrenheit and Celsius is:
     The conversion of the temperature from Fahrenheit to Celsius formula is C = (F − 32) × 5 ⁄ 9.
     conversion of the temperature from Celsius to Fahrenheit formula is F = C(9 ⁄ 5) + 32.

     The Formula Used for Temperature Conversion of Fahrenheit and Kelvin is:
     The formula used to convert temperature from Fahrenheit to Kelvin is, K = (F − 32) × 5 ⁄ 9 + 273.15.
     The formula used to convert temperature from Kelvin to Fahrenheit is, F = (K – 273.15) × 9 ⁄ 5 + 32.

      Formula from : https://www.vedantu.com/maths/conversion-of-temperature# */

    private double celsius;
    private double fahrenheit;
    private double kelvin;
    public UnitConvertor (){}


    //Accessor for Celsius
    public double getCelsius() {
        return celsius;
    }

    //Mutator for Celsius
    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    //Accessor for Fahrenheit
    public double getFahrenheit() {
        return fahrenheit;
    }

    //Mutator for Fahrenheit
    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }


    //Accessor for Kelvin
    public double getKelvin() {
        return kelvin;
    }

    //Accessor for Kelvin
    public void setKelvin(double kelvin) {
        this.kelvin = kelvin;
    }

    public double calculateCToF (){ //method that returns a double of converted celsius to fahrenheit

        double convert = celsius * ((double) 9 / 5) + 32;
        return convert;
    }


}
