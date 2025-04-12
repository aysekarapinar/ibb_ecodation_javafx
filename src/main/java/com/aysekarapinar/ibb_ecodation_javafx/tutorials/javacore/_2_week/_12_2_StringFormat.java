package com.aysekarapinar.ibb_ecodation_javafx.tutorials.javacore._2_week;
import java.util.Formatter;

/*
Garbarage Collectors:
Yalnızca ama yalnızca kapalı olmayan dosya, scanner, formatter vb
yapılarda otomatik kapanmaz eğer biz bunu manuel olarak kapatmazsak
bu kapatılmayan nesneyi temizleyebilir ancak açık olan dosyayı
kapatmazsak cache belleği kullanmaya devam eder.
*/

// FORMATER
// s
// d
// f



public class _12_2_StringFormat {
    /*
    💡ÖNEMLİ NOTLAR
    ❌Eclipse gibiIDE'lerde ANSI renkleri desteklenmez.
    ✅Terminal, Intellij IDEA ve VS Code Terminal'de çalışır
    ✅Windosw 10+ veya Linux/macOS'ta desteklenir.
    ✅Windows'ta CMD yerin PowerSehll veya Windows Terminal kullanmalısınız.
     */

    public static final String RESET="\033[0m"; // Renk sıfırlama
    public static final String RED="\033[31m"; // Kırmızı
    public static final String GREEN="\033[32m"; // Yeşil
    public static final String YELLOW="\033[33m"; // Sarı
    public static final String BLUE="\033[34m"; // Mavi
    public static final String PURPLE="\033[35m"; // Mor
    public static final String CYAN="\033[36m"; // Açık Mavi

    // 1. FORMATTER YAPISI
    public static void formatter1(){
        // Eğer new Formattewr yazarsak close() ile manuel kapatmak zorundayız.
        Formatter formatter=new Formatter();
        formatter.format("Merhabalar Adınız: %s, Numaranız: %d, T.C: %d, Fiyat: %f", "Hamıt", 44,11223344,44.23);
        System.out.println(formatter);
        formatter.close(); // Belleği serbest bırakma

    }

    // 2. FORMATTER YAPISI(BEST PRACTICE)
    public static void formatter2(){
        // Eğer String.format() yazarsak kapatmak zorunda değiliz.
        // GC(Garbarage Collectors otomatik çalışır.
        String formatterString=String.format("Merhabalar Adınız: %s, Numaranız: %d, T.C: %d, Fiyat: %f", "Hamıt", 44,11223344,44.23);
        System.out.println(formatterString);
    }

    // 3. FORMATTER YAPISI(COLOR)
    public static void formatter3(){
        String formatterString=String.format("Merhabalar Adınız: %s, Numaranız: %d, T.C: %d, Fiyat: %f", "Hamıt", 44,11223344,44.23);
        System.out.println(formatterString);
        System.out.println(YELLOW+formatterString+RESET);
    }

    // 4. FORMATTER YAPISI(PRINTF YAPISI)
    public static void formatter4(){
        String name="Hamit";
        int tcNumber=11223344;
        double price=44.23;
        System.out.printf("Merhabalar Adınız: %s, Numaranız: %d, T.C: %d, Fiyat: %f", name, 44,tcNumber,price);
        System.out.println();
        System.out.printf("Merhabalar Adınız: %10s, Numaranız: %d, T.C: %d, Fiyat: %f", name, 44,tcNumber,price);
        // &10s: Sağdan 10 karakter genişliğinde
        System.out.println();
        System.out.printf("Merhabalar Adınız: %-10s, Numaranız: %d, T.C: %d, Fiyat: %3f", name, 44,tcNumber,price);
        // %-10s: Sola doğru
    }

    // 5. FORMATTER YAPISI
    public static void formatter5(){}

    public static void main(String[] args) {
//        formatter1();
        //formatter2();
        formatter3();
        //formatter4();
    }
}
