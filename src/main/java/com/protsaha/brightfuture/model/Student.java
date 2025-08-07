package com.protsaha.brightfuture.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Student")
@Data
public class Student {
    @Id
    private String studentId;

    private Admission admission;
    private AadharInfo aadharInfo;
    private Parents parents;
    private PersonalDetails personalDetails;
    private PreviousSchool previousSchool;
    private Address address;
}
