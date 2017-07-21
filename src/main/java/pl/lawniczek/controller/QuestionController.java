package pl.lawniczek.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.lawniczek.entity.Question;
import pl.lawniczek.entity.request.AddQuestionRequest;
import pl.lawniczek.repository.QuestionRepository;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by elawpio on 2017-07-21.
 */
@RestController
@RequestMapping("/questions")
public class QuestionController {

    private QuestionRepository questionRepository;

    @Autowired
    public void setQuestionRepository(QuestionRepository questionRepository) { this.questionRepository = questionRepository;  }


    @RequestMapping(method = RequestMethod.GET)
    public List<Question> findAllSurveys(){
        return questionRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public void addQuestion(@Valid AddQuestionRequest addQuestionRequest){
        Question question = new Question();

        question.setSurvey(addQuestionRequest.getSurvey());
        questionRepository.save(question);
    }

}
