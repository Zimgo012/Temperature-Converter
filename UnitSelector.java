/* This  class manages unit conversions through users choices.
It uses switch-case statements to handle different unit combinations.
 */


public class UnitSelector {

    UnitConvertor unitConvertor = new UnitConvertor();
    User user = new User();

    public UnitSelector(){}

    //Added Case switch statement for corresponding output for the user.

    public  void selector (int baseUnit, int derivedUnit ){

        switch (baseUnit) {
            case 1:
                switch (derivedUnit) {
                    case 2:
                        System.out.println("Celsius to Fahrenheit"); //added first functional converter (C to F)
                        unitConvertor.setCelsius(User.inputUnit("Please input number of Celsius: \n"));
                        System.out.println("Fahrenheit: " + unitConvertor.calculateCToF());
                        break;
                    case 3:
                        System.out.println("Celsius to Kelvin"); //ToDO: complete this
                        break;

                }
                break;
            case 2:
                switch (derivedUnit) {
                case 1:
                    System.out.println("Fahrenheit to Celsius"); //ToDo: complete this
                    break;
                case 3:
                    System.out.println("Fahrenheit to Kelvin"); //ToDO: complete this
                    break;

            }
            break;
            case 3:
                switch (derivedUnit){
                    case 1:
                        System.out.println("Kelvin to Celsius"); //ToDO: Complete this
                        break;
                    case 2:
                        System.out.println("Kelvin to Fahrenheit"); //ToDo: Complete this
                }

        }
    }
}
