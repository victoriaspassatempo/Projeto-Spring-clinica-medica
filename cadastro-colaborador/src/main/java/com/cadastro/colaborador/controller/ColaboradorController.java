package com.cadastro.colaborador.controller;

import com.cadastro.colaborador.service.ColaboradorService;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;

@RestController
@RequestMapping(value = "/api")
public class ColaboradorController {

    final ColaboradorService service;

    public ColaboradorController(ColaboradorService service) {
        this.service = service;
    }

}
