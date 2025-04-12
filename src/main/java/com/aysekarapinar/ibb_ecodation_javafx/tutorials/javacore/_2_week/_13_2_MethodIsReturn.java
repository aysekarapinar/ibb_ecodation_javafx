package com.aysekarapinar.ibb_ecodation_javafx.tutorials.javacore._2_week;

public class _13_2_MethodIsReturn {

    // 3- Returnlu Parametresiz
    public String metotReturnluParametresiz(){
        return "metot Returnlu Parametresiz";
    }

    // 4-Returnlu Parametreli
    public Integer metotReturnluParametreli(int number){
        return number;
    }

    public static void main(String[] args) {
        _13_2_MethodIsReturn isReturn= new _13_2_MethodIsReturn();
        String result1= isReturn.metotReturnluParametresiz();
        System.out.println(result1);

        Integer result2= isReturn.metotReturnluParametreli(123456);
        System.out.println(result2);
    }
}
