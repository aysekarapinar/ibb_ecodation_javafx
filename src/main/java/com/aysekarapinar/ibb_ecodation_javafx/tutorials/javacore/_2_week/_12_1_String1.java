package com.aysekarapinar.ibb_ecodation_javafx.tutorials.javacore._2_week;

public class _12_1_String1 {
    public static void main(String[] args) {
        String vocabulary1=" Java öğreniyorum ";
        String vocabulary2=" Java öğreniyorum ";
        vocabulary1=vocabulary1.trim();

        //Length()
        System.out.println("Harf sayısı: " + vocabulary1.length());
        //toUpperCase(): hepsini büyük karakter yap
        //toLowerCase(): hepsini küçük karakter yap
        System.out.println("BÜYÜK HARF:"+vocabulary1.toUpperCase());
        System.out.println("küçük harf:"+vocabulary1.toLowerCase());
        //Trim(): başında veya sonundaki boşlukları alır
        System.out.println("Trim: " + vocabulary1.trim().length());
        System.out.println("Trim: " + vocabulary1.trim());
        //equals(): eşit mi? \ ==
        System.out.println(vocabulary1==vocabulary2);
        System.out.println("equals:" + vocabulary1.equals(vocabulary2));
        System.out.println("equalsIgnoreCase:" + vocabulary1.equalsIgnoreCase(vocabulary2));
        //StarsWith()
        System.out.println(vocabulary1.startsWith(" ") + "ile mi başlıyor");
        //EndsWith()
        System.out.println(vocabulary1.endsWith(" ") + "ile mi bitiyor");
        //charAt: sıfırdan saymaya başlar, ve verdiğimiz sayı ilgili kelimenin harfini gösterir
        System.out.println(vocabulary1.charAt(0));
        //subString: parçalama/2 yöntem var
        //1. Süpürme
        //2. Aralarında
        System.out.println(vocabulary1.substring(1));
        System.out.println(vocabulary1.substring(1,10));

        //Contains
        System.out.println("Geçiyor mu?" + vocabulary1.contains("Java"));

        //Split

        //Replace: değiştirme
        System.out.println("Değiştirme: " + vocabulary1.replace("Java", "Java 2025"));

        //Birleştirme
        String concatenation=vocabulary1+vocabulary2+vocabulary1;
        System.out.println(concatenation);
        System.out.println(vocabulary1.concat("jsp").concat("jsf"));

        //StringBuilder
        StringBuilder stringBuilder= new StringBuilder();
        stringBuilder.append(vocabulary1).append("jsp").append("jsf");
        String dataToString1= stringBuilder.toString();
        System.out.println(dataToString1);

        //StringBuffer
        StringBuffer stringBuffer= new StringBuffer();
        stringBuffer.append(vocabulary1).append("jsp").append("jsf");
        String dataToString2= stringBuilder.toString();
        System.out.println(dataToString2);

        //Hashcode
        System.out.println(vocabulary1.hashCode());
        System.out.println(vocabulary2.hashCode());
    }
}
