package com.example.student.survey.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GenerationType;
import java.time.LocalDateTime;

@Entity
@Table(name = "survey_details")
@Data
public class SurveyDetailsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String userName;
    private String email;
    private String telephoneNumber;
    private String street;
    private String city;
    private String state;
    private String zip;
    private String url;
    private String dateOfSurvey;
    private String interestedInUniversity;
    private String campusOptions;
    private String highSchoolGradMonth;
    private String highSchoolGradYear;
    private String comments;
    private String recommendingOption;
}
