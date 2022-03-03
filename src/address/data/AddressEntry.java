package address.data;

//import org.jetbrains.annotations.NotNull;

import java.util.Comparator;

/***
 * purpose: This class is used to contain and provide data necessary
 */


public class AddressEntry implements Comparable<AddressEntry> {
    private String prompt_FirstName ;
    private String prompt_LastName;
    private String prompt_Street;
    private String prompt_City;
    private String prompt_State;
    private Integer prompt_Zip;
    private String prompt_Telephone;
    private String prompt_Email;

    /***
     * Default constructor
     */

    public AddressEntry(){

    }

    /***
     * Parameterized constructor that allows fast creation of an instance of this class
     * @param FirstName Takes in First Name in string
     * @param LastName  Takes in Last Name in string
     * @param Street    Takes in Street Name in string
     * @param City      Takes in City Name in string
     * @param State     Takes in State Name in string
     * @param Zip       Takes in  Zip number in int
     * @param Email     Takes in Email address in string
     * @param Telephone Takes in Telephone in string
     */
    public AddressEntry(String FirstName, String LastName, String Street, String City, String State, Integer Zip, String Email, String Telephone) {
        this.prompt_FirstName = FirstName;
        this.prompt_LastName = LastName;
        this.prompt_Street = Street;
        this.prompt_City = City;
        this.prompt_State = State;
        this.prompt_Zip = Zip;
        this.prompt_Telephone = Telephone;
        this.prompt_Email = Email;
    }

    /***
     *
     * @return to string method to display
     */
    public String toString() {
        return (this.prompt_FirstName  + " " +this.prompt_LastName + "\n" +
           this.prompt_Street + "\n" + this.prompt_City  + ", " + this.prompt_State + " " + this.prompt_Zip  +
                "\n" + this.prompt_Email + "\n" + this.prompt_Telephone + "\n");
    }

    /***
     *
     * @return the First Name
     */

    public String getPrompt_FirstName() {
        return prompt_FirstName;
    }

    /***
     *
     * @param prompt_FirstName Sets the First name in Strings
     */

    public void setPrompt_FirstName(String prompt_FirstName) {
        this.prompt_FirstName = prompt_FirstName;
    }
    /***
     *
     * @return the Last Name in Strings
     */

    public String getPrompt_LastName() {
        return prompt_LastName;
    }
    /***
     *
     *  Sets the First Name in Strings
     * @param prompt_LastName Passes a string that is Last Name
     */

    public void setPrompt_LastName(String prompt_LastName) {
        this.prompt_LastName = prompt_LastName;
    }
    /***
     *
     * @return the Street Name in Strings
     */

    public String getPrompt_Street() {
        return prompt_Street;
    }
    /***
     *
     *  Set the Street Name in Strings
     */
    public void setPrompt_Street(String prompt_Street) {
        this.prompt_Street = prompt_Street;
    }

    /***
     *
     * @return the City Name in Strings
     */

    public String getPrompt_City() {
        return prompt_City;
    }
    /***
     *
     * Sets the City Name in Strings
     */

    public void setPrompt_City(String prompt_City) {
        this.prompt_City = prompt_City;
    }
    /***
     *
     * @return the States Name in Strings
     */

    public String getPrompt_State() {
        return prompt_State;
    }
    /***
     *
     *  Sets the States Name in Strings
     */

    public void setPrompt_State(String prompt_State) {
        this.prompt_State = prompt_State;
    }
    /***
     *
     * @return the Zip Number in Int
     */


    public Integer getPrompt_Zip() {
        return prompt_Zip;
    }
    /***
     *
     */

    public void setPrompt_Zip(Integer prompt_Zip) {
        this.prompt_Zip = prompt_Zip;
    }
    /***
     *
     * @return the Phone Number in String
     */

    public String getPrompt_Telephone() {
        return prompt_Telephone;
    }
    /***
     *
     *  Set the Phone Number in String
     */

    public void setPrompt_Telephone(String prompt_Telephone) {
        this.prompt_Telephone = prompt_Telephone;
    }
    /***
     *
     * @return the Email in String
     */

    public String getPrompt_Email() {
        return prompt_Email;
    }
    /***
     *
     * Sets the Email in String
     */

    public void setPrompt_Email(String prompt_Email) {
        this.prompt_Email = prompt_Email;
    }

    /***
     *
     * @param o Passes other object and compare with last name
     * @return if its true or false
     */

    @Override
    public int compareTo(AddressEntry o) {
        return this.getPrompt_LastName().compareTo(o.getPrompt_LastName());
    }
}
