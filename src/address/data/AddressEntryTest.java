package address.data;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * Unit Testing class for AddressEntry class
 */

class AddressEntryTest {

    @Test
    void testToString() {


    }



    @Test
    void getPrompt_FirstName() {
        /***
         * Tests if the getPrompt_FirstName() is working.
         */
        AddressEntry ae = new AddressEntry("Arsh","Singh","Red Ribbon","Manteca","CA",95337,"arshsingha00@gmail.com","209-455-4111");
        assertEquals(ae.getPrompt_FirstName(),"Arsh");

    }

    @Test

    void setPrompt_FirstName() {
        /***
         * Method test if the setPrompt_FirstName() sets name and passing the tests.
         */
        AddressEntry ae = new AddressEntry("Arsh","Singh","Red Ribbon","Manteca","CA",95337,"arshsingha00@gmail.com","209-455-4111");
        ae.setPrompt_FirstName("Testing");
        assertEquals(ae.getPrompt_FirstName(),"Testing");
    }

    @Test

    void getPrompt_LastName() {
        /***
         * Method test if the getPrompt_LastName() and passing the tests.
         */
        AddressEntry ae = new AddressEntry("Arsh","Singh","Red Ribbon","Manteca","CA",95337,"arshsingha00@gmail.com","209-455-4111");
        assertEquals(ae.getPrompt_LastName(),"Singh");

    }


    @Test
    void setPrompt_LastName() {
        /***
         * Method test if the setPrompt_LastName() sets name and passing the tests.
         */
        AddressEntry ae = new AddressEntry("Arsh","Singh","Red Ribbon","Manteca","CA",95337,"arshsingha00@gmail.com","209-455-4111");        ae.setPrompt_LastName("Testing");
        assertEquals(ae.getPrompt_LastName(),"Testing");

    }

    @Test
    void getPrompt_Street() {
        /***
         * Method test if the getPrompt_Street() get Streets name and passing the tests.
         */
        AddressEntry ae = new AddressEntry("Arsh","Singh","Red Ribbon","Manteca","CA",95337,"arshsingha00@gmail.com","209-455-4111");
        assertEquals(ae.getPrompt_Street(),"Red Ribbon");

    }

    @Test
    void setPrompt_Street() {
        /***
         * Method test if the setPrompt_Street() set Streets name and passing the tests.
         */
        AddressEntry ae = new AddressEntry("Arsh","Singh","Red Ribbon","Manteca","CA",95337,"arshsingha00@gmail.com","209-455-4111");
        ae.setPrompt_Street("Testing");
        assertEquals(ae.getPrompt_Street(),"Testing");


    }

    @Test
    void getPrompt_City() {
        /***
         * Method test if the getPrompt_City() get City name and passing the tests.
         */
        AddressEntry ae = new AddressEntry("Arsh","Singh","Red Ribbon","Manteca","CA",95337,"arshsingha00@gmail.com","209-455-4111");
        assertEquals(ae.getPrompt_City(),"Manteca");

    }

    @Test
    void setPrompt_City() {
        /***
         * Method test if the setPrompt_City() set City name and passing the tests.
         */
        AddressEntry ae = new AddressEntry("Arsh","Singh","Red Ribbon","Manteca","CA",95337,"arshsingha00@gmail.com","209-455-4111");
        ae.setPrompt_City("Testing");
        assertEquals(ae.getPrompt_City(),"Testing");

    }

    @Test
    void getPrompt_State() {
        /***
         * Method test if the getPrompt_State() get State name and passing the tests.
         */
        AddressEntry ae = new AddressEntry("Arsh","Singh","Red Ribbon","Manteca","CA",95337,"arshsingha00@gmail.com","209-455-4111");
        assertEquals(ae.getPrompt_State(),"CA");

    }

    @Test
    void setPrompt_State() {
        /***
         * Method test if the setPrompt_State() set State name and passing the tests.
         */
        AddressEntry ae = new AddressEntry("Arsh","Singh","Red Ribbon","Manteca","CA",95337,"arshsingha00@gmail.com","209-455-4111");
        ae.setPrompt_State("Testing");
        assertEquals(ae.getPrompt_State(),"Testing");


    }

    @Test
    void getPrompt_Zip() {
        /***
         * Method test if the getPrompt_Zip() get Zip number and passing the tests.
         */
        AddressEntry ae = new AddressEntry("Arsh","Singh","Red Ribbon","Manteca","CA",95337,"arshsingha00@gmail.com","209-455-4111");
        assertEquals(ae.getPrompt_Zip(),95337);

    }

    @Test
    void setPrompt_Zip() {
        /***
         * Method test if the setPrompt_Zip() set Zip number and passing the tests.
         */
        AddressEntry ae = new AddressEntry("Arsh","Singh","Red Ribbon","Manteca","CA",95337,"arshsingha00@gmail.com","209-455-4111");
        ae.setPrompt_Zip(95337);
        assertEquals(ae.getPrompt_Zip(),95337);
    }

    @Test
    void getPrompt_Telephone() {
        /***
         * Method test if the getPrompt_Telephone() set Telephone Sting and passing the tests.
         */
        AddressEntry ae = new AddressEntry("Arsh","Singh","Red Ribbon","Manteca","CA",95337,"arshsingha00@gmail.com","209-455-4111");
        assertEquals(ae.getPrompt_Telephone(),"209-455-4111");

    }

    @Test
    void setPrompt_Telephone() {
        /***
         * Method test if the setPrompt_Telephone() set Telephone string and passing the tests.
         */
        AddressEntry ae = new AddressEntry("Arsh","Singh","Red Ribbon","Manteca","CA",95337,"arshsingha00@gmail.com","209-455-4111");
        ae.setPrompt_Telephone("Testing");
        assertEquals(ae.getPrompt_Telephone(),"Testing");

    }

    @Test
    void getPrompt_Email() {
        /***
         * Method test if the getPrompt_Email() get Email address and passing the tests.
         */
        AddressEntry ae = new AddressEntry("Arsh","Singh","Red Ribbon","Manteca","CA",95337,"arshsingha00@gmail.com","209-455-4111");
        assertEquals(ae.getPrompt_Email(),"arshsingha00@gmail.com");


    }

    @Test
    void setPrompt_Email() {
        /***
         * Method test if the setPrompt_Email() set Email address and passing the tests.
         */
        AddressEntry ae = new AddressEntry("Arsh","Singh","Red Ribbon","Manteca","CA",95337,"arshsingha00@gmail.com","209-455-4111");
        ae.setPrompt_Email("Testing");
        assertEquals(ae.getPrompt_Email(),"Testing");

    }

    @Test
    void compareTo() {
    }
}