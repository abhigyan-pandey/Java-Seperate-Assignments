public class Assignment_5
{
    int intValue ;
    char charValue ;

    void printMembers()
    {
        System.out.println("The inetger value is -> " + intValue);
        System.out.println("The character value is -> " + charValue);
    }
    void displayLocalNumbers()
    {
        int thirdnumber ;
        int fourthnumber ;

        System.out.println("Value of third number is " + thirdnumber);      //  Showing error when we don't initialise the local variables
        System.out.println("Value of fourth number is "+ fourthnumber);
    }
    public static void main(String[] args)
    {
        Assignment_5 object1 = new Assignment_5() ;
        secondpart object2 = new secondpart() ;
        object1.printMembers();
        object1.displayLocalNumbers();      //will throw error
        object2.printmember();
    }
}

class secondpart
{
    String member ;

    static setmember(String input)
    {
        member = input ;    //A static member can't initialise a non static member here .
        secondpart object = new secondpart() ;
        return object;      //Will throw an error because we have'nt put a return type in the function signature/
    }

    void printmember()
    {
        System.out.println("The string value is -> " +member);
    }

}
