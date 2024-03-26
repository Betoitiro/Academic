package itiroBeto.com.github.SpringBoot.service;

import itiroBeto.com.github.SpringBoot.model.Professor;
import itiroBeto.com.github.SpringBoot.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfessorService {
    @Autowired
    ProfessorRepository professorRepository;

    public void create(Professor professor){ professorRepository.save(professor);
    }

}
