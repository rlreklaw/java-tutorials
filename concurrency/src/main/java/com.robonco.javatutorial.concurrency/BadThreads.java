package com.robonco.javatutorial.concurrency;

public class BadThreads {

    static String message;

    private static class CorrectorThread
            extends Thread {

        public void run() {
            try {
                sleep(1000);
            } catch (InterruptedException e) {}
            // Key statement 1:
            message = "Mares do eat oats.";
        }
    }

    public static void main(String args[])
            throws InterruptedException {

        message = "Mares do not eat oats.";

        CorrectorThread ct = new CorrectorThread();
        ct.start();
//        (new CorrectorThread()).start();
        Thread.sleep(2000);
//        ct.join();

        // Key statement 2:
        System.out.println(message);
    }
}
