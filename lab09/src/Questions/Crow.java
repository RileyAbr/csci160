/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;

import ProvidedClasses.Tool;
import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author riley
 */
public class Crow extends Bird {
    
    protected ArrayList<Tool> listTools = new ArrayList<Tool>();
    
    public Crow()
    {
        super("Jacob", 2008, Color.BLACK);
        listTools.add(Tool.CHAINSAW);
    }
    
    public void addTool(Tool newTool)
    {
        listTools.add(newTool);
    }
    
    public ArrayList<Tool> getToolsUsed()
    {
        ArrayList<Tool> returnListTools = new ArrayList<Tool>(listTools.size());
        
        for(Tool returnTool : listTools)
        {
            returnListTools.add(returnTool);
        }
        
        return returnListTools;
    }
    
    @Override
    public String toString()
    {
        String stringToolList = "";
        
        for(Tool stringTool : listTools)
        {
            stringToolList += stringTool;
        }
        
        return super.toString() + ", " + stringToolList;
    }
    
}
