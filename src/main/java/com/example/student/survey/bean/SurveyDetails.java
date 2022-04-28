package com.example.student.survey.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class SurveyDetails {
    @JsonIgnore
    private Integer id;
    private String userName;
    private String email;
    private String telephoneNumber;
    private String street;
    private String city;
    private String state;
    private String zip;
    private String url;
    private LocalDateTime dateOfSurvey;
    private String interestedInUniversity;
    private String campusOptions;
    private String highSchoolGradMonth;
    private String highSchoolGradYear;
    private String comments;
    private String recommendingOption;
}
