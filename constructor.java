import java.util.Scanner;


class Greetings{
    private String fname, lname;
    Greetings(String first,String last){
        fname = first;
        lname = last;
    }
    public void greet(){
        System.out.println("Hello "+fname+" "+lname+". Let's start Java Programming.");
    }
}


public class constructor {
    public static void main(String arg[]){
        String fname, lname;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your First Name:");
        fname = sc.nextLine();
        System.out.print("Enter Your last Name:");
        lname = sc.nextLine();
        Greetings Obj = new Greetings(fname, lname);
        Obj.greet(); 
        sc.close();
    }
}
