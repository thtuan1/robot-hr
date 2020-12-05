package fpt.fis.Sevice;

import fpt.fis.DTO.UngVienDTO;
import fpt.fis.Model.UngVien;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface UngVienService {
    List<UngVienDTO> getAll();
    UngVien Add(UngVien ungVien);
    UngVien Updated(UngVien ungVien);
    UngVien Save(UngVien ungVien);
    UngVien deletedUngVien(@RequestParam("id ") Long id);
    UngVien getOne(Long id);
    boolean checkExitCMND(Long cmnd);
}
