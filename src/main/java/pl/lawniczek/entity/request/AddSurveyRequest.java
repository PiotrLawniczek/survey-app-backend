package pl.lawniczek.entity.request;

import pl.lawniczek.entity.Question;

import java.util.List;

/**
 * Created by elawpio on 2017-07-20.
 */
public class AddSurveyRequest {

    private String title;

    private List<Question> questions;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }
}
