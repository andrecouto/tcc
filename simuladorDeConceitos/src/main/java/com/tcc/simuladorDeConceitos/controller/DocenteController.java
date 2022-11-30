package com.tcc.simuladorDeConceitos.controller;

import com.tcc.simuladorDeConceitos.model.Docente;
import com.tcc.simuladorDeConceitos.service.DocenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/docente")
@CrossOrigin
public class DocenteController {
    @Autowired
    private DocenteService docenteService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(@RequestBody Docente docente){
        docenteService.saveDocente(docente);
        return "Docente adicionado!";
    }

    @GetMapping("/getAll")
    public List<Docente> getAllDocentes(){
        return docenteService.getAllDocentes();
    }
}
