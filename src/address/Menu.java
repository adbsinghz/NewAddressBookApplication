package address;

import address.data.AddressBook;
import address.data.AddressEntry;

import java.util.Scanner;

public class Menu {
    /***
     * Prompts the user for a first name and return the string which
     * @return a new AddressEntry so you can add near entry, manually.
     */

    public static AddressEntry NewEntry() {

    return new AddressEntry(prompt_FirstName(),prompt_LastName(),prompt_Street(),prompt_City(),prompt_State(),prompt_Zip(),prompt_Email(),prompt_Telephone());

    }
    /**
     * Prompts the user for a First name
     * @return a String that is a first name
     */


    public static String prompt_FirstName(){

        Scanner keyboard = new Scanner(System.in);
        System.out.println("First Name: ");
        return keyboard.nextLine();
    }
    /**
     * Prompts the user for a last name
     * @return a String that is a last name
     */
    public static String prompt_LastName() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Last Name: ");
        return keyboard.nextLine();
    }
    /**
     * Prompts the user for a Street name
     * @return a String that is a Street name
     */
    public static String prompt_Street() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Street: ");
        return keyboard.nextLine();
    }
    /**
     * Prompts the user for a City name
     * @return a String that is a City name
     */
    public static String prompt_City() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("City: ");
        return keyboard.nextLine();
    }
    /**
     * Prompts the user for a State name
     * @return a String that is a State name
     */
    public static String prompt_State() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("State: ");
        return keyboard.nextLine();
    }
    /**
     * Prompts the user for a Zip code
     * @return a int that is a Zip code
     */

    public static Integer prompt_Zip() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Zip: ");
        return Integer.parseInt(keyboard.nextLine());
    }

    /**
     * Prompts the user for a Telephone
     * @return a String that is a PhoneNumber
     */
    public static String prompt_Telephone() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Telephone: ");
        return keyboard.nextLine();
        }

    /**
     * Prompts the user for an email address
     * @return a string
     */
    public static String prompt_Email() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Email: ");
        return keyboard.nextLine();
    }

    /**
     * Displays the menu for user to select any operation that listed
     * in AddressBook
     */
    public static void display_Menu() {
        System.out.print("\n\n********************\n" +
                "Please enter your menu selection\n"+
                "a) Loading From File\n"+
                "b) Addition\n"+
                "c) Remove \n" +
                "d) Find\n"+
                "e) Listing\n"+
                "f) Quit\n" +
                "**************************** \n\n");
    }



}

