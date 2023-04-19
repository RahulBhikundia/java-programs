class Base
{
    void print()
    {
        System.out.println("This is Base Class!!");
    }
}

class Derived extends Base
{
    void print()
    {
        System.out.println("This is Derived Class!!");
    }
}

class FunctionOver 
{
    public static void main(String s[])
    {
        Derived d = new Derived();
        d.print();
    }
}
