import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class Assignment_9
{
    public void matchPattern(String sentence)
    {
        String regularExpression = "[A-Z].+[.]" ;
        boolean result_flag = Pattern.matches(regularExpression , sentence) ;
        if(result_flag)
            System.out.println("The pattern got matched in the respective string");
        else
            System.out.println("Sorry the pattern did'nt match for the respective string");
    }

    public static void main(String[] args)
    {
        //Insert code to test the functionality.
    }
}
