package fpt.fis.Repository;

import fpt.fis.Model.UngVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UngVienResponsitory extends JpaRepository<UngVien,Long> {
    @Query("from UngVien where flag=false")
    List<UngVien> getAll();
    @Query("SELECT CASE WHEN count  (u.cMND)>0  then true ELSE false END FROM UngVien u WHERE u.cMND = ?1")
    boolean existsUsernameMembership(int cmnd);
}
