package com.example.trigo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class ReceitaController {

    private final ReceitaRepository repository;

    ReceitaController(ReceitaRepository repository){
        this.repository = repository;
    }

    @GetMapping("/Receita")
    List<Receita> all (){
        return repository.findAll();
    }

    @PostMapping("/Receita")
    Receita newReceita(@RequestBody Receita newReceita){
        return repository.save(newReceita);
    }

    

}
