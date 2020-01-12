/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hospital.AdminSystem;

/**
 *
 * @author Luke
 */
public class AccountFactory {
    public AccountType makeAccountType(String type, String name, String sex, String age, String address, String ID, String password){
        
        AccountType AT = null;
        if(type.equals("Admin")){
            return new AdminType(name, sex, age, address, ID, password);
        }else if(type.equals("Doctor")){
            return new DocType(name, sex, age, address, ID, password);
        }else if(type.equals("Secretary")){
            return new SecType(name, sex, age, address, ID, password);
        }
        else return null;
    }
}
