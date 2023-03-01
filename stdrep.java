import java.util.Scanner;

class Marksheet{
    Scanner sc = new Scanner(System.in);
    String name;
    int rollNo;
    float physics,chem,maths,english,comp;
    float total,percent;
    
    //Function to get data from the student
    public void getDetails(){
        System.out.println("Enter Your Full name:");
        name = sc.nextLine();
        System.out.println("Enter Your Roll No.:");
        rollNo = sc.nextInt();
        System.out.println();
        System.out.println("Enter Marks for Following Subjects:");
        System.out.print("Physics:");
        physics = sc.nextFloat();
        System.out.print("Chemistry:");
        chem = sc.nextFloat();
        System.out.print("Maths:");
        maths = sc.nextFloat();
        System.out.print("English:");
        english = sc.nextFloat();
        System.out.print("Computer Science:");
        comp = sc.nextFloat();

        total = physics+chem+maths+english+comp;
        percent = total / 5;
    }

    //Function to show details of Students
    public void print_Marksheet(){
        System.out.println("\t\t\t\tMarksheet:");
        System.out.println("Name: "+name);
        System.out.println("rollNo: "+rollNo);
        System.out.println();
        System.out.println("Marks of Students:");
        System.out.println("Physics:"+physics);
        System.out.println("Chemistry:"+chem);
        System.out.println("Maths:"+maths);
        System.out.println("English:"+english);
        System.out.println("Computer Science:"+comp);
        System.out.println();
        System.out.println("Total Marks:"+total+"/500");
        System.out.println("Percentage:"+percent);
        division();
    }

    public void division(){
        if( percent >= 0 && percent <45){
            System.out.println("Passed with Third Division.");  
        }
        else if( percent >=45 && percent < 60 ){
            System.out.println("Passed with Second Division.");
        }
        else if( percent >=60 && percent < 70){
            System.out.println("Passed with First Division.");
        }
        else if( percent >=75 && percent < 100){
            System.out.println("Passed with Honours & First Division.");
        }
    }
}

class stdrep {
    public static void main(String s[]){
        Marksheet student = new Marksheet();
        student.getDetails();
        System.out.println();
        student.print_Marksheet();
    }
}
