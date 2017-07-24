package pl.lawniczek.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.lawniczek.entity.Answer;
import pl.lawniczek.entity.request.AddAnswerRequest;
import pl.lawniczek.repository.AnswerRepository;

import java.util.List;

/**
 * Created by elawpio on 2017-07-24.
 */
@RestController
@RequestMapping("/answers")
public class AnswerController {

    private AnswerRepository answerRepository;

    @Autowired
    public void setAnswerRepository(AnswerRepository answerRepository) {
        this.answerRepository = answerRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Answer> findAllAnswers() {return answerRepository.findAll(); }

    @RequestMapping(method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public void addAnswer(AddAnswerRequest addAnswerRequest){
        Answer answer = new Answer();

        answer.setAnswerDesc(addAnswerRequest.getAnswerDesc());
        answer.setQuestion(addAnswerRequest.getQuestion());
        answerRepository.save(answer);

    }

}
