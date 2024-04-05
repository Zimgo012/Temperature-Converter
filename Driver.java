/* Program by: John Rycca Belcina
   Date Started : April 04, 2024
 */


/* Main class for Temperature Converter Project */
public class Driver {

    public static void main(String[] args) {

        User user1 = new User();
        UnitSelector unitSelector = new UnitSelector();

        System.out.println("Welcome to Temperature Converter");

        //Let user choose from the choices for the base unit.
        user1.setChoice1(User.inputFirstInteger("""
                            Select unit to convert from:
                            
                            Press [1] for Celsius
                            Press [2] for Fahrenheit \s
                            Press [3] for Kelvin    \n"""));

        //Let user choose from the choices for the derive unit.
       user1.setChoice2(User.inputSecondInteger("""
                            Convert To:
                            
                            Press [1] for Celsius
                            Press [2] for Fahrenheit \s
                            Press [3] for Kelvin   \n"""));


        unitSelector.selector(user1.getChoice1(), user1.getChoice2());





    }
}
