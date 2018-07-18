/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;

/**
 *
 * @author riley
 */
public class Employee {
    
    private String name;
    private int ID;
    private double salary;
    
    public Employee()
    {
        name = "Joe Schmoe";
        ID = 12345;
        salary = 37000.00;          
    }
    
    public Employee(String newName, int newID, double newSalary)
    {
        if(newName != null && !"".equals(newName))
        {
            name = newName;
        }
        else
        {
            name = "No Name Given";
        }
        
        if(newID < 0)
        {
            ID = 0;
        }
        else if(newID > 99999)
        {
            ID = 99999;
        }
        else
        {
            ID = newID;
        }
        
        if(newSalary < 20000)
        {
            salary = 20000;
        }
        else
        {
            salary = newSalary;
        }
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getID()
    {
        return ID;
    }
    
    public double getSalary()
    {
        return salary;
    }
    
    public void setName(String newName)
    {
        if(newName != null && !"".equals(newName))
        {
            name = newName;
        }
        else
        {
            name = "No Name Given";
        }
    }
    
    public void setID(int newID)
    {
        if(newID < 0)
        {
            ID = 0;
        }
        else if(newID > 99999)
        {
            ID = 99999;
        }
        else
        {
            ID = newID;
        }
    }
    
    public void setSalary(double newSalary)
    {
        if(newSalary < 20000)
        {
            salary = 20000;
        }
        else
        {
            salary = newSalary;
        }
    }
}
