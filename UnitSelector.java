/* This  class manages unit conversions through users choices.
It uses switch-case statements to handle different unit combinations.
 */

public class UnitSelector {

    UnitConvertor unitConvertor = new UnitConvertor();


    public UnitSelector(){}


    public  void selector (int baseUnit, int derivedUnit ){
                String respond; // store respond

        switch (baseUnit) {
            case 1:
                switch (derivedUnit) {
                    case 2: // converts Celsius to Fahrenheit
                        do {


                            System.out.println("Celsius to Fahrenheit");
                            System.out.println("=====================");
                            unitConvertor.setCelsius(User.inputUnit("Please enter Celsius value: \n"));
                            System.out.printf("Fahrenheit: %.2f %n", unitConvertor.calculateCToF()); //method

                            respond = User.inputRespond("Convert again? YES / NO\n");


                        } while (respond.equalsIgnoreCase("YES"));
                        break;

                    case 3: //converts Celsius to Kelvin

                        do {

                            System.out.println("Celsius to Kelvin");
                            System.out.println("=================");
                            unitConvertor.setCelsius(User.inputUnit("Please enter Celsius value: \n"));
                            System.out.printf("Kelvin: %.2f %n", unitConvertor.calculateCToK()); //method

                            respond = User.inputRespond("Convert again? YES / NO\n");

                        } while (respond.equalsIgnoreCase("YES"));
                        break;

                }
                break;
            case 2:
                switch (derivedUnit) {
                case 1: // converts Fahrenheit to Celsius
                    do {
                        System.out.println("Fahrenheit to Celsius");
                        System.out.println("=====================");
                        unitConvertor.setFahrenheit(User.inputUnit("Please enter Fahrenheit value: \n"));
                        System.out.printf("Celsius: %.2f %n", unitConvertor.calculateFToC()); //method

                        respond = User.inputRespond("Convert again? YES / NO\n");

                    } while (respond.equalsIgnoreCase("YES"));
                    break;
                case 3: // converts Fahrenheit to Kelvin
                    do {
                        System.out.println("Fahrenheit to Kelvin");
                        System.out.println("====================");
                        unitConvertor.setFahrenheit(User.inputUnit("Please enter Fahrenheit value: \n"));
                        System.out.printf("Kelvin: %.2f %n", unitConvertor.calculateFToK()); //method

                        respond = User.inputRespond("Convert again? YES / NO\n");

                    } while (respond.equalsIgnoreCase("YES"));
                    break;

            }
            break;
            case 3:
                switch (derivedUnit){
                    case 1: // converts Kelvin to Celsius
                        do {
                            System.out.println("Kelvin to Celsius");
                            System.out.println("=================");
                            unitConvertor.setKelvin(User.inputUnit("Please enter Kelvin value: \n"));
                            System.out.printf("Celsius: %.2f %n", unitConvertor.calculateKToC()); //method

                            respond = User.inputRespond("Convert again? YES / NO\n");

                        } while (respond.equalsIgnoreCase("YES"));
                        break;
                    case 2: // convert Kelvin to Fahrenheit
                        do {
                            System.out.println("Kelvin to Fahrenheit");
                            System.out.println("====================");
                            unitConvertor.setKelvin(User.inputUnit("Please enter Kelvin value: \n"));
                            System.out.printf("Fahrenheit: %.2f %n", unitConvertor.calculateKToF()); //method

                            respond = User.inputRespond("Convert again? YES / NO\n");

                        } while (respond.equalsIgnoreCase("YES"));
                        break;
                }

        }
    }
}
