package pl.lawniczek.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
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
@RequestMapping("/surveys")
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

    @RequestMapping(method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public void addSurvey ( AddSurveyRequest addSurveyRequest){
        Survey survey = new Survey();
        survey.setTitle(addSurveyRequest.getTitle());
       // survey.setQuestions(addSurveyRequest.getQuestions());
        surveyRepository.save(survey);

    }

}
