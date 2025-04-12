package com.aysekarapinar.ibb_ecodation_javafx.tutorials.javacore._1_week;

import java.util.Scanner;

public class _08_2_System {

    // SYSTEM.IN()
    public static void systemMethod1(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir şey yazın: ");
        String input= scanner.nextLine();
        System.out.println("Girdiğiniz: " + input);
        scanner.close();
    }

    // SYSTEM.OUT()
    public static void systemMethod2(){
        System.out.println("Merhaba, Dünya!");
        System.out.print("yan yana yazılır.");
        System.out.printf("\nFormatlı yazdırma: %d + %d = %d", 5, 3, 5+3);
    }

    // SYSTEM.ERR()
    public static void systemMethod3(){
        System.err.println("Bu bir hata medajıdır!");
    }

    // JAVA PROPERTIES
    public static void systemMethod4(){
        System.out.println("Java Versiyonu: " + System.getProperty("java.version"));
        System.out.println("OS Adı: " + System.getProperty("os.name"));
        System.out.println("Kullanıcı Adı: " + System.getProperty("user.name"));
        System.out.println("Çalışma Dizini: " + System.getProperty("user.dir"));
    }

    // ORTAM DEĞİŞKENLERİ
    public static void systemMethod5(){
        System.out.println("PATH: " + System.getenv("JAVA_HOME"));
        System.out.println("JAVA_HOME: " +System.getenv("JAVA_GOME"));

    }

    // SYSTEM.GC()
    public static void systemMethod6(){
        System.out.println("Çöp toplama yapılıyor...");
        System.gc();
    }

    // SYSTEM.CURRENTTIMEMILLES()
    public static void systemMethod7(){
        long start= System.currentTimeMillis();

        // 1 milyon döngü çalıştırır
        for(int i=0; i < 1_000_000; i++) { }

        long end= System.currentTimeMillis();
        System.out.println("Geçen Süre: " + (end - start) + "ms");
    }

    // SYSTEM.NANOTIME()
    public static void systemMethod8(){
        long start= System.nanoTime();

        // 1 milyon döngü çalıştırır
        for(int i=0; i < 1_000_000; i++) { }

        long end= System.nanoTime();
        System.out.println("Geçen Süre: " + (end - start) + "ns");

    }
    public static void systemMethod9(){}
    public static void systemMethod10(){}

    //Eğer System.exit(0) kullanılırsa;
    // 1- JVM durur
    // 2- Çalışan tüm threadler sonlanır.
    // 3- Programın işletim sistemindeki processlerde kapanır

    public static void processCloseJVMStop(){
        System.out.println("Program başladı, system exit(0)");
        System.exit(0);
        System.out.println("Bu satır çalışmayacak");
    }

    public static void processContinueJVMContinue() {
        for (int i = 0; i < 10; i++) {
            if (i==5) {
                System.out.println("Program başladı, break");
                System.out.println("Sadece döngüden çıkılıyor");
                break;
            }
            System.out.println(i+". sıra");
        }
        System.out.println("Bu satır çalışacak");
    }

    public static void main(String[] args) {
        processCloseJVMStop();
        processContinueJVMContinue();
        systemMethod1();
        systemMethod2();
        systemMethod3();
        systemMethod4();
        systemMethod5();
        systemMethod6();
        systemMethod7();
        systemMethod8();
    }
}
