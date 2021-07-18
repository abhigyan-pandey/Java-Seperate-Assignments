//  author : Abhigyan_Pandey
//  Zemoso Java Asssignment

import java.util.* ;
public class Assignment_2
{

    boolean containsLowerCaseCharacters(String input)
    {
        HashMap<Character, Integer> map = new HashMap<>() ;     //Using a hashmap for counting the characters.
        int cnt = 0 ;

        for(int i = 0; i<input.length() ; i++)
        {
            cnt++ ;
            if(map.containsKey(input.charAt(i)))
                map.put(input.charAt(i) , map.get(input.charAt(i)) + 1) ;
            else
                map.put(input.charAt(i) , 1) ;
        }
        for(char ch = 97 ; ch <=122 ;ch++ )
            if(map.get(ch) == null)             //If any lowercase character did'nt occur , return false
                return false;

        return true ;

    }
    public static void main(String[] args)
    {
        Assignment_2 object  = new Assignment_2() ;
        String sample_input = "asdaskdlaskd" ;
       if(object.containsLowerCaseCharacters(sample_input))
            System.out.println("THE GIVEN STRING HAS ALL THE LOWER CASES CHARACTERS IN IT");
        else
            System.out.println("THE GIVEN STRING DOES NOT HAVE ALL THE LOWER CASES CHARACTERS IN IT");    }
}
