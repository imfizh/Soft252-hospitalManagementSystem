/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hospital;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Luke
 */
public class ReadInTest {
    ReadIn RI = new ReadIn();
    public ReadInTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    
    try {
    RI.Read();
    }catch (Exception ex) {
    Logger.getLogger(ReadInTest.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testRead() throws Exception {
        fail("no test");
    }

    @Test
    public void testReadPotentials() throws Exception {
        fail("no test");
    }
    @Test
    public void testTestName(){
    System.out.println("Testing isComplete");
    String name = RI.TestName(1);
    assertEquals("name",name);
    // This test should work but I get an error saying no tests performed and I can't figure out why
    }
    
}
