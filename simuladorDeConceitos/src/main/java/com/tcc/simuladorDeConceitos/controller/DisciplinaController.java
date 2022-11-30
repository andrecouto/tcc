package com.tcc.simuladorDeConceitos.controller;

import com.tcc.simuladorDeConceitos.model.Disciplina;
import com.tcc.simuladorDeConceitos.service.DisciplinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/disciplina")
@CrossOrigin
public class DisciplinaController {
    @Autowired
    private DisciplinaService disciplinaService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(@RequestBody Disciplina disciplina){
        disciplinaService.saveDisciplina(disciplina);
        return "Disciplina adicionada!";
    }

    @GetMapping("/getAll")
    public List<Disciplina> getAllDisciplinas(){
        return disciplinaService.getAllDisciplinas();
    }
}
