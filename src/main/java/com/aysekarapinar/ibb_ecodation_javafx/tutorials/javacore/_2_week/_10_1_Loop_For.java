package com.aysekarapinar.ibb_ecodation_javafx.tutorials.javacore._2_week;

public class _10_1_Loop_For {
    public static void main(String[] args) {
        //i++
        //i=i+1
        //i+=1
        for (int i=1; i<=10; i++) {
            System.out.println(i+"");
        }

        System.out.println("\n##########################\n");

        // for düngüsü sonsuzluk
        // for (;;){}
        int number=1;
        for(;;){
            System.out.println(number);
            number++;
            if (number>=50)
                break;
        }
    }
}