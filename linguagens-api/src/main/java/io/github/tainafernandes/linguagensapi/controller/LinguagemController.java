package io.github.tainafernandes.linguagensapi.controller;

import io.github.tainafernandes.linguagensapi.entity.Linguagem;
import io.github.tainafernandes.linguagensapi.repository.LinguagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
public class LinguagemController {
    @Autowired
    private LinguagemRepository repository;
    @GetMapping("/linguagens")
    public List<Linguagem> getLinguagens(){
        List<Linguagem> linguagens = repository.findAll();
        return linguagens;
    }

    @PostMapping("/linguagens")
    public Linguagem create(@RequestBody Linguagem linguagem){
        return repository.save(linguagem);
    }

    @PutMapping("/linguagens/{id}")
    public Linguagem update(@PathVariable String id, @RequestBody Linguagem linguagem){
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        linguagem.setId(id);
        return repository.save(linguagem);
    }

    @DeleteMapping("/linguagens/{id}")
    public void delete(@PathVariable String id){
        if(!repository.existsById(id)){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        repository.deleteById(id);
    }

}
