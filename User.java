import java.util.Scanner;

public class User {

    private static final Scanner userScan = new Scanner(System.in);

    private int choice1;

    private int choice2;
    public User (){

    }

    public int getChoice1() {
        return choice1;
    }

    public void setChoice1(int baseUnit) {
        this.choice1 =  baseUnit;
    }

    public int getChoice2() {
        return choice2;
    }

    public void setChoice2(int derivedUnit) {
        this.choice2 =  derivedUnit;
    }


    public static int inputFirstInteger(String message) {
        System.out.printf("%s", message);
        int value = inputInteger();
        return value;
    }

    public static int inputSecondInteger(String message) {
        System.out.printf("%s", message);
        int value = inputInteger();
        return value;
    }

    public static double inputDouble(String message) {
        // This method calls inputDouble(), so no changes are needed here.
        System.out.printf("%s", message);
        double value = inputDouble();
        return value;
    }


    /*
     * Does not prompt the user, reads in an int value when there is one. If
     * the user does not provide input that can be converted into an int an
     * error message is printed requesting a correct input and a loop is used
     * to trap the user until they get this right. A future version of
     * the program might have a sanity check to break the loop after several
     * failed attempts and then shut down the program, rather than looping
     * (in theory) forever.
     * private access modifier prohibits use of method from outside of the class
     * forcing the use of the method that accepts the String prompt in order
     * to get the value.
     * */
    private static int inputInteger() {

        boolean isInputBad = true;
        int value = 0;

        while(isInputBad) {
            if(userScan.hasNextInt()) {
                value = userScan.nextInt();
                userScan.nextLine(); // clean up input stream



                    if (value == 1 || value == 2 || value == 3) {
                        isInputBad = false;

                    } else {
                        System.out.println("Please enter 1 or 2 or 3 only");
                        isInputBad = true;

                    }



            }
            else {
                System.out.print("Invalid input. Enter an integer number: ");
                userScan.nextLine(); // clean up input stream
            }



        }
        return value;
    }

    /*
     * Does not prompt the user, reads in double value when there is one. If
     * the user does not provide input that can be converted into a double an
     * error message is printed requesting a correct input and a loop is used
     * to trap the user until they get this right. A future version of
     * the program might have a sanity check to break the loop after several
     * failed attempts and then shut down the program, rather than looping
     * (in theory) forever.
     * private access modifier prohibits use of method from outside of the class
     * forcing the use of the method that accepts the String prompt in order
     * to get the value.
     * */
    private static double inputDouble() {
        boolean isInputBad = true;
        double value = 0.0;

        while(isInputBad) {
            if(userScan.hasNextDouble()) {
                value = userScan.nextDouble();
                userScan.nextLine(); // clean up input stream



                if (value == 1 || value == 2 || value == 3) {
                    isInputBad = false;

                } else {
                    System.out.println("Please enter 1 or 2 or 3 only");
                    isInputBad = true;

                }



            }
            else {
                System.out.print("Invalid input. Enter an integer number: ");
                userScan.nextLine(); // clean up input stream
            }



        }
        return  value;
    }


}
