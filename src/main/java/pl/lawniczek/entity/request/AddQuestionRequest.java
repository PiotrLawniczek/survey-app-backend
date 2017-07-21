package pl.lawniczek.entity.request;

import pl.lawniczek.entity.Survey;

/**
 * Created by elawpio on 2017-07-21.
 */
public class AddQuestionRequest {

    private String question;

    private Survey survey;

    public Survey getSurvey() {
        return survey;
    }

    public void setSurvey(Survey survey) {
        this.survey = survey;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
}
