package com.aysekarapinar.ibb_ecodation_javafx.tutorials.javacore._2_week;

import com.aysekarapinar.utils.SpecialColor;

import java.util.Scanner;

/*
Kullanıcıdan Girilen Sayının Faktoriyelini Bulma
Soru;
Kullanıcıdan bir tam sayı alarak faktöriyelini hesaplayan iterative ve
recursive metota göre programı yazınız
Validation-1: Kullanıcı sıfırdan küçük bir sayı verene kadar hesaplama yapsın
Validation-2: Kullanıcı sıfırdan küçük sayı verirse döngü dursun(break)
Validation-3: Kullanıcı eğer virgüllü sayı verirse kullanıcıya tekrardan
sayı girilmesi beklensin. Eğer kullanıcı 3 kere virgüllü sayı girerse kullanıcının hakkı
kalmadığı için sistemden atsın(System.exit(0))
 */

/*
Yöntem       |  Zaman Karmaşıklığı  | Uzay Karmaşıklığı  |  Avantaj               | Dezavantaj
-------------|  ------------------    -----------------     -------                 ----------
Iterative    |  O(n)                | O(1)               |  Hızlı,hafıza dostu    | Kodu daha uzundur
Recursive    |  O(n)                | O(n)               |  Daha okunaklı         | Yavaştır
                                                            Matematiksel gösterim
 */

public class Week_Examples_3{

    // Kullanıcıdan sayısal değer al
    public static long isNumber(){
        //Variables
        long number, result = 1;
        byte doubleRemainingRight = 3; // Ondalıklı sayı giriş hakkı
        boolean IsActive = true;
        //result:1 veermeliyiz ki, 1 sayısı çarpmada etkisizdir ve başlangıç değerimizdir

        //Klavye
        Scanner scanner = new Scanner((System.in));

        // Sonsuz Döngü
        while (true) {
            if (doubleRemainingRight > 0) {
                System.out.println("\nLütfen pozitif bir sayı giriniz: ");
                // Kullanıcıdan ondalıklı sayı girip girmediğini kontrol edelim
                if (scanner.hasNextInt()) {
                    number = scanner.nextLong();
                    if (number <= 0) {
                        System.out.println(SpecialColor.RED + "Sıfırdan küçük bir sayı girdiniz" + SpecialColor.RESET);
                        //number = Math.abs(number);
                        //break; 1. YOL(Yalnızca bulunduğu döngü veya switch bloğunu etkiler)
                        System.exit(0); // 2. YOL(JVM'i kapatarak programı tamamen sonlandırır)
                    } else if (number == 0) {
                        System.out.println(number + SpecialColor.BLUE + " sayısının faktöriyeli 1");
                        return 1;
                    } else {
                       iterativeFactoriyel(number);
                    }
                } else if (scanner.hasNextDouble()) {
                    //doubleRemainingRight= (byte) (doubleRemainingRight-1);
                    doubleRemainingRight--;
                    System.out.println(SpecialColor.RED + "Ondalıklı bir sayı girdiniz, kalan hakkınız" + doubleRemainingRight + SpecialColor.RESET);

                    if (doubleRemainingRight == 0) {
                        System.out.println("Üç defa ondalıklıa sayı girdiğinizden dolayı program sonlandı");
                        IsActive = false;
                        System.exit(0);
                    }
                    scanner.next(); // Geçersiz girdileri temizlemek için kullanılır
                } else {
                    System.out.println(SpecialColor.RED + "Harf girdiniz" + SpecialColor.RESET);
                    break;
                } // END HARF
            } else {
                System.out.println("Virgüllü sayı hakkınız kalmadı ve program JVM tarafınfan sonlanıyor");
                System.exit(0);
            }
        } // END WHILE
        // SCANNER CLOS
        scanner.close();
        return  0L;
    }

    // ITERATIVE
    public static void iterativeFactoriyel(long userData) {
        long result = 1;
        for (int i = 1; i <= userData; i++) {
            //result=result*i;
            result *= i;
        }
        System.out.println(userData + SpecialColor.YELLOW + "İterative sayısının" + userData + "!=" + result + SpecialColor.RESET);
    }

    // RECURSIVE
    public static long recursiveFactoriyel(long userData){
        // Sıfır veya 1 faktöriyel 1
        if (userData==0 || userData==1)
            return 1;
        return userData * recursiveFactoriyel(userData-1);
    }

    public static void isResult(){
        System.out.println("\nLütfen seçim yapınız\n 1)Iterative Factoriyel\n2)Recursive Factoriyel\n3)Çıkış");
        Scanner scanner=new Scanner(System.in);
        int chooise=scanner.nextInt();
        switch (chooise) {
            case 1:
                iterativeFactoriyel(isNumber());
                break;
            case 2:
                recursiveFactoriyel(isNumber());
                break;
            default:
                System.out.println("Doğru seçim yapınız");
                break;
        }
    }

    // PSVM
    public static void main(String[] args) {
        isResult();
    }
}