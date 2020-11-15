package fpt.fis.Sevice;

import fpt.fis.DTO.ExtraInformationDTO;
import fpt.fis.Model.ExtraInformation;

import java.util.List;
import java.util.Optional;

public interface ExtraInformationService {
    List<ExtraInformationDTO> getAll();
    ExtraInformation addExtraInfo(ExtraInformation extraInformation);

    ExtraInformation upadatedExtraInfo(ExtraInformation extraInformation);

    ExtraInformation SaveExtraInfo(ExtraInformation extraInformation);
    Optional<ExtraInformation> getOne(Long ID);
}
