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
public class MedicineReadIn {
    String name = "";
   String stock = "";
   boolean found = false;
   public List<Medicine> medicine = new ArrayList<Medicine>();
   public void Read() throws Exception{
   try {
            File f = new File("Medicines.txt");
            Scanner sc = new Scanner(f);
            while(sc.hasNextLine() && !found){
                String line = sc.nextLine();
                String[] details = line.split(":");
                name = details[0];
                stock = details[1];
                Medicine p = new Medicine(name,stock);
                medicine.add(p);
                }
            sc.close();
            for(Medicine p: medicine){
                System.out.println(p.toString());
            }

   }catch (FileNotFoundException e) {         
            e.printStackTrace();
        }
   }
}
