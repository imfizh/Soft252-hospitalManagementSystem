/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hospital;
import java.io.Serializable;
/**
 *
 * @author Luke
 */
public class Patient implements Serializable{
    private String name;
    private int age;
    private String sex;
    private String userID;
    private String password;

    
    public Patient(String aName, int anAge, String aSex, String aUserID, String aPassword){
       name = aName;
       age = anAge;
       sex = aSex;
       userID = aUserID;
       password = aPassword;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public String getUserID() {
        return userID;
    }

    public String getPassword() {
        return password;
    }
    
}
