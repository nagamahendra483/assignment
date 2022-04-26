package com.example.student.survey.service;

import com.example.student.survey.bean.SurveyDetails;
import com.example.student.survey.dao.SurveyDetailsDAO;
import com.example.student.survey.entity.SurveyDetailsEntity;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SurveyDetailsServiceImpl implements SurveyDetailsService{
    @Autowired
    SurveyDetailsDAO surveyDetailsDAO;

    @Override
    public List<SurveyDetails> findAllByUserName(String userName) {
        List<SurveyDetailsEntity> surveyDetailsEntities=surveyDetailsDAO.findAllByUserName(userName);
        List<SurveyDetails> surveyDetails=new ArrayList<SurveyDetails>();
        for (SurveyDetailsEntity surveyDetailsEntity :
                surveyDetailsEntities) {
            surveyDetails.add(convertEntityToBean(surveyDetailsEntity));
        }
        return  surveyDetails;
    }

    @Override
    public SurveyDetails save(SurveyDetails surveyDetails) {
        SurveyDetailsEntity surveyDetailsEntity=convertBeanToEntity(surveyDetails);
        surveyDetailsEntity=surveyDetailsDAO.save(surveyDetailsEntity);
        return convertEntityToBean(surveyDetailsEntity);
    }

    public SurveyDetails convertEntityToBean(SurveyDetailsEntity surveyDetailsEntity){
        SurveyDetails surveyDetails=new SurveyDetails();
        BeanUtils.copyProperties(surveyDetailsEntity,surveyDetails);
        return surveyDetails;
    }

    public SurveyDetailsEntity convertBeanToEntity(SurveyDetails surveyDetails){
        SurveyDetailsEntity surveyDetailsEntity=new SurveyDetailsEntity();
        BeanUtils.copyProperties(surveyDetails,surveyDetailsEntity);
        return  surveyDetailsEntity;
    }
}
