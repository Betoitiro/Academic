package itiroBeto.com.github.SpringBoot.controller;

import itiroBeto.com.github.SpringBoot.model.Diciplina;
import itiroBeto.com.github.SpringBoot.repository.DiciplinaRepository;
import itiroBeto.com.github.SpringBoot.service.DiciplinaService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.HTML;
import java.util.List;

@RestController
@RequestMapping("/diciplina")
public class DiciplinaController {

    @Autowired
    DiciplinaService diciplinaService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody Diciplina diciplina){
        diciplinaService.create(diciplina);
    }

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<Diciplina> findAll(){
        return diciplinaService.FindAll();
    }

    @GetMapping("/professor/{id}")
    @ResponseStatus(HttpStatus.OK)
    public  List<Diciplina> findByIdProfessor(@PathVariable Long professorId){
        return diciplinaService.findByIdProfessor(professorId);
    }
}
