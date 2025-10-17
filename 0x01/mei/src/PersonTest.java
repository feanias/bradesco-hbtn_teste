import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class PersonTest {

    private Person person;

    @BeforeEach
    public void setup() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date birthDate = sdf.parse("01-01-2000");
        person = new Person("Paul", "McCartney", birthDate, true, true, true);
    }

    @Test
    public void show_full_name(){
        assertEquals("Paul McCartney", person.fullName());
    }

    @Test
    public void test_calculateYearlySalary(){
        person.setSalary(1200);
        assertEquals(14400, person.calculateYearlySalary(), 0);
    }

    @Test
    public void person_is_MEI(){
        person.setSalary(10000);
        person.setAnotherCompanyOwner(false);
        person.setPensioner(false);
        person.setPublicServer(false);

        assertTrue(person.isMEI());
    }

    @Test
    public void person_is_not_MEI(){
        person.setSalary(13000);
        person.setAnotherCompanyOwner(true);

        assertFalse(person.isMEI());
    }
}