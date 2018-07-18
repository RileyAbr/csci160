/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions.Files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author riley
 */
public class Cryptography {
    
    public static void encode(String fileName, int shift)
    {
        try
        {
            //Streams for handling reading the file
            FileInputStream fileInEn = new FileInputStream(fileName);
            Scanner fileScanEn = new Scanner(fileInEn);
            
            //Streams for handling writing the encoded file
            
            //Handles if our shift is greater than the alphabet
            if(shift > 26)
            {
                shift %= 26;
            }
            else if (shift < -26)
            {
                shift %= 26;
                shift *= -1;
            }
            
            //Handles changing the file name and adding "-encrypted"
            String[] nameParts = fileName.split("\\.(?=[^\\.]+$)");
            String name1 = nameParts[0];
            String name2 = nameParts[1];
            FileOutputStream fileOutEn = new FileOutputStream(name1 + "-encrypted." + name2, false);
            PrintWriter filePrintEn = new PrintWriter(fileOutEn);
            
            while(fileScanEn.hasNext())
            {
                String tempLine = fileScanEn.nextLine();
                Scanner lineScanEn = new Scanner(tempLine);
                
                while(lineScanEn.hasNext())
                {
                    String tempWord = lineScanEn.next();
                    char[] tempChar = tempWord.toCharArray();
                    
                    for(int i = 0; i < tempChar.length; i++)
                    {
                        if(tempChar[i] > 64 && tempChar[i] < 91)
                        {
                            tempChar[i] += shift;

                            if(tempChar[i] < 65)
                            {
                                int tempShift = 65 - tempChar[i];
                                tempChar[i] = (char)(91 - tempShift);
                            }

                            if(tempChar[i] > 90)
                            {
                                int tempShift = tempChar[i] - 90;
                                tempChar[i] = (char)(64 + tempShift);
                            }
                        }
                        else if(tempChar[i] > 96 && tempChar[i] < 123)
                        {
                            tempChar[i] += shift;

                            if(tempChar[i] < 97)
                            {
                                int tempShift = 97 - tempChar[i];
                                tempChar[i] = (char)(123 - tempShift);
                            }

                            if(tempChar[i] > 122)
                            {
                                int tempShift = tempChar[i] - 122;
                                tempChar[i] = (char)(96 + tempShift);
                            }
                        }
                        else
                        {
                            break;
                        }
                    }
                    String printWord = new String(tempChar);
                    
                    if(lineScanEn.hasNext())
                    {
                        filePrintEn.print(printWord + " ");
                    }
                    else
                    {
                        filePrintEn.print(printWord);
                    }
                }
                
                filePrintEn.println();
            }
            
            fileScanEn.close();
            fileInEn.close();
            filePrintEn.close();
            fileOutEn.close();
        }
        
        catch(FileNotFoundException fnfe)
        {
            System.out.println("File not found.");
        }
        
        catch(IOException ioe)
        {
            System.out.println("Input or output was closed to early."); 
        }
        
    }
    
    public static void decode(String fileName, int shift)
    {
        try
        {
            //Streams for handling reading the file
            FileInputStream fileInDe = new FileInputStream(fileName);
            Scanner fileScanDe = new Scanner(fileInDe);
            
            //Streams for handling writing the encoded file
            
            //Handles if our shift is greater than the alphabet
            if(shift > 26)
            {
                shift %= 26;
            }
            else if (shift < -26)
            {
                shift %= 26;
                shift *= -1;
            }
            
            //Handles changing the file name and remove "-encrypted"
            String[] nameParts = fileName.split("\\.(?=[^\\.]+$)");
            String name1 = nameParts[0];
            String name2 = nameParts[1];
            FileOutputStream fileOutDe = new FileOutputStream(name1 + "-decrypted." + name2, false);
            PrintWriter filePrintDe = new PrintWriter(fileOutDe);
            
            while(fileScanDe.hasNext())
            {
                String tempLine = fileScanDe.nextLine();
                Scanner lineScanDe = new Scanner(tempLine);
                
                while(lineScanDe.hasNext())
                {
                    String tempWord = lineScanDe.next();
                    char[] tempChar = tempWord.toCharArray();
                    
                    for(int i = 0; i < tempChar.length; i++)
                    {
                        if(tempChar[i] > 64 && tempChar[i] < 91)
                        {
                            tempChar[i] -= shift;

                            if(tempChar[i] < 65)
                            {
                                int tempShift = 65 - tempChar[i];
                                tempChar[i] = (char)(91 - tempShift);
                            }

                            if(tempChar[i] > 90)
                            {
                                int tempShift = tempChar[i] - 90;
                                tempChar[i] = (char)(64 + tempShift);
                            }
                        }
                        else if(tempChar[i] > 96 && tempChar[i] < 123)
                        {
                            tempChar[i] -= shift;

                            if(tempChar[i] < 97)
                            {
                                int tempShift = 97 - tempChar[i];
                                tempChar[i] = (char)(123 - tempShift);
                            }

                            if(tempChar[i] > 122)
                            {
                                int tempShift = tempChar[i] - 122;
                                tempChar[i] = (char)(96 + tempShift);
                            }
                        }
                        else
                        {
                            continue;
                        }
                    }
                    String printWord = new String(tempChar);
                    filePrintDe.print(printWord + " ");
                }
                
                filePrintDe.println();
            }
            
            fileScanDe.close();
            fileInDe.close();
            filePrintDe.close();
            fileOutDe.close();
        }
        
        catch(FileNotFoundException fnfe)
        {
            System.out.println("File not found.");
        }
        
        catch(IOException ioe)
        {
            System.out.println("Input or output was closed to early."); 
        }
    }
}
