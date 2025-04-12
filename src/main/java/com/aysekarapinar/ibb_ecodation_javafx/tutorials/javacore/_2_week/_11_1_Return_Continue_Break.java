package com.aysekarapinar.ibb_ecodation_javafx.tutorials.javacore._2_week;
/*
Kullanıcının Verdiği pozitif bir sayıya kadar toplamını yapan hesaplayan Algoritma ?
Şartlar - 1 : Kullanıcı eğer sayı olarak  100  fazla sayı girerse 100'e kadar toplasın. (break)
Şartlar - 2 : Kullanıcı verdiği sayılar içinde eğer 47 varsa bunu toplamaya dahil etmesin.(continue)
Çıkan sonuç tek mi ? çift mi ?
Çıkan sonuç tek mi? çift mi?
 */

import java.util.Scanner;

public class _11_1_Return_Continue_Break {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen pozitif bir sayı giriniz: ");
        int number=Math.abs(scanner.nextInt());

        int sum=0;
        for (int i=1; i<=number; i++){
            //Eğer 47 varsa toplama
            if(i==47) {
                System.out.println("Verdiğiniz sayıda 47 olduğu için onu toplamaya dahil etmiyoruz");

                continue; //47 toplama dahil etme
            }

            if(i>100) {
                System.out.println("Verdiğiniz sayıda 100'den büyük için onu toplamaya dahil etmiyoruz");

                break; //100'den sonra toplamayı durdur
            }
            // 1.YOL sum=sum+i;
            sum+=i;
        }

        System.out.println("Tolam: "+sum);

        //Çıkan sonuç çift mi? tek mi?

        if(sum%2==0)
            System.out.println(sum+" Sayı çif");
        else
            System.out.println(sum+" Sayı tek");
        //klavye kapat
        scanner.close();
    }
}
