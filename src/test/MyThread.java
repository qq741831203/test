package test;

public  class  MyThread extends Thread{
    private  static  Integer i;
    private  static  int j=1;
    private  String  threadname;

    public MyThread( String threadname) {
        this.threadname = threadname;
    }

    public String getThreadname() {
        return threadname;
    }

    public void setThreadname(String threadname) {
        this.threadname = threadname;
    }
    public static int getI() {
        return i;
    }

    public static void setI(int i) {
        MyThread.i = i;
    }

    @Override
    public  void run() {
            while (true) {
                synchronized("") {
                    if (i > 0) {
                    try {
                        Thread.sleep(20);
                        System.out.println(this.threadname +"卖出"+(j++) + "号票----余票:" + (--i));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    break;
                }
            }
        }
    }
}
