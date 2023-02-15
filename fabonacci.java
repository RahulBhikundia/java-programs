public class fabonacci {
    public static void main(String s[]){
        int n = Integer.parseInt(s[0]);
        
        System.out.println("Fibonacci Series:");
        if(n == 1)
        {
            System.out.println(1);
        }
        else if(n == 2)
        {
            System.out.println(1);
            System.out.println(1);
        }
        else
        {
            int a = 1;
            int b = 1;
            System.out.println(a);
            System.out.println(b);
            for(int x=2;x<n;x++)
            {
                int c = a+b;
                System.out.println(c);
                a = b;
                b = c;
            }
        }

    }
}
