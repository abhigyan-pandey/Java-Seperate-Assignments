//  author : Abhigyan_Pandey
//  Zemoso Java Asssignment

import java.util.HashMap;

public class Assignment_6
{
    public boolean checkVampire(int N)
    {
        int countDigits = 0;
        boolean flag = false;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int temp = N; temp != 0; temp /= 10) {
            int digitvalue = temp % 10;
            countDigits++;
            if (map.containsKey((char) digitvalue))
                map.put((char) digitvalue, map.get((char) digitvalue) + 1);
            else
                map.put((char) digitvalue, 1);
        }
        if (countDigits % 2 == 1)
            return false;

        for (int i = 1; i * i <= N; i++) {
            String s1 = Integer.toString(i);
            String s2 = Integer.toString(N / i);

            if (s1.length() == (countDigits / 2) && s2.length() == (countDigits / 2))
            {
                for (int k = 0; k < s1.length(); k++)
                {
                    if (!map.containsKey((char) s1.charAt(k)))
                        return false;
                    else
                        flag = true ;
                }
                for (int j = 0; j < s2.length(); j++) {
                    if (!map.containsKey((char) s2.charAt(j)))
                        return false;
                    flag = true ;
                }
            }
        }
        if(flag)
            return true;
        else
            return false;
    }
    public static void main(String[] args)
    {
        //  ======  Second part call    ======
        overloader object1 = new overloader() ;
        overloader object2 = new overloader(10 ,20 );

        //  ======  Third part call =======
        overloader_second[] object3 = new overloader_second[2] ;
        object3[0] = new overloader_second("Hello there world");
        object3[1] = new overloader_second("Hiii there World , how   are you");

    }
}

class overloader
{
    int x ;
    int y ;
    overloader()
    {
        x = 0 ;
        y = 0 ;
    }
    overloader(int a , int b)
    {
        x = a ;
        y = b ;
    }
}
class overloader_second
{
    overloader_second(String s)
    {
        System.out.println("The string in the default constructor is " + s);
    }
}
