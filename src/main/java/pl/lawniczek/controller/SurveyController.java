package pl.lawniczek.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.lawniczek.entity.Survey;
import pl.lawniczek.entity.request.AddSurveyRequest;
import pl.lawniczek.repository.SurveyRepository;

import java.util.List;


/**
 * Created by elawpio on 2017-07-20.
 */

@RestController
public class SurveyController {

    private SurveyRepository surveyRepository;

    @Autowired
    public SurveyController(SurveyRepository surveyRepository) {
        this.surveyRepository = surveyRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Survey> findAllSurveys(){
        return surveyRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addSurvey (@RequestBody AddSurveyRequest addSurveyRequest){

        Survey survey = new Survey();
        survey.setName(addSurveyRequest.getName());
        surveyRepository.save(survey);
    }




}
