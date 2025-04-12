package com.aysekarapinar.ibb_ecodation_javafx.tutorials.javacore._2_week;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class _15_1_Date {

    // Date (GET)
    public static void dateGetMethod(){
        //java.util.Date date=new Date();
        Date now=new Date();
        System.out.println("Şu andaki zaman: "+now);
        System.out.println("1 Ocak 1970 yılından şimdiki zamana kadar geçen milisaniye cinsinden: "+now.getTime());
        System.out.println("Date: "+now.getDate());

        System.out.println("#######################");
        System.out.println("Day: "+now.getDay());
        System.out.println("Mouth: " +now.getMonth());//Saymaya 0'dan başlar
        System.out.println("Year: " +(1900+now.getYear())); //1900(Ekle veya Çıkar)
        System.out.println("Date Yılı: "+(2025-now.getYear()));
        System.out.println("Hours: "+now.getHours());
        System.out.println("Minute: "+now.getMinutes());
        System.out.println("Second: "+now.getSeconds());
    }

    // Date (SET)
    public static void dateSetMethod(){}

    // 1. YÖNTEM
    public static String  nowFormat1() throws NullPointerException{
        Date now = new Date();
        String specialFormat="Şimdiki Zaman: "
                .concat(String.valueOf(now.getHours()))
                .concat(":")
                .concat(String.valueOf(now.getMinutes()))
                .concat(":")
                .concat(String.valueOf(now.getSeconds()))
                .toString();
        return specialFormat;
    }

    // 2. YÖNTEM
    public static String  nowFormat2() throws NullPointerException{
        Date now = new Date();
        // %s: String
        // %d: Decimal
        // %f: Float
        return String.format("Şimdiki zaman: %02d:%02d:%02d", now.getHours(), now.getMinutes(), now.getSeconds());
    }

     // 3. YÖNTEM
    public static String  nowFormat3() throws NullPointerException{
        Date now=new Date();

        Locale locale=new Locale("TR", "tr");
        //SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MMM-dd HH:mm:ss", locale);
        //SimpleDateFormat sdf=new SimpleDateFormat("dd/MMMM/yyyy HH:mm:ss", locale);
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MMMM/yyyy HH:mm:ss zzzz", locale);

        String formetedDate=String.format("Şimdiki Zaman: %s", sdf.format(now));
        return new Date().toString()+" - "+formetedDate;
    }

    public static void main(String[] args) {
        dateGetMethod();
        String newDate= nowFormat1();
        System.out.println(newDate);

        String nowDate2=nowFormat2();
        System.out.println(nowDate2);

        String newDate3=nowFormat3();
        System.out.println(newDate3);
    }
}
