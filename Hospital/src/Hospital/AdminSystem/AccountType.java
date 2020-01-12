/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hospital.AdminSystem;

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 *
 * @author Luke
 */
public abstract class AccountType {
    private String name;
    private String age;
    private String sex;
    private String address;
    private String ID;
    private String password;
    private String first;
    
    public void Create()throws Exception{
        BufferedWriter br = new BufferedWriter(new FileWriter(("Users.txt"),true));
        br.newLine();
        br.write(ID + ":" + password + ":" + name + ":" + address + ":" + sex + ":" + age);
        br.close();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }
    
}
