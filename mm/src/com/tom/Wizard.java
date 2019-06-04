package com.tom;

public class Wizard extends Thread {
    public void Thunder(){
        System.out.println("Thunder Start!!");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thunder End");
    }
    @Override
    public void run() {
        Thunder();
    }


}
