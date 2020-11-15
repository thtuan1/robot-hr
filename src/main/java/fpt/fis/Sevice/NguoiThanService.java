package fpt.fis.Sevice;

import fpt.fis.DTO.NguoiThanDTO;
import fpt.fis.Model.NguoiThan;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface NguoiThanService {

    List<NguoiThanDTO> getAll(Long ungvien_id);

    NguoiThan Updated(NguoiThan nguoiThan);

    NguoiThan Add(NguoiThan nguoiThan);
    NguoiThan Save(NguoiThan nguoiThan);

    NguoiThan deletedNguoiThan(@RequestParam("id") Long id);
}
