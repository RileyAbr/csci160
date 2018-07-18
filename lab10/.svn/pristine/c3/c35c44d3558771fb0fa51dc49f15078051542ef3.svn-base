package Questions.Files;

import ProvidedClasses.Student;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


/**
 *
 * @author (Your Name Here)
 */
public class Question6 
{
   
    /* For this part of the assignment you will need to write some code that will parse a human-readable formatted text file.
       
        You can use the Scanner class to read the file (Chapter 11.5) 
       
        The file has the following format:
            Name,ID,GPA,Course1,Course2,...,courseN
        
            Name    - A String type representing a student's name
            ID      - An int type representing a student's ID number
            GPA     - A double type representing a student's GPA
            Course  - A String type representing a course the student is enrolled in.
       
        Note that there may be multiple courses. 
        Files may contain multiple lines following this format. 
       
        Your code should perform the following actions:
       
        1) Open the file specified by the parameter fileName for reading.
            * If the file cannot be found, return an empty ArrayList containing no students.
        2) Parse the file until you run out of input.
        3) For every line of the file, construct a new Student object and add it to an ArrayList that you will 
        return later.
            * The Student constructor is of takes the following arguments (String, int, double, String[]) in that order.
            * If the file does not follow the specified format above, throw a new InputMismatchExcpetion with the 
        message "Input file is malformed."
                * Note: You may need to catch an exception of this type first before throwing your own. 
            * Note: You may want to use the split method as part of your solution as it is easier than other approaches. 
        4) Return the ArrayList of Students. 
    */
    public static ArrayList<Student> parseStudentFile(String fileName) 
    {
        ArrayList<Student> studentList = new ArrayList<Student>();
        
        try
        {
            //1
            FileInputStream fileIn = new FileInputStream(fileName);
            Scanner fileScanner = new Scanner(fileIn);
            
            //2
            while(fileScanner.hasNext())
            {
                //read line
                String tempLine = fileScanner.nextLine();
                
                //process line
                Scanner parseScanner = new Scanner(tempLine);
                parseScanner.useDelimiter(",");
                
                //Processes a student's name
                String name = parseScanner.next();
                
                try
                {
                    //Processes a student's id
                    int id = parseScanner.nextInt();
                    
                    //Processes a student's gpa
                    double gpa = parseScanner.nextDouble();
                    
                    //Processing the limitless list of courses a student can be involved in
                    String courseLine = parseScanner.nextLine();
                    String[] courses = courseLine.split(",");
                    
                    //Creates and adds a new student to the list
                    Student tempStudent = new Student(name, id, gpa, courses);
                    studentList.add(tempStudent);
                }
                catch(InputMismatchException ime)
                {
                    throw new InputMismatchException("Input file is malformed.");
                }
                
                //Closing the line scanner before loop repeats
                parseScanner.close();
            }
            
            //Close entire file scanner
            fileScanner.close();
        }
        catch(FileNotFoundException fnfe)
        {
            return new ArrayList<Student>();
        }
        
        return studentList;
    }
    
    public static void main(String[] args) 
    {
        for (Student s : parseStudentFile("files/question6/list1.txt"))
        {
            System.out.println(s.toString());
        }
    }
    
}
