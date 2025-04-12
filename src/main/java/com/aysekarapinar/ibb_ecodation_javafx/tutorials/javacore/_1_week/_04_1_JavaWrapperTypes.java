package com.aysekarapinar.ibb_ecodation_javafx.tutorials.javacore._1_week;

public class _04_1_JavaWrapperTypes {
    public static void main(String[] args) {
        //PRIMITIVE TYPE
        byte primitiveTypeByte=127;
        //primitiveTypeByte=null; primitive type null değer veremezsin
        System.out.println(primitiveTypeByte);
        short primitiveTypeShort=32767;
        int primitiveTypeInt=2134567;
        long primitiveTypeLong=9876543234566543L;
        float primitiveTypeFloat=14.23F;
        double primitiveTypeDouble=14.23;
        boolean primitiveTypeBoolean=true;
        char primitiveTypeChar='a';

        //WRAPPER TYPE
        Byte wrapperTypeByte=127;
        wrapperTypeByte=null; //wrapper types null değer verilebilir.
        System.out.println(wrapperTypeByte);
        Short wrapperTypeShort=32767;
        Integer wrapperTypeInteger=2134567;
        Long wrapperTypeLong=9876543234566543L;
        Float wrapperTypeFloat=14.23F;
        Double wrapperTypeDouble=14.23;
        Boolean wrapperTypeBoolean=true;
        Character wrapperTypeCharacter='a';

    }
}
