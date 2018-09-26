package test;

public class ThreadTest {
    public static void main(String[] args){
        MyThread s1=new MyThread("窗口A");
        MyThread s2=new MyThread("窗口B");
        MyThread s3=new MyThread("窗口C");
        MyThread.setI(100);
        s2.start();
        s1.start();
        s3.start();

    }
}
