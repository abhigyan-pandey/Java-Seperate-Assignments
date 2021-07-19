//  author : Abhigyan_Pandey
//  Zemoso Java Asssignment

import java.util.* ;
//          ======  PART-1  ======
abstract class Rodent
{
    Rodent()
    {
        System.out.println("Here a Rodent class instance has been created");
    }
    abstract void eating() ;
    abstract void climbing() ;

};
class Mouse extends Rodent
{
    public Mouse()
    {
        System.out.println("Here a Mouse class instance has been created");
    }
    void eating()
    {
        System.out.println("The Mouse is eating cheese");
    }

    void climbing()
    {
        System.out.println("The Mouse is climbing on a tree");
    }
};

class Gerbill extends Rodent
{
    public Gerbill()
    {
        System.out.println("Here a Gerbill class instance has been created");
    }
    void eating()
    {
        System.out.println("The Gerbill is eating cheese");
    }

    void climbing()
    {
        System.out.println("The Gerbill is climbing on a tree");
    }
};
class Hamster extends Rodent
{
    public Hamster()
    {
        System.out.println("Here a Hamster class instance has been created");
    }
    void eating()
    {
        System.out.println("The hamster is eating cheese");
    }

    void climbing()
    {
        System.out.println("The hamster is climbing on bed");
    }
};

//          ======  PART-2  ======

abstract class Cycle
{
    abstract void balance() ;
}
class Unicycle extends Cycle
{
    void balance()
    {
        System.out.println("The balance for UNicycle is here");
    }
}
class Bicycle extends Cycle
{
    void balance()
    {
        System.out.println("The balance for Bicycle is here");
    }
}

class Tricycle extends Cycle
{
    // There is no balance method here.
    //  Will result in compilation error.
}


//          ======  PART-3  ======
interface first
{
     void getfirst();
     void displayfirst() ;
}
interface second
{
    void getsecond();
    void displaysecond() ;
}
interface third
{
    void getthird();
    void displaythird() ;
}
interface fourth extends first,second,third
{
    void directIntegration() ;
}

class implementationclass implements fourth
{

    @Override
    public void getfirst()
    {
        System.out.println("Here is the definition of get function for first interface");
    }

    @Override
    public void displayfirst()
    {
        System.out.println("Here is the definition of display for first interface");
    }

    @Override
    public void getsecond()
    {
        System.out.println("Here is the definition of get function for second interface");
    }

    @Override
    public void displaysecond()
    {
        System.out.println("Here is the definition of display for second interface");
    }

    @Override
    public void getthird()
    {
        System.out.println("Here is the definition of get function for third interface");
    }

    @Override
    public void displaythird()
    {
        System.out.println("Here is the definition of display for third interface");
    }

    @Override
    public void directIntegration()
    {
        System.out.println("This is the method of fourth interface which extends all the other three interfaces");
    }
}

//          ========    PART-4  =========

interface cloneCycle{
    void code();
    void factories();

}
class cloneUnicycle implements cloneCycle{
    public void code(){
        factories();
    }
    public void factories(){
        System.out.println("Here is the definition of unicycle abstract method");
    }

};
class cloneBicycle implements cloneCycle{
    public void code(){
        factories();
    }
    public void factories(){
        System.out.println("Here is the definition of bicycle abstract method");
    }
};
class cloneTricycle implements cloneCycle{
    public void code(){
        factories();
    }
    public void factories(){
        System.out.println("Here is the definition of tricycle abstract method");
    }
};

//          ========    PART-5  =========
class outer
{
    outer()
    {
        System.out.println("The constructor of outer got called");
    }
    class inner
    {
        inner(int x , int y)
        {
            System.out.println("The constructor of inner has been called");
            System.out.println("The value of x is " + x + "and the value of y is " +y);
        }
    }
}
class outer2 extends outer
{

    outer2() {
        System.out.println("The default constructor of outer has been called");
    }
    class inner2
    {
        public inner2()
        {
            System.out.println("The default constructor of inner2 has been called");
        }
        inner2(String xyz)
        {
            System.out.println("The parameterized constructor message of inner 2 is -> " +xyz);
        }
    }
}

public class Assignment_7
{
    static void method1(first a)
    {
    }
    void method2(second b)
    {
    }
    void method3(third c)
    {
    }
    void method4(fourth d)
    {
    }

    public static void main(String[] args)
    {
        //  PART-1 INSTANTIATION.
        Rodent[] rodent = new Rodent[3];
        rodent[0] = new Mouse();
        rodent[0].eating();
        rodent[0].eating();

        rodent[1] = new Gerbill();
        rodent[1].eating();
        rodent[1].climbing();

        rodent[2] = new Hamster();
        rodent[2].eating();
        rodent[2].climbing();

        //  PART-2 INSTANTIATION.
        Cycle[] cycleobj = new Cycle[3] ;
        cycleobj[0] = new Unicycle();
        cycleobj[1] = new Bicycle() ;
        cycleobj[2] = new Tricycle();

        cycleobj[0].balance() ;

        //  PART-3 INSTANTIATION.
        implementationclass impobject = new implementationclass() ;
        impobject.directIntegration();
        Assignment_7 object7 = new Assignment_7() ;
        object7.method2(impobject);
        object7.method3(impobject);
        object7.method4(impobject);

        //  PART-4 INSTANTIATION.

        cloneUnicycle obj = new cloneUnicycle();
        obj.code();
        cloneBicycle obj1 = new cloneBicycle();             //Calling the methods accordingly for the implemented classes
        obj1.code();
        cloneTricycle obj2 = new cloneTricycle();
        obj2.code();

        //  PART-5 INSTANTIATION.
        outer2.inner2 objectOfinner2= new outer2().new inner2() ;
    }
}



