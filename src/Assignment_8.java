//  author : Abhigyan_Pandey
//  Zemoso Java Asssignment

import java.util.* ;
class usernameChecker extends Exception         //  FOR VERIFYING USERNAME
{
     usernameChecker(String message)
    {
        super(message) ;
    }
};
class passwordChecker extends Exception
{
    passwordChecker(String message)
    {
        super(message) ;
    }
};

class ageChecker extends  Exception
{
    ageChecker(String message)
    {
        super(message) ;
    }
};

class verifier extends Exception
{
    public void verifyDetails(String username ,String password , String age ) throws  usernameChecker , passwordChecker ,ageChecker
    {
        if(username.length()<10)
            throw new usernameChecker("The username must contain atleast 10 characters") ;

        if(password.length() <8)
            throw new passwordChecker("The length of your password must be greater than or equal to eight characters") ;

        if(Integer.parseInt(age) < 18)
            throw new ageChecker("You must be atleast 18 years old to login") ;
    }
}

public class Assignment_8
{
    public static void main(String[] args)
    {
        try
        {
            verifier object = new verifier();
            object.verifyDetails("Abc@189" ,"XY****123" ,"20");
        }
        catch(usernameChecker u) {
            System.out.println(u.getMessage());
        }
        catch (passwordChecker p) {
            System.out.println(p.getMessage());
        }
        catch (ageChecker u) {
            System.out.println(u.getMessage());
        }
        finally
        {
            System.out.println("This finally always executes");
        }
    }

}
