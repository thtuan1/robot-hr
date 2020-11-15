package fpt.fis.Sevice.SeviceImpl;

import fpt.fis.DTO.HistoryDTO;
import fpt.fis.Model.History;
import fpt.fis.Repository.HistoryResponsitory;
import fpt.fis.Sevice.HistoryService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class HistoryServiceImpl implements HistoryService {
    @Autowired
    private HistoryResponsitory historyResponsitory;
    private ModelMapper modelMapper =new ModelMapper();
    @Override
    public List<HistoryDTO> getAll() {
        List<History> histories = historyResponsitory.getAllHistory();
        List<HistoryDTO> historyDTOS = histories.stream().map(history -> modelMapper
                .map(history, HistoryDTO.class)).collect(Collectors.toList());
        return historyDTOS;
    }
    @Override
    public History addHistory( History history)
    {
        History history1= historyResponsitory.save(history);
        return historyResponsitory.findById(history1.getId()).orElse(null);
    }

}
