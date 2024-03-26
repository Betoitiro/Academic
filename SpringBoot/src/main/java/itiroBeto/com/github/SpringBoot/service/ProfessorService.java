package itiroBeto.com.github.SpringBoot.service;

import itiroBeto.com.github.SpringBoot.model.Professor;
import itiroBeto.com.github.SpringBoot.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class ProfessorService {
    @Autowired
    ProfessorRepository professorRepository;

    public void create(Professor professor){ professorRepository.save(professor);
    }

    public List<Professor> findAll(){
        return professorRepository.findAll();
    }

    public Optional<Professor> findById(Long id){
        return professorRepository.findById(id);
    }

    public void updated(Long id, Professor professor){
        Optional<Professor> professorFromdb = findById(id);

        if(professorFromdb.isEmpty()){
            throw  new ResponseStatusException(HttpStatus.NOT_FOUND, "Aluno não encontrado no banco de dados");
        }

        Professor professorUpdated = professorFromdb.get();

        professorUpdated.setName(professor.getName());
        professorUpdated.setEmail(professor.getEmail());
        professorUpdated.setMateria(professor.getMateria());
    }

    public void deleteById(Long id){
        professorRepository.deleteById(id);
    }
}
