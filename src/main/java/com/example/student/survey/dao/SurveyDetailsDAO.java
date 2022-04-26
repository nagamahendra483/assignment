package com.example.student.survey.dao;

import com.example.student.survey.entity.SurveyDetailsEntity;
import org.springframework.data.repository.RepositoryDefinition;

import java.util.List;

@RepositoryDefinition(domainClass = SurveyDetailsEntity.class,idClass = Integer.class)
public interface SurveyDetailsDAO {
    public List<SurveyDetailsEntity> findAllByUserName(String userName);
    public SurveyDetailsEntity save(SurveyDetailsEntity employeeEntity);
}
