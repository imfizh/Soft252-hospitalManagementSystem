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
public class MedicineStock {
    
    protected String name = "Medicine";
    protected Integer quantityInStock = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != null && !name.isEmpty()){
           this.name = name; 
        }
    }

    public Integer getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(Integer quantityInStock){
        if(quantityInStock != null && quantityInStock >= 0){
        this.quantityInStock = quantityInStock;
        }
    }
    public Boolean isInStock(){
        Boolean inStock = false;
        if(this.quantityInStock > 0){
            inStock = true;
        }
        return inStock;
    }
    }
    
