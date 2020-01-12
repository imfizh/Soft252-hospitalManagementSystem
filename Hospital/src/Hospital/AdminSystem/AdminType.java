/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hospital.AdminSystem;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luke
 */
public class AdminType extends AccountType{
    public AdminType(String name, String sex, String age, String address, String ID, String password){
        setName(name);
        setSex(sex);
        setAge(age);
        setAddress(address);
        setID("A"+ID);
        setPassword(password);
        try {
            Create();
        } catch (Exception ex) {
            Logger.getLogger(AdminType.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
