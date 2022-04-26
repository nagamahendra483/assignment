package com.example.student.survey.service;

import com.example.student.survey.bean.SurveyDetails;

import java.util.List;

public interface SurveyDetailsService {
    public List<SurveyDetails> findAll();
    public SurveyDetails save(SurveyDetails employeeBean);
}
