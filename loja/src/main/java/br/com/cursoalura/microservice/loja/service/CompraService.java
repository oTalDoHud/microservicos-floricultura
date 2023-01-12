package br.com.cursoalura.microservice.loja.service;

import br.com.cursoalura.microservice.loja.model.dto.CompraDTO;
import br.com.cursoalura.microservice.loja.model.dto.InfoFornecedorDTO;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CompraService {

    public void realizarCompra(CompraDTO dto) {
        RestTemplate cliente = new RestTemplate();
        ResponseEntity<InfoFornecedorDTO> exchange =
                cliente.exchange("http://localhost:8081/info/" +
                        dto.getEndereco().getEstado(), HttpMethod.GET, null, InfoFornecedorDTO.class);

        System.out.println(exchange.getBody().getEndereco());
    }
}
