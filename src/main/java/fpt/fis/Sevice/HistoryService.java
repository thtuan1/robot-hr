package fpt.fis.Sevice;

import fpt.fis.DTO.HistoryDTO;
import fpt.fis.Model.History;

import java.util.List;

public interface HistoryService {
    List<HistoryDTO> getAll();
    History addHistory(History history);
}
