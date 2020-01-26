package com.abc.fruit;

public class Fruit {
    private static final int SLEEP_TIME_MS = 0;
    private static final int PRINTS = 20;
    String name;

    public Fruit(String name) {
        this.name = name;
        Runnable r = new Runnable() {

            @Override
            public void run() {
                runWork();
            }

        };
        Thread t = new Thread(r);
        t.start();
    }

    private void runWork() {
        for(int i = 0; i < PRINTS; i++) {
            System.out.println(name);
            try {
                Thread.sleep(SLEEP_TIME_MS);
            } catch ( InterruptedException x ) {
                x.printStackTrace();
            }
        }
    }



}
