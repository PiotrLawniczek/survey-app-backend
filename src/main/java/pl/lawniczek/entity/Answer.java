package pl.lawniczek.entity;

import javax.persistence.*;

/**
 * Created by elawpio on 2017-07-21.
 */

@Entity
@Table(name = "ANSWER")
public class Answer {

    @Id
    @GeneratedValue
    private long id;

    @ManyToOne
    private Question question;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "id=" + id +
                ", question=" + question +
                '}';
    }

}
