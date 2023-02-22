public class Quad {
    public static void main(String s[]){
        int a,b,c;
        a = Integer.parseInt(s[0]);
        b = Integer.parseInt(s[1]);
        c = Integer.parseInt(s[2]);
        if(((b*b)-(4*a*c))<0){
            System.out.println("No Real Solution.");
        }
        else if(((b*b)-(4*a*c))>0){
            System.out.println("Real Solutions Exist and they are Different.");
        }
        else{
            System.out.println("Real Solution exist and they are same.");
        }
    }
}