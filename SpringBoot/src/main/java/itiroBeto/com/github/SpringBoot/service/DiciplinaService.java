package itiroBeto.com.github.SpringBoot.service;

import itiroBeto.com.github.SpringBoot.model.Diciplina;
import itiroBeto.com.github.SpringBoot.repository.DiciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DiciplinaService {

    @Autowired
    DiciplinaRepository diciplinaRepository;

    public void create (Diciplina diciplina){
        diciplinaRepository.save(diciplina);
    }


}
