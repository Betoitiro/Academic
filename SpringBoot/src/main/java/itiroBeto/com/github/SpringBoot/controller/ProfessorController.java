package itiroBeto.com.github.SpringBoot.controller;

import itiroBeto.com.github.SpringBoot.model.Professor;
import itiroBeto.com.github.SpringBoot.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

public class ProfessorController {

    @Autowired
    ProfessorService professorService;


    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody Professor professor){
        professorService.create(professor);
    }
}
