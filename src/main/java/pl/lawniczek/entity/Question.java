package pl.lawniczek.entity;

import javax.persistence.*;

/**
 * Created by elawpio on 2017-07-21.
 */
@Entity
@Table(name = "QUESTION")
public class Question {

    @Id
    @GeneratedValue
    private long id;

    private String questionDesc;

    @OneToMany(mappedBy = "question")
    private long answerId;

    public long getId() {

        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public long getAnswerId() {
        return answerId;
    }

    public void setAnswerId(long answerId) {
        this.answerId = answerId;
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
                ", answerId=" + answerId +
                '}';
    }
}
