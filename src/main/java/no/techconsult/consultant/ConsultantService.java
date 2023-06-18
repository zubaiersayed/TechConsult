package no.techconsult.consultant;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ConsultantService {

    private final ConsultantRepository consultantRepository;

    public List<Consultant> getConsultantList() {
        return consultantRepository.findAll();
    }

    public Consultant getConsultant(Long id){
        return consultantRepository.findById(id).orElseThrow(() -> new RuntimeException("Passenger not found"));
    }

    public Consultant addConsultant(Consultant consultant){
        return consultantRepository.save(consultant);
    }

}
