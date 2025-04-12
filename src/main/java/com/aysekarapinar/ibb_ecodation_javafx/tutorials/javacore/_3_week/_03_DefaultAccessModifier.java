package com.aysekarapinar.ibb_ecodation_javafx.tutorials.javacore._3_week;

import com.aysekarapinar.utils.SpecialColor;

public class _03_DefaultAccessModifier {

    public String publicData="public data";
    private String privateData="private data";
    protected String projectData="project data";
    String defaultData="default data";

    public static void main(String[] args) {
        _02_PublicAccessModifier accessModifier= new _02_PublicAccessModifier();
        System.out.println(SpecialColor.BLUE+accessModifier.publicData+SpecialColor.RESET);
        System.out.println(SpecialColor.CYAN+accessModifier.defaultData+SpecialColor.RESET);
        System.out.println(SpecialColor.PURPLE+accessModifier.projectData+SpecialColor.RESET);
        //System.out.println(SpecialColor.RED+accessModifier.privateData+SpecialColor.RESET);
    }
}
