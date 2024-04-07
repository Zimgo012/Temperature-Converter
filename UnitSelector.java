/* This  class manages unit conversions through users choices.
It uses switch-case statements to handle different unit combinations.
 */


public class UnitSelector {

    UnitConvertor unitConvertor = new UnitConvertor();


    public UnitSelector(){}


    public  void selector (int baseUnit, int derivedUnit ){

        switch (baseUnit) {
            case 1:
                switch (derivedUnit) {
                    case 2: // converts Celsius to Fahrenheit
                        System.out.println("Celsius to Fahrenheit");
                        unitConvertor.setCelsius(User.inputUnit("Please input number of Celsius: \n"));
                        System.out.printf("Fahrenheit: %.2f", unitConvertor.calculateCToF()); //method
                        break;
                    case 3: //converts Celsius to Kelvin
                        System.out.println("Celsius to Kelvin");
                        unitConvertor.setCelsius(User.inputUnit("Please input number of Celsius: \n"));
                        System.out.printf("Kelvin: %.2f", unitConvertor.calculateCToK()); //method
                        break;

                }
                break;
            case 2:
                switch (derivedUnit) {
                case 1: // converts Fahrenheit to Celsius
                    System.out.println("Fahrenheit to Celsius");
                    unitConvertor.setFahrenheit(User.inputUnit("Please input number of Fahrenheit: \n"));
                    System.out.printf("Celsius: %.2f", unitConvertor.calculateFToC()); //method
                    break;
                case 3: // converts Fahrenheit to Kelvin
                    System.out.println("Fahrenheit to Kelvin");
                    unitConvertor.setFahrenheit(User.inputUnit("Please input number of Fahrenheit: \n"));
                    System.out.printf("Kelvin: %.2f", unitConvertor.calculateFToK()); //method
                    break;

            }
            break;
            case 3:
                switch (derivedUnit){
                    case 1: // converts Kelvin to Celsius
                        System.out.println("Kelvin to Celsius");
                        unitConvertor.setKelvin(User.inputUnit("Please input number of Kelvin: \n"));
                        System.out.printf("Celsius: %.2f", unitConvertor.calculateKToC()); //method
                        break;
                    case 2: // convert Kelvin to Fahrenheit
                        System.out.println("Kelvin to Fahrenheit");
                        unitConvertor.setKelvin(User.inputUnit("Please input number of Kelvin: \n"));
                        System.out.printf("Fahrenheit: %.2f", unitConvertor.calculateKToF()); //method
                }

        }
    }
}
