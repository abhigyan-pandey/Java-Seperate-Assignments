//  author : Abhigyan_Pandey
//  Zemoso Java Asssignment

import java.util.* ;
import java.io.* ;
import edu.duke.* ;
public class Assignment_1
{
    private void findFile()
    {
        File file = new File("/home/knowledge-kingdom/IdeaProjects/Java-Seperate-Assignments");
        //string to store the name of the file
        String str ;
        Scanner in = new Scanner(System.in);
        do
        {
            int ab =0;
            System.out.println("ENTER THE NAME OF FILE");
            str =in.nextLine();

            String[] files = file.list();
            for (String string : files)
            {
                Boolean flag = str.equals(string);
                if (flag)
                {
                    ab = 1;
                    System.out.println("File Found : ");
                    System.out.println(string);
                    //print the address of the file
                    System.out.println("Path : "+ file.getAbsolutePath());
                }
            }
            if(ab == 0)
            {
                System.out.println("File not find : Reenter the name of the file.");
            }
        } while(true);
    }

    public static void main(String[] args)
    {
        Assignment_1 object =new Assignment_1();
        object.findFile();
    }
}
