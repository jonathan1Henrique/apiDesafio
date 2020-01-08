package com.desafio.backEndDesafio.services;

import com.desafio.backEndDesafio.dto.ClienteDTO;
import com.desafio.backEndDesafio.models.Cliente;
import com.desafio.backEndDesafio.models.Telefone;
import com.desafio.backEndDesafio.repository.ClienteRepository;
import com.desafio.backEndDesafio.repository.TelefoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(
          path = "/cliente",
          produces = {MediaType.APPLICATION_JSON_VALUE})
public class ClienteService {

    @Autowired
    ClienteRepository repository;

    @Autowired
    TelefoneRepository telRepository;

    @PostMapping
    public void salvar(@RequestBody Cliente cliente){
        cliente.setTelefone(setClienteTelefone(cliente));
        repository.save(cliente);
    }

    @GetMapping(headers = "Accept=application/json")
    public ResponseEntity<Iterable<ClienteDTO>> findAll(){
        return ResponseEntity.ok(getClienteDTO(repository.findAll()));
    }

    private Iterable<ClienteDTO> getClienteDTO(Iterable<Cliente> cliente) {
        List<ClienteDTO> all = new ArrayList<>();
        for (Cliente c: cliente) {
            all.add(new ClienteDTO(c));
        }
        return all;
    }

    private List<Telefone> setClienteTelefone(Cliente cliente){
        List<Telefone> all = new ArrayList<>();
        for(Telefone tel : cliente.getTelefone()){
            tel.setCliente(cliente);
            all.add(tel);
        }
        return all;
    }


}
