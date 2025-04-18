package com.aysekarapinar.ibb_ecodation_javafx.tutorials.javacore._6_week;

public class _01_MyThread extends Thread{
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Değer: " + i);
            try {
                Thread.sleep(1000); // 1 saniye beklet
            } catch (InterruptedException e) {
                System.out.println("Thread kesintiye uğradı!");
            }
        }
    }

    // extends Thread (Main)
    class ThreadExample {
        public static void main(String[] args) {
            _01_MyThread thread1 = new _01_MyThread();
            _01_MyThread thread2 = new _01_MyThread();

            thread1.start(); // Yeni bir iş parçacığı başlatır
            thread2.start();
        }
    }
}
