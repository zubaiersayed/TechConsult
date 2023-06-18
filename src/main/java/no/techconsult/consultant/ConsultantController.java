package no.techconsult.consultant;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/")
@AllArgsConstructor
public class ConsultantController {

    private final ConsultantService consultantService;

    @GetMapping
    public String getConsultants(Model model){
        List<Consultant> consultantList = consultantService.getConsultantList();
        model.addAttribute("consultants", consultantList);

        return "main";
    }

    @ResponseBody
    @GetMapping (value = "/{id}")
    public ResponseEntity<Consultant> getConsultant(@RequestParam Long id){
        return ResponseEntity
                .ok()
                .body(consultantService.getConsultant(id));
    }

    @ResponseBody
    @PostMapping
    public ResponseEntity<Consultant> addConsultant(@RequestBody @Valid Consultant consultant){
        return ResponseEntity
                .ok()
                .body(consultantService.addConsultant(consultant));
    }

}
