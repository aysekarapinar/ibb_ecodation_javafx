package com.aysekarapinar.ibb_ecodation_javafx.tutorials.javacore._3_week;

import com.aysekarapinar.utils.SpecialColor;

// POJO: Plain Old Java Object
// Sadece field+getterand+setter olduğu kısımlar

public class _04_ClassPOJO {

    // Field
    private String name;
    private String surname;


    // Getter And Setter


    public String getSurname() {
        return surname= surname.toUpperCase();
    }

    public void setSurname(String surname) {
        this.surname = surname.toUpperCase();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        _04_ClassPOJO pojo= new _04_ClassPOJO();
        pojo.setName("Özlem");
        pojo.setSurname("Karapinar");
        String nameAndSurname=pojo.getName().toString()+" "+pojo.getSurname().toString();
        System.out.println(SpecialColor.BLUE+nameAndSurname+SpecialColor.RESET);
        // Kullanıcının Soyisminin ilk üç harfini büyük yazınız ve soyisimi eğer 3 harften fazlaysa geri kalan harflerinin yerine (*)
        // Özlem KARAPİNAR , Özlem KAR***(Maskeleme)
        // Tip(loop, conditional)
    }
}
