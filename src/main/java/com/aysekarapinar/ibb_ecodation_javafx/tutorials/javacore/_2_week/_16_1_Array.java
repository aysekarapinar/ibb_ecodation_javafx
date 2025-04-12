package com.aysekarapinar.ibb_ecodation_javafx.tutorials.javacore._2_week;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class _16_1_Array {

    // 1. YÖNTEM
    public static String[] arrayMethod1() throws ArrayIndexOutOfBoundsException{
        // String Dizisi
        String[] city=new String[6]; // Eleman sayısı:6
        city[0]="Malatya";
        city[1]="Elazığ";
        city[2]="Bingöl";
        city[3]="Muş";
        city[5]="Van";

        System.out.println("Eleman sayısı: "+city.length);
        System.out.println(city[0]);
        System.out.println("Son Eleman: "+city[city.length-1]);
        return city;
    }

    // 2. YÖNTEM
    public static String[] arrayMethod2() throws ArrayIndexOutOfBoundsException{
        // String Dizisi
        //String[] city={"Malatya","Elazığ","Bingöl",null,"Muş","Van"}; // Eleman sayısı:6
        String[] city={"Malatya","Elazığ","Bingöl","Muş","Van","İstanbul","Ankara","Sivas","Konya","Nevşehir"}; // Eleman sayısı:6

        System.out.println("Eleman sayısı: "+city.length);
        System.out.println(city[0]);
        System.out.println("Son Eleman: "+city[city.length-1]);
        return city;
    }

    // 3. YÖNTEM
    public static void arrayMethod3(){
        String[] city= arrayMethod1();

        // ITERATIVE FOR DÖNGÜSÜ
        for (int i = 0; i< city.length; i++) {
            System.out.println(_15_4_SpecialColor.BLUE+city[i]+_15_4_SpecialColor.RESET);
        }
    }

    // 4. YÖNTEM FOR EACH
    public static void arrayMethod4(){
        String[] city= arrayMethod2();

        // FOR EACH
        for (String temp : city){
            System.out.println(_15_4_SpecialColor.YELLOW+temp
                    +_15_4_SpecialColor.RESET);
        }
    }

    // 5. YÖNTEM (Arrays.sort) Küçükten Büyüğe Doğru
    public static void arrayMethod5(){
        String[] city= arrayMethod2();
        //Dizilerde Sıralama (Küçükten Büyüğe Doğru Sıralama)
        Arrays.sort(city);
        // FOR EACH
        for (String temp : city){
            System.out.println(_15_4_SpecialColor.YELLOW+temp
                    +_15_4_SpecialColor.RESET);
        }
    }

    // 6. YÖNTEM (Arrays.sort(Collections.reverseOrder()) Büyükten Küçüğe Doğru Sıralama
    public static void arrayMethod6(){
        String[] city= arrayMethod2();
        //Dizilerde Sıralama (Büyükten Küçüğe Doğru Sıralama)
        Arrays.sort(city, Collections.reverseOrder());
        // FOR EACH
        for (String temp : city){
            System.out.println(_15_4_SpecialColor.RED+temp
                    +_15_4_SpecialColor.RESET);
        }
    }

    // RANDOM NUMBER
    public static int randomNumber(){
        Random random= new Random();
        int rndInt=random.nextInt(9)+1; // 1<=NUMBER<=9
        return rndInt;
    }

    // 7. YÖNTEM FILL
    public static void  arrayMethod7(){
        int[] number= new int[7];
        // FILL: Tek bir değeri dizinin tüm elemanlarına atamak için tasarlanmış
        Arrays.fill(number, randomNumber());
        // ITERATIVE FOR : Her defasında farklı bir sayı gelsin
        for (int i=0; i<number.length; i++) {
            number[i]=randomNumber(); //I. YOL:
            //Arrays.setAll(number, data ->randomNumber()); //II. YOL
        }
    }

    // 8. YÖNTEM COPY
    public static void arrayMethod8(){
        // Original
        String[] originalCity= arrayMethod2();

        //Clone
        String[] cloneCity=Arrays.copyOf(originalCity, originalCity.length);

        //Dizilerde Sıralama (Büyükten Küçüğe Doğru Sıralama)
        Arrays.sort(cloneCity);
        //Arrays.sort(originalCity, Collections.reverseOrder());

        for (String temp : originalCity){
            System.out.println(_15_4_SpecialColor.RED+temp
                    +_15_4_SpecialColor.RESET);
        }

        //BINARY SEARCH : ARAMA
        String searchCity="Sivas";
        int index=Arrays.binarySearch(cloneCity, searchCity);
        if(index>=0) {
            System.out.println(searchCity + _15_4_SpecialColor.BLUE + "il bulunmaktadır" + _15_4_SpecialColor.RESET);
        }
        else {
            System.out.println(searchCity+_15_4_SpecialColor.RED+ "il yoktur" + _15_4_SpecialColor.RESET);
        }
    }

    public static void main(String[] args) {
        arrayMethod1();
        arrayMethod2();
        arrayMethod3();
        arrayMethod4();
        arrayMethod5();
        arrayMethod6();
        arrayMethod7();
        arrayMethod8();
    }
}