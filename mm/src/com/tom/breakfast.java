package com.tom;

public class breakfast extends Thread {

    @Override
    public void run() {
        try {

            System.out.println("Making breakfast");
            Thread.sleep(4000);
            System.out.println("breakfast done");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
