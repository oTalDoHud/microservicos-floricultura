package br.com.cursoalura.microservice.loja.loja.service;

import br.com.cursoalura.microservice.loja.loja.model.dto.CompraDTO;
import br.com.cursoalura.microservice.loja.loja.model.dto.InfoFornecedorDTO;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class CompraService {
    public void realizarCompra(CompraDTO dto) {
        RestTemplate cliente = new RestTemplate();
        ResponseEntity<InfoFornecedorDTO> exchange = cliente.exchange("http://localhost:8081/info/" +
                        dto.getEndereco().getEstado(), HttpMethod.GET, null, InfoFornecedorDTO.class);
    }
}
