import java.util.Scanner;
class Complex {
    private int real,imag;
    
    Complex()
    {
        real = 0;
        imag = 0;
    }

    Complex(int r,int i)
    {
        real = r;
        imag = i;
    }

    void print()
    {
        System.out.println(real+"+i"+imag);
    }

    Complex add(Complex A, Complex B)
    {
        Complex temp = new Complex();
        temp.real = A.real + B.real;
        temp.imag = A.imag + B.imag;
        return temp;
    }

    void sub(Complex A,Complex B)
    {
        real = A.real - B.real;
        imag = A.imag - B.imag;
    }
}

class Complex_cal
{
    public static void main(String s[])
    {
        int r,i;
        Scanner sc = new Scanner(System.in);
        
        // Taking First Complex Number as input from User
        System.out.println("Enter First Complex Number:");
        System.out.print("Real Part:");
        r = sc.nextInt();
        System.out.print("Imaginary Part:");
        i = sc.nextInt();
        Complex A = new Complex(r,i);

        // Taking Second Complex Number as input from User
        System.out.println("Enter Second Complex Number:");
        System.out.print("Real Part:");
        r = sc.nextInt();
        System.out.print("Imaginary Part:");
        i = sc.nextInt();
        Complex B = new Complex(r,i);

        // Displaying Complex Numbers
        System.out.print("First Complex Number:");
        A.print();
        System.out.print("Second Complex Number:");
        B.print();

        // Performing Addition of two Complex Number
        Complex C = new Complex();
        C = C.add(A,B);

        System.out.print("Result of Addition of A and B:");
        C.print();

        // Performing Subtraction of two Complex Number
        Complex D = new Complex();
        D.sub(A,B);

        System.out.print("Result of Subtraction of A from B:");
        D.print();

    }
}