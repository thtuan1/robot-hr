package fpt.fis.Sevice.SeviceImpl;

import fpt.fis.DTO.ExtraInformationDTO;
import fpt.fis.Model.ExtraInformation;
import fpt.fis.Repository.ExtraInformationRespontory;
import fpt.fis.Sevice.ExtraInformationService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ExtraInformationServiceImpl implements ExtraInformationService {
    @Autowired
    private ExtraInformationRespontory extraInformationRespontory;
    private ModelMapper modelMapper=new ModelMapper();
    @Override
    public List<ExtraInformationDTO> getAll() {
        List<ExtraInformation> extraInformations = extraInformationRespontory.getAll();
        List<ExtraInformationDTO> extraInformationDTOS = extraInformations.stream().map(extraInformation -> modelMapper
                .map(extraInformation,ExtraInformationDTO.class)).collect(Collectors.toList());
        return extraInformationDTOS;
    }
    @Override
    public ExtraInformation addExtraInfo(ExtraInformation extraInformation)
    {
        ExtraInformation extraInformation1= extraInformationRespontory.save(extraInformation);
        return extraInformationRespontory.findById(extraInformation1.getId()).orElse(null);
    }
    @Override
    public ExtraInformation upadatedExtraInfo(ExtraInformation extraInformation) {
        extraInformationRespontory.save(extraInformation);
        return extraInformationRespontory.findById(extraInformation.getId()).orElse(null);
    }

    @Override
    public ExtraInformation SaveExtraInfo(ExtraInformation extraInformation) {
        return extraInformationRespontory.save(extraInformation);
    }
    @Transactional
    public Optional<ExtraInformation> getOne(Long id) {
//        Optional<UngVien> ungVien = ungVienRepository.findById(id);
        return extraInformationRespontory.findById(id);
    }

}
