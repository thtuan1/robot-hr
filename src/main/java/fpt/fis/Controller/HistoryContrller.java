package fpt.fis.Controller;

import fpt.fis.DTO.HistoryDTO;
import fpt.fis.Model.History;
import fpt.fis.Sevice.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/history")
public class HistoryContrller {
    @Autowired
    private HistoryService historyService;

    @GetMapping(value = "/getAllHistory")
    public List<HistoryDTO> getAllHistory(){
        return historyService.getAll();
    }

    @PostMapping(value = "/addHistory")
    public ResponseEntity<?> addHistory(@RequestBody History history)
    {
        History history1= historyService.addHistory(history);
        return new ResponseEntity<>(history1, HttpStatus.OK);
    }
}
