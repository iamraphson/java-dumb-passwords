/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicodelabs.jdp.test;

import com.unicodelabs.jdp.core.DumbPassword;
import com.unicodelabs.jdp.core.exceptions.IsNullException;
import java.io.IOException;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author Raphson
 */
public class DumbPasswordTest {
    
    DumbPassword dumbPasswords = new DumbPassword();
    
    @Test
    public void testAwesomePassword() throws IOException, IsNullException{
        assertFalse(dumbPasswords.checkPassword("auth0"));
        assertFalse(dumbPasswords.checkPassword("sTraigh8#@u"));
        assertFalse(dumbPasswords.checkPassword("Pass990ver"));
        assertFalse(dumbPasswords.checkPassword("ummoinnerEmbassava33"));
    }
    
    
    @Test
    public void testDumbPassword() throws IOException, IsNullException{
        assertTrue(dumbPasswords.checkPassword("password"));
        assertTrue(dumbPasswords.checkPassword("12345678"));
        assertTrue(dumbPasswords.checkPassword("PASSWORD"));
        assertTrue(dumbPasswords.checkPassword("superman"));
    }
    
    @Test(expected = IsNullException.class)
    public void testPasswordAsNull() throws IsNullException, IOException{
        dumbPasswords.checkPassword(null);
    }
    
    @Test(expected = IsNullException.class)
    public void testPasswordAsEmptyString() throws IsNullException, IOException{
        dumbPasswords.checkPassword(null);
    }
}
