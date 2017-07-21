package pl.lawniczek.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

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

    @JsonIgnoreProperties("answers")
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "survey")
    private List<Question> questions = new ArrayList<>();


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

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    @Override
    public String toString() {
        return "Survey{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", questionId=" + questions +
                '}';
    }
}
