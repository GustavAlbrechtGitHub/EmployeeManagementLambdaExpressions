package StaffManagementProjectPackage;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Utilities {


    static Scanner sc = new Scanner(System.in);

    public static int getIntInput() {

        int input = 0;

        while (true) {
            try {
                input = sc.nextInt();
                return input;

            } catch (InputMismatchException e) {

                System.out.println("Endast numeriska värden tack");
            } finally {
                sc.nextLine();

            }

        }
    }



    public static double getDoubleInput() {


        double input = 0;

        while (true) {
            try {
                input = sc.nextDouble();
                return input;

            } catch (InputMismatchException e) {
                System.out.print("Wrong input, please insert number : ");
            } finally {
                sc.nextLine();
            }

        }


    }




    public static String getStringInput(){

        String input = sc.nextLine();

        return input;
    }

    public static String fixString(int wantedSize, String stringToFix){
        if (stringToFix.length()< wantedSize){
            while(stringToFix.length()<wantedSize){
                stringToFix = stringToFix + " ";

            }
            return stringToFix+"  ";
        }
        else
            return stringToFix.substring(0, wantedSize)+"  ";

    }


}




