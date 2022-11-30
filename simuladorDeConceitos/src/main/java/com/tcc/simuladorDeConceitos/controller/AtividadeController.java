package com.tcc.simuladorDeConceitos.controller;

import com.tcc.simuladorDeConceitos.model.Atividade;
import com.tcc.simuladorDeConceitos.service.AtividadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/atividade")
@CrossOrigin
public class AtividadeController {
    @Autowired
    private AtividadeService atividadeService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(@RequestBody Atividade atividade){
        atividadeService.saveAtividade(atividade);
        return "Atividade adicionada!";
    }

    @GetMapping("/getAll")
    public List<Atividade> getAllAtividades(){
        return atividadeService.getAllAtividades();
    }
}
