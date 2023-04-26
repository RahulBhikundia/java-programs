import java.lang.Math;

abstract class ShapeArea {
    abstract void getArea();
}

class Circle extends ShapeArea {
    int rad; 

    // Constructor
    Circle(int r) {
        rad = r;
    }

    void getArea(){
        System.out.println(Math.PI*rad*rad);
    }
}

class Square extends ShapeArea {
    int side;

    // Constructor
    Square(int s) {
        side = s;
    } 

    void getArea() {
        System.out.println(side*side);
    }
} 

class Rectangle extends ShapeArea {
    int l,b;

    Rectangle(int l,int b) {
        this.l = l;
        this.b = b;
    }

    void getArea() {
        System.out.println(l*b);
    }
}

class AbstractTest {
    public static void main(String args[]) {
        Circle circle = new Circle(4);
        Square square = new Square(4);
        Rectangle rect = new Rectangle(2,3);
        
        System.out.print("Area of Circle with Radius 4 units: ");
        circle.getArea();
        System.out.print("Area of Square with side 4 units: ");
        square.getArea();
        System.out.print("Area of Rectangle with sides 2 and 3 units: ");
        rect.getArea();
    }    
}
