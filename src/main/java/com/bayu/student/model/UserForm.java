package com.bayu.student.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USER_FORM")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserForm {

    @Id
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    @GeneratedValue(generator = "system-uuid")
    private String id;

    private String name;

    private String email;

    private String password;

    private String gender;

    private String address;

    private boolean married;

    private String profession;
}
