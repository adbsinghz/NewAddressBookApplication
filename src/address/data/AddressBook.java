package address.data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import address.Menu;

/***
 * @author arshdeepsingh
 * purpose:  class name AddressBook which holds the methods
 */
public class AddressBook {
    /**
     * Make a addressEntryList that holds last name as key and tree set has value;
     * Tree have nature of sort, sorted by last name.
     */
     TreeMap<String, TreeSet<AddressEntry>> addressEntryList = new TreeMap<>();

    /***
     * a method that return a set of address entries
     *
     * @param start_ln full last name or start of last name
     * @return  A TreeSet which contain all of the AddressEntry instances whose lastName field
     * matches from the start every char provided in starOf_lastname.
     */
     TreeSet<AddressEntry> getPre(String start_ln){
         SortedMap<String, TreeSet<AddressEntry>> tempMap;
         TreeSet<AddressEntry> tempSet = new TreeSet<>();
         tempMap = addressEntryList.subMap(start_ln, start_ln + Character.MAX_VALUE);
         for (Map.Entry<String, TreeSet<AddressEntry>> entry : tempMap.entrySet()){
             tempSet.addAll(entry.getValue());
         }
         return  tempSet;
     }


    /***
     * Method that Displays the list using to.string
     */

    public void list() {
        int count = 1;


        for (Map.Entry<String, TreeSet<AddressEntry>> entry : addressEntryList.entrySet()) {


            System.out.printf("%-3s" + entry.getValue().toString().replaceAll("[\\[\\],]","") + "\n\n", count + ":");

            count = count + 1;

        }

    }


    /***
     *
     * @param addressEntry adds to Treemap which has treeset as value and key has a last name
     */


    public void add(AddressEntry addressEntry) {
        TreeSet<AddressEntry> value = new TreeSet<>();
        value.add(addressEntry);
        addressEntryList.put(addressEntry.getPrompt_LastName(),value);

    }

    /***
     *
     * @param ln / Finds the name and list them
     */

    public void find(String ln){

        TreeSet<AddressEntry> s = this.getPre(ln);

        try{
            if(s.size()== 1){
                System.out.println(("The following entry was found in the address book. "));
                System.out.printf("%-3s" + s.first() + "\n",  " ");
            } else if(s.size() > 1){
                ArrayList<AddressEntry> list = new ArrayList<>();
                int i = 1;
                System.out.println("The following entries were found in the address book \n ");
                for(AddressEntry entry : s){
                    list.add(entry);
                    System.out.printf("%-3s" + entry + "\n\n", i + ":");
                    i++;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    /***
     *
     * @param ln Removes it from the list by using starting word or full last name
     *           also ask user to select element based on index
     */
    public void remove(String ln){
        // first obtain a set which contains all the address entries in addess book

        TreeSet<AddressEntry> s = this.getPre(ln);
        Scanner keyboard = new Scanner(System.in);

        try{
            if(s.size()== 1){
                System.out.println(("The following entry was found in the address book. "));
                System.out.printf("%-3s" + s.first() + "\n",  " ");
                System.out.println("Hit 'y' to remove the entry or 'n' to return to main menu" );
                if (keyboard.nextLine().compareTo("y")==0)
                    addressEntryList.get(s.first().getPrompt_LastName()).remove(s.first());
            } else if(s.size() > 1){
                ArrayList<AddressEntry> list = new ArrayList<>();
                int i = 1;
                System.out.println("The following entries were found in the address book,"
                + "select number of entry you wish to remove: \n");

                for(AddressEntry entry : s){
                    list.add(entry);
                    System.out.printf("%-3s" + entry + "\n\n", i + ":");
                    i++;
                }
                int a = keyboard.nextInt();
                String z = list.get(a-1).getPrompt_LastName();
                remove(z);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    /***
     *
     * @param filename Reads from the file and makes instance of AddressEntry.
     */

    public void readFromFile(String filename){
        try{

            File file = new File(filename);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            //counter number of entries
            String fn, ln ;


            //read from file
            while((line=br.readLine()) != null) {
                //this.add(new AddressEntry(line,line,line,line,line,Integer.parseInt(br.readLine()),line,line));
                add(new AddressEntry(line, br.readLine(), br.readLine(), br.readLine(), br.readLine(), Integer.parseInt(br.readLine()), br.readLine(), br.readLine()));

            }

            br.close();
            fr.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }

}
