//  author : Abhigyan_Pandey
//  Zemoso Java Asssignment

import java.util.* ;
import java.io.* ;
import edu.duke.* ;
public class Assignment_1
{
    public void searchForFile(String regexpression , String fileName)
    {
            FileResource fr = new FileResource(fileName) ;    // Opening the file with specified name
            for(String line : fr.lines())
            {
                if(line.contains(regexpression) )   // Printing the file name if regular expression is found
                    System.out.println("The file with respective expression is found and the file name is -> " + fileName);

                else
                    System.out.println("This file does'nt contain the required expression");
            }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in) ;
        String regularExpression , fileName ;
        regularExpression = sc.nextLine() ;
        fileName = sc.nextLine() ;
        Assignment_1 object = new Assignment_1() ;
        while(true)
        {
            object.searchForFile(regularExpression,fileName);   // Calling the function for the purpose.
        }
    }
}
