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
public class DocType extends AccountType{
    public DocType(String name, String sex, String age, String address, String ID, String password){
        setName(name);
        setSex(sex);
        setAge(age);
        setAddress(address);
        setID("D"+ID);
        setPassword(password);
        try {
            Create();
        } catch (Exception ex) {
            Logger.getLogger(AdminType.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
