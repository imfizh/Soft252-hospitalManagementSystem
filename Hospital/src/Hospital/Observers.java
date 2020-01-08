/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hospital;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import utilities.IObserver;
import utilities.Isubject;


/**
 *
 * @author Luke
 */
public class Observers  implements Isubject{
private ArrayList<IObserver> observers;
    private int NumOfAccounts = 0;
    public boolean NewRequest= false;
    
    public void fileF() throws IOException{
    BufferedWriter br = null;
    try {
        br = new BufferedWriter(new FileWriter(("Boolean.txt")));
    } catch (IOException ex) {
        Logger.getLogger(Observers.class.getName()).log(Level.SEVERE, null, ex);
    }
    br.write("false");
    br.close();
    }
    public void fileT() throws IOException{
    BufferedWriter br = null;
    try {
        br = new BufferedWriter(new FileWriter(("Boolean.txt")));
    } catch (IOException ex) {
        Logger.getLogger(Observers.class.getName()).log(Level.SEVERE, null, ex);
    }
    br.write("true");
    br.close();
    }
    public int getNumOfAccounts() {
        return NumOfAccounts;
    }

    public void setNumOfAccounts(int NumOfAccounts) {
        this.NumOfAccounts = NumOfAccounts;
        notifyObservers();
    }

    public boolean isNewRequest() {
        return NewRequest;
    }

    public void setNewRequest(boolean NewRequest) {
        this.NewRequest = NewRequest;
    try {
        fileT();
    } catch (IOException ex) {
        Logger.getLogger(Observers.class.getName()).log(Level.SEVERE, null, ex);
    }
        notifyObservers();
    }
    @Override
    public Boolean registerObserver(IObserver o)
    {
        Boolean blnAdded = false;
                if(o != null){
                    if(this.observers == null){
                        this.observers = new ArrayList<>();
                    }blnAdded = this.observers.add(o);
                }return blnAdded;
    }
    @Override
    public Boolean removeObserver(IObserver o)
    {
        Boolean blnAdded = false;
        if(o != null){
         blnAdded = this.observers.remove(o);
           }return blnAdded;
    }
    @Override
    public void notifyObservers(){
    if(this.observers != null && this.observers.size() >0){
        for(IObserver currentObserver : this.observers){
            currentObserver.update();
        }
    }
    }
}

