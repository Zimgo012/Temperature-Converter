/* Program by: John Rycca Belcina
   Date Started : April 04, 2024
 */


/* Main class for Temperature Converter Project */
public class Driver {

    public static void main(String[] args) {

        User user1 = new User();
        UnitSelector unitSelector = new UnitSelector();

        String respond;

        System.out.println("Temperature Converter");
        System.out.println("=====================");
    do {
        //Let user choose from the choices for the base unit.
        user1.setChoice1(User.inputFirstInteger("""
                Please choose the unit you wish to convert from:
                                            
                Press [1] for Celsius
                Press [2] for Fahrenheit \s
                Press [3] for Kelvin    \n"""));

        //Let user choose from the choices for the derive unit.
        user1.setChoice2(User.inputSecondInteger("""
                Choose the unit you want to convert to:
                                            
                Press [1] for Celsius
                Press [2] for Fahrenheit \s
                Press [3] for Kelvin   \n"""));


        unitSelector.selector(user1.getChoice1(), user1.getChoice2());

        respond = User.inputRespond("Would you like to perform another conversion?" +
                                    " Please respond with either \"YES\" or \"NO\".\n");

    } while(respond.equalsIgnoreCase("YES"));

        System.out.println("Thank you for using this application!");
        System.out.println("Program by: John Rycca Belcina");


    }
}
