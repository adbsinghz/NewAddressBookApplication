package address.data;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * Unit Testing class for AddressBook class
 */

class AddressBookTest {





    @Test
    void list() {
        var ae = new AddressBook();
        AddressEntry a = new AddressEntry("Arsh","Singh","Red Ribbon","Manteca","CA",95337,"arshsingha00@gmail.com","209-455-4111");
        ae.add(a);
        ae.list();
        String y = ae.addressEntryList.get(a.getPrompt_LastName().toString()).toString();



    }

    @Test
    void add() {
        var ae = new AddressBook();
        AddressEntry a = new AddressEntry("Arsh","Singh","Red Ribbon","Manteca","CA",95337,"arshsingha00@gmail.com","209-455-4111");
        ae.add(a);


    }


    @Test
    void find() {
    }

    @Test
    void remove() {
        var ae = new AddressBook();
        AddressEntry a = new AddressEntry("Arsh","Singh","Red Ribbon","Manteca","CA",95337,"arshsingha00@gmail.com","209-455-4111");
        String y = a.getPrompt_LastName();
        ae.remove(y);
    }

    @Test
    void readFromFile() {
    }
}