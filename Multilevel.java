import java.util.Scanner;

class Marks
{
    Scanner sc = new Scanner(System.in);
    double eng, hindi, math, sci, sst;

    void get_marks()
    {
        System.out.println("Enter Your Marks -\n");
        System.out.print("English:");
        eng = sc.nextDouble();
        System.out.print("Hindi:");
        hindi = sc.nextDouble();
        System.out.print("Mathematics:");
        math = sc.nextDouble();
        System.out.print("Science:");
        sci = sc.nextDouble();
        System.out.print("SST:");
        sst = sc.nextDouble();
    }

    void dis_marks()
    {
        System.out.println("Marks Obtained are as shown below:\n");
        System.out.println("English:"+eng);
        System.out.println("Hindi:"+hindi);
        System.out.println("Mathematics:"+math);
        System.out.println("Science:"+sci);
        System.out.println("SST:"+sst);
    }
}

class Marksheet extends Marks
{
    Scanner sc = new Scanner(System.in);
    int div;
    double percent;

    //Fucntion to calculate Overall Percentage of student
    void percent()
    {
        percent = (eng + hindi + math + sci + sst)/5;
        System.out.println("Percent:"+percent);
    }

    void div()
    {
        if((percent >= 75))
        {
            System.out.println("Division: 1");
        }
        else if((percent <75) && (percent >= 60))
        {
            System.out.println("Division: 2");
        }
        else if((percent < 60) && (percent >= 30))
        {
            System.out.println("Division: 3");
        }
        else
        {
            System.out.println("Fail");
        }
    }
}

class Student_Info extends Marksheet
{
    Scanner sc = new Scanner(System.in);
    String name;
    int rollno;

    void get_studentInfo()
    {
        System.out.println("Enter Student Data:");
        System.out.print("Name:");
        name = sc.nextLine();
        System.out.print("Roll No.:");
        rollno = sc.nextInt();
        System.out.println();
        get_marks();
    }

    void dis_Marksheet()
    {
        System.out.println("\t\t\t\t\t\tMarksheet");
        System.out.println("Name:"+name);
        System.out.println("Roll No.:"+rollno+"\n");
        dis_marks();
        percent();
        div();
    }
}

class Multilevel {
    public static void main(String s[])
    {
        Student_Info std = new Student_Info();
        std.get_studentInfo();
        std.dis_Marksheet();
    }
}
