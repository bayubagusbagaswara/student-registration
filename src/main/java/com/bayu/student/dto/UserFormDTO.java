package com.bayu.student.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserFormDTO {

    private String name;

    private String email;

    private String password;

    private String gender;

    private String address;

    private boolean married;

    private String profession;
}
