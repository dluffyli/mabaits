package com.thread;

public class RunnableThreadTest implements Runnable {
    private int i;
    @Override
    public void run() {
        for(;i<100;i++){
            System.out.println(Thread.currentThread().getName()+"  "+i);
        }
    }

    public static void main(String[] args)
    {
        for(int i = 0;i< 100;i++)
        {
            System.out.println(Thread.currentThread().getName()+"  : "+i);
            RunnableThreadTest rtt = new RunnableThreadTest();
            if(i == 20)
            {
                new Thread(rtt,"线程1：").start();
                new Thread(rtt,"线程2：").start();
            }
        }
    }
}
