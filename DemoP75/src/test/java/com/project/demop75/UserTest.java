package com.project.demop75;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit test for User class.
 */
public class UserTest {
    private User user; // Đối tượng để test

    @Before
    public void setUp() {
        user = new User("U001", "test@example.com");
    }

    @After
    public void tearDown() {
        user = null;
    }

    /**
     * Test getEmail() method.
     */
    @Test
    public void testGetEmail() {
        System.out.println("Testing getEmail()");
        String expectedEmail = "test@example.com";
        assertEquals(expectedEmail, user.getEmail());
    }

    /**
     * Test setEmail() method.
     */
    @Test
    public void testSetEmail() {
        System.out.println("Testing setEmail()");
        String newEmail = "new@example.com";
        user.setEmail(newEmail);
        assertEquals(newEmail, user.getEmail());
    }

    /**
     * Test updateEmail() method.
     */
    @Test
    public void testUpdateEmail() {
        System.out.println("Testing updateEmail()");
        String updatedEmail = "updated@example.com";
        user.updateEmail(updatedEmail);
        assertEquals(updatedEmail, user.getEmail());
    }

    /**
     * Test main() method (chỉ chạy, không kiểm tra logic).
     */
    @Test
    public void testMain() {
        System.out.println("Testing main()");
        User.main(new String[]{});
    }
}
