import static java.lang.Math.PI;
class functionO {
    static void Area(int s){
        System.out.println("Area of Square:"+(s*s));
    }
    static void Area(int l,int b){
        System.out.println("Area of Rectangle:"+(l*b));
    }
    static void Area(double r){
        System.out.println("Area of Circle:"+(PI*r*r));
    }
    public static void main(String s[]){
        System.out.print("Area of Square with Dimension 4 unit:");
        Area(4);
        System.out.print("Area of Rectangle with Dimension 2 and 3 unit:");
        Area(2,3);
        System.out.print("Area of Circle with Dimension 4.0 unit:");
        Area(4.0);
    }
}
