package com.simpleform.simpleform.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity

 @Table(name="registered_users") // recommended to use

@AllArgsConstructor
@Data
@NoArgsConstructor
public class RegisteredUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min=1, max=20)
    private String name;

    @NotNull
    @Min(1)
    @Max(150)
    private int age;

    public RegisteredUser(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
