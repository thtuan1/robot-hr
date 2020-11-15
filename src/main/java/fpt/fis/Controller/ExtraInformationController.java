package fpt.fis.Controller;

import fpt.fis.DTO.ExtraInformationDTO;
import fpt.fis.Model.ExtraInformation;
import fpt.fis.Sevice.ExtraInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins ="http://localhost:4200",allowedHeaders = "*")
@RequestMapping(value = "/extraInfo")
public class ExtraInformationController {
    @Autowired
    private ExtraInformationService extraInformationService;

    @GetMapping(value = "/getAll")
    public ResponseEntity<List<ExtraInformationDTO>> getAllExtraInfo()
    {
        List<ExtraInformationDTO> result = extraInformationService.getAll();
        return new ResponseEntity(result, HttpStatus.OK);

    }
    @PostMapping(value = "/add")
    public ResponseEntity<?> addExtraInfo(@RequestBody ExtraInformation extraInformation)
    {
        ExtraInformation extraInformation1= extraInformationService.addExtraInfo(extraInformation);
        return new ResponseEntity<>(extraInformation1, HttpStatus.OK);
    }
    @PostMapping(value = "/update")
    public ResponseEntity<?> updatedExtraInfo(@RequestBody ExtraInformation extraInformation) {
        ExtraInformation extraInformation1 = extraInformationService.upadatedExtraInfo(extraInformation);
        return new ResponseEntity<>(extraInformation1, HttpStatus.OK);
    }
}
