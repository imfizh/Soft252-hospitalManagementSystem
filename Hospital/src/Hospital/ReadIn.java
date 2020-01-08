/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hospital;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Luke
 */
public class ReadIn{
    boolean found = false;
   String userID = "";
   String password = "";
   String name = "";
   String address = "";
   String sex = "";
   String age = "";
   public List<Person> people = new ArrayList<Person>();
   public List<Person> potentials = new ArrayList<Person>();
   public void Read() throws Exception{
   try {
            File f = new File("Users.txt");
            Scanner sc = new Scanner(f);

            //List<Person> people = new ArrayList<Person>();

            while(sc.hasNextLine() && !found){
                String line = sc.nextLine();
                String[] details = line.split(":");
                userID = details[0];
                password = details[1];
                name = details[2];
                address = details[3];
                sex = details[4];
                age = details[5];
                Person p = new Person(userID,password,name,address,sex,age);
                people.add(p);
                
                }
            
            sc.close();
            for(Person p: people){
                System.out.println(p.toString());
            }

   }catch (FileNotFoundException e) {         
            e.printStackTrace();
        }
   }
   public void ReadPotentials() throws Exception{
   try {
            File f = new File("AccountRequests.txt");
            Scanner sc = new Scanner(f);

            //List<Person> people = new ArrayList<Person>();

            while(sc.hasNextLine() && !found){
                String line = sc.nextLine();
                String[] details = line.split(":");
                name = details[0];
                address = details[1];
                sex = details[2];
                age = details[3];
                Person p = new Person(name,address,sex,age);
                potentials.add(p);
                
                }
            
            sc.close();
            for(Person p: potentials){
                System.out.println(p.toString());
            }

   }catch (FileNotFoundException e) {         
            e.printStackTrace();
        }
   }
}
   

