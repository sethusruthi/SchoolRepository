package com.my.school.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Student {
    @Id //This represents that rollNum is unique
    @GeneratedValue()
    private int rollNum;
    private String firstName;
    private String lastName;

}


