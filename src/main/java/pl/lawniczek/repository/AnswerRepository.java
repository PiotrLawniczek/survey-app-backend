package pl.lawniczek.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.lawniczek.entity.Answer;

/**
 * Created by elawpio on 2017-07-21.
 */

@Repository
public interface AnswerRepository extends JpaRepository<Answer, Long>{
}
