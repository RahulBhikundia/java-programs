import static java.lang.Math.PI;
class Area{
    //Defining Data Members
    private int side; //Dimensions for Square
    private int length, breadth; //Dimensions for rectangle
    private double rad;//Dimensions for circle
    private double Area;//To store Area of Shape
    //Defining Constructor for class
    //For Square
    Area(int s){
        side = s;
        Area = side*side;
    }

    //For Rectangle
    Area(int l,int b){
        length = l;
        breadth = b;
        Area = length*breadth;
    }

    //For Circle
    Area(double r){
        rad = r;
        Area = PI*rad*rad;
    }

    void Display(){
        System.out.println(Area);    
    }
}

class Shape{
    public static void main(String s[]){
        Area Square = new Area(4);
        Area Rectangle = new Area(2,3);
        Area Circle = new Area(4.0);

        System.out.print("Area of Square with side 4:- ");
        Square.Display();
        System.out.print("Area of Rectangle with dimensions 2 and 3 units:- ");
        Rectangle.Display();
        System.out.print("Area of Circle with Radius 4.0:- ");
        Circle.Display();
    }
}