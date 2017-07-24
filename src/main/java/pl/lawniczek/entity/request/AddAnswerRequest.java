package pl.lawniczek.entity.request;

import pl.lawniczek.entity.Answer;
import pl.lawniczek.entity.Question;

import java.util.List;

/**
 * Created by elawpio on 2017-07-24.
 */
public class AddAnswerRequest {

    private String answerDesc;

    private Question question;

    public String getAnswerDesc() {
        return answerDesc;
    }

    public void setAnswerDesc(String answerDesc) {
        this.answerDesc = answerDesc;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }
}
