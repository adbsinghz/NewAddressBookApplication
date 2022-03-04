package address;

import address.data.*;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

/***
 * Made a class called AddressBookApplication    .
 */


public class AddressBookApplication {
    /**
     * Creates an AddressBook initializes the AddressBook with some AddressEntry
     *then prompts the user to add, delete, list and search from the entries.
     * @param args command line arguments passed to main
     */
    public static void main(String[] args) {

        //creates instance of AddressBook
        AddressBook ab = new AddressBook();
        initAddressBookExercise(ab);


        //Allows the user to select an option from Menu
        Scanner keyboard = new Scanner(System.in);
        String answer;

        boolean continue_ = true;
        while(continue_){

            //Displaying menu
            Menu.display_Menu();
            answer = keyboard.nextLine();
            System.out.println("\n\n");

            switch(answer){
                case "a" -> {

                    System.out.println("Enter Directory or Name of the file");
                    ab.readFromFile(keyboard.nextLine());
                    //ab.readFromFile("/Users/arshdeepsingh/Desktop/testfile.txt");
                }
                case "b" -> ab.add(Menu.NewEntry());
                case "c"-> {//remove an address entry
                    System.out.println("Enter in Last Name of contract to remove");
                    ab.remove(keyboard.nextLine());
                }
                case "d" ->{
                    System.out.println("Enter in all or beginnig of last name");
                    ab.find(keyboard.nextLine());
                }
                case "e" -> ab.list(); //sorted address entry
                case "f" -> {
                    System.out.println("Quitting. ");
                    continue_=false;
                }
                default -> System.out.println("Error "+ answer + " is not a valid entry");



            }
        }




    }

    /**
     * initializes 2 AddressEntry instances with hard-coded data. Then adds entries to AddressBook class passed to function.
     * @param ab is an instance of AddressBook class
     */

    public static void initAddressBookExercise(AddressBook ab) {
        AddressEntry ab1 = new AddressEntry("Arsh","Singh","Red Ribbon","Manteca","CA",95337,"209-455-4111","arshsingha00@gmail.com");
        AddressEntry ab3 = new AddressEntry("Arfsdsh","Sinfdfdgh","Refdfdd Ribbon","Mantfdfdeca","CgdgA",953337,"209-45f5-4111","arshsinggha00g@gmail.com");

        AddressEntry ab2 = new AddressEntry("Arsh","Singh","Red Ribbon","Manteca","CA",95337,"209-455-4111","arshsingha00@gmail.com");

        ab.add(ab1);
        ab.add(ab3);
        ab.add(ab2);

    }

}
