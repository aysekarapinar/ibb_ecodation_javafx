package com.aysekarapinar.ibb_ecodation_javafx.tutorials.javacore._4_week;

public class _01_Enum {
    public static void main(String[] args) {
        TutorialsEStudentType eStudentType= TutorialsEStudentType.GRADUATE;
        System.out.println(eStudentType);
        System.out.println(eStudentType.name());
        System.out.println(eStudentType.ordinal());
    }
}
