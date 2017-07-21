package pl.lawniczek.entity;

import javax.persistence.*;

/**
 * Created by elawpio on 2017-07-20.
 */
@Entity
@Table(name = "SURVEY")
public class Survey {

    @Id
    @GeneratedValue
    private long id;

    private String title;

    @OneToMany(mappedBy = "survey")
    private long questionId;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String name) {
        this.title = name;
    }

    public long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(long questionId) {
        this.questionId = questionId;
    }

    @Override
    public String toString() {
        return "Survey{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", questionId=" + questionId +
                '}';
    }
}
