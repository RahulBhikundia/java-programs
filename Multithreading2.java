class A extends Thread {
    public void run() {
        for(int i=1;i<=5;i++) {
            System.out.println("From Thread A:"+i);
        }
        System.out.println("Exit from Thread A");
    }
}

class B extends Thread {
    public void run() {
        for(int i=1;i<=5;i++) {
            System.out.println("From Thread B:"+i);
        }
        System.out.println("Exit from Thread B");
    }
}

public class Multithreading2 {
    public static void main(String s[]) {
        A a = new A();
        B b = new B();
        a.start();
        b.start();
    }
}
