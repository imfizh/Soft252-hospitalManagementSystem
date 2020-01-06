/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hospital;

/**
 *
 * @author Luke
 */
public class MedicineItem extends MedicineStock {
    public MedicineItem(String name){
        this.name = name;
    }
    public MedicineItem(String name, Integer qty){
        this.name = name;
        this.quantityInStock = qty;
    }
}
