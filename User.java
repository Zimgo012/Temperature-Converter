/* This class helps users input numbers for temperature conversions.
It provides methods to set and get the user's choices for base and derived units.
These methods make sure the input is correct by repeating the process until a valid number is given.
This makes the program more reliable.
 */


import java.util.Scanner;

public class User {

    private static final Scanner userScan = new Scanner(System.in);

    private int choice1;

    private int choice2;
    public User (){
        this.choice1 = 0;
        this.choice2 = 0;
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
        return inputInteger();
    }

    public static int inputSecondInteger(String message) {
        System.out.printf("%s", message);
        return inputInteger();
    }

    public static double inputUnit(String message) {
        // This method calls inputDouble(), so no changes are needed here.
        System.out.printf("%s", message);
        return inputDouble();
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
                        System.err.println("Please respond [1] or [2] or [3] only");
                    }



            }
            else {
                System.err.print("Invalid input!\n");
                System.out.println("Enter a number:");
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
                isInputBad = false;
            }
            else {
                System.err.print("Invalid input!\n");
                System.out.println("Enter a number:");
                userScan.nextLine(); // clean up input stream
            }



        }
        return  value;
    }
 public static String inputRespond(String message){
     System.out.printf("%s", message);
     return inputRespond();
 }

 private static String inputRespond(){
        boolean isInputBad = true;
        String input = "";

        while(isInputBad){
            if(userScan.hasNextLine()){
                input = userScan.nextLine();



                if ((input.equalsIgnoreCase("yes")) || (input.equalsIgnoreCase("NO")) ){
                    isInputBad = false;
                }else {
                    System.err.println("Invalid input!\n");
                    System.out.println("Enter YES or NO.");


                }
            }
        }
        return input;
 }



}
