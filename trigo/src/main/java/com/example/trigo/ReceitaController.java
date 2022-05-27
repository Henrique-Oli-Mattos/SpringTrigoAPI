package com.example.trigo;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class ReceitaController {

    private final ReceitaRepository repository;

    ReceitaController(ReceitaRepository repository){
        this.repository = repository;
    }

    @GetMapping("/receita")
    List<Receita> all (){
        return repository.findAll();
    }

    @PostMapping("/receita")
    Receita newReceita(@RequestBody Receita newReceita){
        return repository.save(newReceita);
    }

    @GetMapping("/receita/{id}")
    Receita one(@PathVariable Long id) {
    
    return repository.findById(id).orElseThrow();
  }

    @PutMapping("/receita/{id}")
    Receita replaceReceita(@RequestBody Receita newReceita, @PathVariable Long id){
        return repository.findById(id).map(
            receita -> {receita.setNome(newReceita.getNome());
                        receita.setIgredientes(newReceita.getIgredientes());
                        receita.setModoPreparo(newReceita.getModoPreparo());
                        receita.setFiltro(newReceita.getFiltro());
                        return repository.save(receita);
                    }).orElseGet(() -> {
                            newReceita.setId(id);
                            return repository.save(newReceita);
                    });
    }

    @DeleteMapping("/receita/{id}")
    void deleteReceita(@PathVariable Long id){
        repository.deleteById(id);
    }
}