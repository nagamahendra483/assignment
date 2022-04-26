package com.example.student.survey.controller;

import com.example.student.survey.bean.SurveyDetails;
import com.example.student.survey.service.SurveyDetailsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
public class SurveyDetailsController {
    @Autowired
    SurveyDetailsService surveyDetailsService;

    @GetMapping(value = "/getAllDetails")
    public ResponseEntity<List<SurveyDetails>> getAllDetails(){
        List<SurveyDetails> surveyDetails=surveyDetailsService.findAll();
        log.info(" All Survey Details Retrieved");
        return new ResponseEntity<>(surveyDetails,HttpStatus.OK);
    }


    @PostMapping(value = "/add")
    public ResponseEntity<SurveyDetails> addEmployee(
            @RequestBody SurveyDetails SurveyDetails){
        SurveyDetails surveyDetail=surveyDetailsService.save(SurveyDetails);
        log.info("New Survey added with id {}",SurveyDetails.getId());
        return new ResponseEntity<>(surveyDetail,HttpStatus.OK);
    }
}
