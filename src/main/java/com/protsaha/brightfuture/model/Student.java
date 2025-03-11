package com.protsaha.brightfuture.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Student")
@Data
public class Student {
    @Id
    private String id;
    private String name;
    private int age;
    private String email;
    private String course;
    private String dob;
    private String aadhar;
    private String contactNumber1;
    private String contactNumber2;
    private Address address;
    private Grade grade;
    private Parents parents;

    // Getters and Setters (Omitted for brevity)
}
