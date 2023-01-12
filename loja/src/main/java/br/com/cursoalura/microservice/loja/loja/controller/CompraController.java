package br.com.cursoalura.microservice.loja.loja.controller;

import br.com.cursoalura.microservice.loja.loja.model.dto.CompraDTO;
import br.com.cursoalura.microservice.loja.loja.service.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "compras")
public class CompraController {

    @Autowired
    private CompraService compraService;

    @RequestMapping(method = RequestMethod.POST)
    public void realizaCompra(@RequestBody CompraDTO dto){
        compraService.realizarCompra(dto);

    }
}
