class Vehicle
{
    Vehicle() // Constructor for PARENT class
    {
        System.out.println("This is Parent Class - 'Vehicle'.");
    }
}

class Car extends Vehicle
{
    Car()
    {
        super();
        System.out.println("This is a sub class - 'Car', derived from class 'Vehicle'");
    }
}

class Test
{
    public static void main(String s[])
    {
        Car obj = new Car();
    }
}
