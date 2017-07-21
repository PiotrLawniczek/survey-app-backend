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
    @ManyToOne
    private long id;





}
