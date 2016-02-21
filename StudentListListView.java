/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projektarbetequiz;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Marius
 */
public class StudentListListView {

    
    private final SimpleStringProperty name;
    private final SimpleStringProperty email;
   
    
    public StudentListListView(String name,String email){
        this.name=new SimpleStringProperty(name);
        this.email=new SimpleStringProperty(email);
     
        
    }

    

public String getName() 
    {
        return name.get();
    }

public void setName(String n)
    {
        name.set(n);
    }
     
  

public String getEmail() 
    {
        return email.get();
    }

public void setEmail(String e) 
    {
		email.set(e);
    }


       public String toString() {
        return (name.get() + " " + email.get());
                
                }
    

    }
