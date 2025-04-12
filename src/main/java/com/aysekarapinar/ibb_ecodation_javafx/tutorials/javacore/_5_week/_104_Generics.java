package com.aysekarapinar.ibb_ecodation_javafx.tutorials.javacore._5_week;

public class _104_Generics {

    // Data Types
    private String name;
    private String surname;// Generics Type

    // Constructor (Parametresiz)
    public _104_Generics() {

    }

    // Constructor (Parametreli)
    // Generics Constructor
    public _104_Generics(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    // Generics Method
    public <T> void fullData(T data) {
        System.out.println(data);
    }

    // GETTER AND SETTER
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    //toString
    @Override
    public String toString() {
        return "Week5_04_Generics{" +
                "name='" + name + '\'' +
                ", surname=" + surname +
                '}';
    }

    public static void main(String[] args) {
       _104_Generics genericsData=new _104_Generics();
        genericsData.setName("Hamit");
        System.out.println(genericsData.getName());

        _104_Generics genericsData2=new _104_Generics();
        genericsData2.setName("Özlem");
        // genericsData2.setSurname(true);
        // genericsData2.setSurname(44);
        // genericsData2.setSurname(44.16);
        genericsData2.setSurname("Akpınar");
        System.out.println(genericsData2);
        genericsData2.fullData(44);
    }
}
