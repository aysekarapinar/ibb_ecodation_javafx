package com.aysekarapinar.ibb_ecodation_javafx.tutorials.javacore._2_week;

public class _13_1_MethodIsNotReturn {

    // 1-Metotlar (metot Returnsuz Parametresiz)
    public void metotReturnsuzParametresiz(){
        System.out.println("metotReturnsuzParametresiz");
    }

    // 2- Metotlar (Returnsuz Parametreli)
    public static void metotReturnsuzParametreli(String name) {
        System.out.println("metot Returnsuz Parametreli " + name);
    }

    //overloading:
    public static void metotReturnsuzParametreli(String name, String surname) {
        System.out.println("metot Returnsuz Parametreli " + name + " " + surname);
    }

        //new
        //static

        public static void main (String[]args){
            _13_1_MethodIsNotReturn data1 = new _13_1_MethodIsNotReturn();
            data1.metotReturnsuzParametresiz();

            //instance(new) olmadan static ile çağırma
            _13_1_MethodIsNotReturn.metotReturnsuzParametreli("Ayşe");
            _13_1_MethodIsNotReturn.metotReturnsuzParametreli("Ayşe", "Karapinar");
        }
}
