package pl.lawniczek.entity.request;

import pl.lawniczek.entity.Survey;

/**
 * Created by elawpio on 2017-07-21.
 */
public class AddQuestionRequest {

    private String questionDesc;

    private Survey survey;

    public Survey getSurvey() {
        return survey;
    }

    public void setSurvey(Survey survey) {
        this.survey = survey;
    }

    public String getQuestionDesc() {
        return questionDesc;
    }

    public void setQuestionDesc(String questionDesc) {
        this.questionDesc = questionDesc;
    }
}
