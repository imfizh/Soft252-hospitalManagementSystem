/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hospital;
import java.util.ArrayList;
import utilities.IObserver;
import utilities.Isubject;
/**
 *
 * @author Luke
 */
public abstract class MedicineStock implements Isubject {
    
    protected String name = "Medicine";
    protected Integer quantityInStock = 0;
    private ArrayList<IObserver> observers = null;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != null && !name.isEmpty()){
           this.name = name; 
           notifyObservers();
        }
    }

    public Integer getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(Integer quantityInStock){
        if(quantityInStock != null && quantityInStock >= 0){
        this.quantityInStock = quantityInStock;
        notifyObservers();
        }
    }
    public Boolean isInStock(){
        Boolean inStock = false;
        if(this.quantityInStock > 0){
            inStock = true;
        }
        return inStock;
    }
    public MedicineStock(String name){
        this.name = name;
    }
    public MedicineStock(String name, Integer qty){
        this.name = name;
        this.quantityInStock = qty;
    }
    public MedicineStock(){   
    }
    @Override
    public Boolean registerObserver(IObserver o){
    Boolean blnAdded = false;
    if(o != null){
        if(this.observers == null){
        this.observers = new ArrayList<>();
        }
        blnAdded = this.observers.add(o);
    }
    return blnAdded;
    }
    @Override
    public Boolean removeObserver(IObserver o){
    Boolean blnRemoved = false;
    if(o != null){
        if(this.observers != null){
        blnRemoved = this.observers.remove(o);
        }
    }
    return blnRemoved;
    }
    @Override
    public void notifyObservers(){
    if(this.observers != null && this.observers.size() > 0){
        for(IObserver currentObserver : this.observers){
            currentObserver.update();
        }
    }
    }
    }
    
