package com.aysekarapinar.ibb_ecodation_javafx.tutorials.javacore._3_week;

 /*1. Kullanıcının Soyisminin ilk üç harfini büyük yazınız ve soyisimi eğer 3 harften fazlaysa geri kalan harflerinin yerine yıldız (*)
  Hamit MIZRAK , Hamit MIZ***(Maskeleme)
  Tip(loop, conditional)*/
//2. İsim ayarlanırken, isim baş harfi büyük geri kalan küçük olacak şekilde ayarlanabilir mi?
//3. İsim ve soyisim birlikte dönen bir metod oluşturulabilir mi?
//4. Soyisimde noktalama işaretleri olup olmadığını kontrol eden bir doğrulama ekleyebilir miyiz?
//5. İsim veya soyisim boş girildiğinde varsayılan bir değer atanabilir mi?
//6. İsim ve soyisimde sadece harfler olup olmadığını kontrol edebilir miyiz?
//7. Kullanıcıdan isim ve soyismini girerken karakter sınırı koyabilir miyiz?
//8. İsmi veya soyismi tamamen büyük harfe çevirecek bir metod ekleyebilir miyiz?

import com.aysekarapinar.utils.SpecialColor;

import java.util.Date;
import java.util.Objects;

public class _05_ClassBEAN {

    // Field
    private Long id;
    private String name;
    private String surname;
    private Date createDate;

    // Constructor Metot(Parametreli)
    public _05_ClassBEAN() {
        id=0L;
        name="isim alanını yazmadınız";
        this.surname="soyisim alanı yazmadınız";
        this.createDate=new Date((System.currentTimeMillis()));
    }

    // Constructor(Parametreli)
    public _05_ClassBEAN(Long id, Date createDate, String surname, String name) {
        this.id = id;
        this.createDate = new Date(System.currentTimeMillis());
        this.surname = surname;
        this.name = name;
    }

    public _05_ClassBEAN(String surname, String name) {
        id=0L;
        this.surname = surname;
        this.name = name;
        this.createDate = new Date(System.currentTimeMillis());
    }

    //Method
    public String fullName(){
        return id+name.toString()+" "+this.surname+createDate;
    }

    //toString

    @Override
    public String toString() {
        return "_05_ClassBEAN{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", createDate=" + createDate +
                '}';
    }

    //Equals And HashCode
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        _05_ClassBEAN classBEAN = (_05_ClassBEAN) o;
        return Objects.equals(id, classBEAN.id) && Objects.equals(name, classBEAN.name) && Objects.equals(surname, classBEAN.surname) && Objects.equals(createDate, classBEAN.createDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, createDate);
    }


    // Getter And Setter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {


    }


    public String getName() {
        return name;
    }

    //2. İsim ayarlanırken, isim baş harfi büyük geri kalan küçük olacak şekilde ayarlanabilir mi?
    //Noktalamadan itibaren silsin
    public void setName(String name) throws IllegalAccessException {
        if (name!=null && !name.isEmpty() &&name.matches(".*[.,!?;:]+.*")) {
            //throw new IllegalAccessException("");
            System.err.println("İsimde noktalama işaretleri var");
            System.out.println(SpecialColor.RED+ "İsimde noktalama işaretleri var noktalama işaretinden sonraki harfler silindi"+SpecialColor.RESET);
            name=name.replaceAll("[.,!?;:].*", "");
            System.out.println(name);
        }
        if (name!=null & name.isEmpty()) {
            this.name=name.substring(0,1).toUpperCase()+ name.substring(1).toLowerCase();
        }else {
            this.id = id;
        }
    }

//4. Soyisimde noktalama işaretleri olup olmadığını kontrol eden bir doğrulama ekleyebilir miyiz?

    public String getSurname() {
        return surname;
    }

    /*
    1. Kullanıcının Soyisminin ilk üç harfini büyük yazınız ve soyisimi
    eğer 3 harften fazlaysa geri kalan harflerinin yerine yıldız (*)
    Hamit MIZRAK , Hamit MIZ***(Maskeleme)
    Tip(loop, conditional)
    */

    public void setSurname(String surname) {
        if(surname!=null & surname.length()>=3) {
            this.surname=surname.substring(0,3).toUpperCase()+"*".repeat(surname.length()-3); // Tekrar

        } else if (surname!=null) {
            this.surname=surname.toUpperCase();
        }else {
            this.surname="";
        }

    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public static void main(String[] args) {
        _05_ClassBEAN bean1=new _05_ClassBEAN();
        bean1.setId(1L);
        bean1.setName("Özlem");
        bean1.setSurname("Karapinar");
        System.out.println(SpecialColor.BLUE+bean1.getId()+" "+bean1.getName()+" "+bean1.getSurname()+" "+bean1.getCreateDate()+SpecialColor.RESET);
        System.out.println(SpecialColor.YELLOW+" "+bean1+" "+SpecialColor.RESET);

        _05_ClassBEAN bean2=new _05_ClassBEAN("Özlem","Karapinar");
        System.out.println(SpecialColor.YELLOW+" "+bean2+" "+SpecialColor.RESET);
    }
}


