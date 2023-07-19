class X implements Runnable {
    public void run() {
        for(int i=0;i<5;i++) {
            System.out.println("The thread x is:"+i);
            System.out.println("End of the thread x");
        }
    }
}

class Multithreading1 {
    public static void main(String s[]) {
        X r = new X();
        Thread threadx = new Thread(r);
        threadx.start();
        System.out.println("End of main Thread");
    }
}
