package fpt.fis.Sevice.SeviceImpl;

import fpt.fis.DTO.NguoiThanDTO;
import fpt.fis.Model.NguoiThan;
import fpt.fis.Repository.NguoiThanResponsitory;
import fpt.fis.Sevice.NguoiThanService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class NguoiThanServiceImpl implements NguoiThanService {
    @Autowired
    private NguoiThanResponsitory nguoiThanRepository;
    private ModelMapper modelMapper=new ModelMapper();

    @Override
    public List<NguoiThanDTO> getAll(Long ungvien_id) {
        List<NguoiThan> nguoiThans = nguoiThanRepository.getAllNguoiThan(ungvien_id);
        List<NguoiThanDTO> nguoiThanDTOS = nguoiThans.stream().map(nguoiThan -> modelMapper
                .map(nguoiThan, NguoiThanDTO.class)).collect(Collectors.toList());
        return nguoiThanDTOS;
    }
    @Override
    public NguoiThan Updated(NguoiThan nguoiThan)
    {
        nguoiThanRepository.save(nguoiThan);
        return nguoiThanRepository.findById(nguoiThan.getId()).orElse(null);
    }
    @Override
    public NguoiThan Add(NguoiThan nguoiThan){
        NguoiThan nguoiThan1=nguoiThanRepository.save(nguoiThan);
        return nguoiThanRepository.findById(nguoiThan1.getId()).orElse(null);
    }
    @Override
    public NguoiThan deletedNguoiThan(@RequestParam("id") Long id)
    {
        NguoiThan nguoiThan= nguoiThanRepository.findById(id).orElse(null);
        nguoiThan.setFlag(true);
        nguoiThanRepository.save(nguoiThan);
        return nguoiThan;
    }
    @Override
    public NguoiThan Save(NguoiThan nguoiThan) {
        return nguoiThanRepository.save(nguoiThan);
    }
}
