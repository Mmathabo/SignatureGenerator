package za.co.emailsignature.app.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserDetailsTest {
    UserDetails userDetails =  new UserDetails("name", "surname", "role", "cellNumber");

    @Test
    public void testShouldConstructUserDetails() throws Exception {

        assertEquals("name", userDetails.getName());
        assertEquals("surname", userDetails.getSurname());
        assertEquals("role", userDetails.getRole());
        assertEquals("cellNumber", userDetails.getCellNumber());
        assertEquals("54 The Valley Road", userDetails.getAddressLine1());
        assertEquals("http://punk.digital", userDetails.getCompanyLink());
        assertEquals("+27 11 215 0000", userDetails.getOfficeNumber());

    }

    @Test
    public void testShouldFormatNameAndSurname() throws Exception {

        assertEquals("name surname", userDetails.formatNameAndSurname());

    }
}
