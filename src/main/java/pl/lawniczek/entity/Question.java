package pl.lawniczek.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by elawpio on 2017-07-21.
 */
@Entity
@Table(name = "QUESTION")
public class Question {

    @Id
    @GeneratedValue
    private long id;

    @ManyToOne
    private Survey survey;

    private String questionDesc;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "question")
    private List<Answer> answers = new ArrayList<>();

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    public Survey getSurvey() {

        return survey;
    }

    public void setSurvey(Survey survey) {
        this.survey = survey;
    }

    public long getId() {

        return id;
    }

    public void setId(long id) {
        this.id = id;
    }



    public String getQuestionDesc() {

        return questionDesc;
    }

    public void setQuestionDesc(String questionDesc) {
        this.questionDesc = questionDesc;
    }



    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", questionDesc='" + questionDesc + '\'' +
                ", answerId=" + answers +
                '}';
    }
}
