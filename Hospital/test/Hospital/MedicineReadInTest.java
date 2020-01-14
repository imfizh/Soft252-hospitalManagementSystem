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
public class MedicineReadInTest {
    MedicineReadIn MRI = new MedicineReadIn();
    public MedicineReadInTest() {
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
            MRI.Read();
        } catch (Exception ex) {
            Logger.getLogger(MedicineReadInTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testRead() throws Exception {
    }
    @Test
    public void testTestName(){
    System.out.println("Testing isComplete");
    String name = MRI.TestName(0);
    assertEquals("Amoxicillin",name);
    }
}
