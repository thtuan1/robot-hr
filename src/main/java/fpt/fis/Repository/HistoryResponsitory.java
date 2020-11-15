package fpt.fis.Repository;

import fpt.fis.Model.History;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface HistoryResponsitory extends JpaRepository<History ,Long> {
    @Query("from History")
    List<History> getAllHistory();
}
