package fpt.fis.Repository;

import fpt.fis.Model.ExtraInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ExtraInformationRespontory extends JpaRepository<ExtraInformation, Long> {
    @Query("from ExtraInformation")
    List<ExtraInformation> getAll();
}
