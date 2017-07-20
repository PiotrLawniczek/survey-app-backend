package pl.lawniczek.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.lawniczek.entity.Survey;

/**
 * Created by elawpio on 2017-07-20.
 */

@Repository
public interface SurveyRepository extends JpaRepository<Survey, Long> {


}
