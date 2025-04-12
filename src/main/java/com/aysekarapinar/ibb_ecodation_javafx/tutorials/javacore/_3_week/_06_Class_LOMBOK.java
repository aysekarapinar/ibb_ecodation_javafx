package com.aysekarapinar.ibb_ecodation_javafx.tutorials.javacore._3_week;

import lombok.*;

import java.util.Date;

@NoArgsConstructor // Parametresi Constructor
@AllArgsConstructor // Parametreli Constructor
//@Data
@Getter
@Setter
@ToString
@Builder
public class _06_Class_LOMBOK {

    // Field
    private Long id;
    private String name;
    private String surname;
    private Date createDate;

    public static void main(String[] args) {
        _06_Class_LOMBOK lombok= _06_Class_LOMBOK.builder()
                .id(0L)
                .name("Özlem")
                .surname("Karapinar")
                .createDate(new Date(System.currentTimeMillis()))
                .build();

        System.out.println(lombok);
    }
}
