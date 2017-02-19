package za.co.emailsignature.app.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserDetailsTest {

    @Test
    public void testShouldConstructUserDetails() throws Exception {

        UserDetails userDetails =  new UserDetails("name", "surname", "role", "cellNumber");

        assertEquals("name", userDetails.getName());
        assertEquals("surname", userDetails.getSurname());
        assertEquals("role", userDetails.getRole());
        assertEquals("cellNumber", userDetails.getCellNumber());
        assertEquals("54 The Valley Road", userDetails.getAddressLine1());
        assertEquals("http://punk.digital", userDetails.getCompanyLink());
        assertEquals("+27 11 215 0000", userDetails.getOfficeNumber());

    }
}
