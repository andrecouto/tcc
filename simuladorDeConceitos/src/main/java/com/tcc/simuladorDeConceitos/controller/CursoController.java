package com.tcc.simuladorDeConceitos.controller;

import com.tcc.simuladorDeConceitos.model.Curso;
import com.tcc.simuladorDeConceitos.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/curso")
@CrossOrigin
public class CursoController {
    @Autowired
    private CursoService cursoService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(@RequestBody Curso curso){
        cursoService.saveCurso(curso);
        return "Curso adicionado!";
    }

    @GetMapping("/getAll")
    public List<Curso> getAllCursos(){
        return cursoService.getAllCursos();
    }
}
