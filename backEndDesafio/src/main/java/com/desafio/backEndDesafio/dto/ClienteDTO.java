package com.desafio.backEndDesafio.dto;

import com.desafio.backEndDesafio.models.Cliente;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class ClienteDTO {

    private Long id;

    private String nome;

    private String cpf;

    private String email;

    private EnderecoDTO endereco;

    private List<TelefoneDTO> telefone;

    public ClienteDTO (Cliente cliente){
        this.id = cliente.getId();
        this.nome = cliente.getNome();
        this.cpf = cliente.getCpf();
        this.email = cliente.getEmail();
        this.telefone = new TelefoneDTO().trasformaTelefoneDTO(cliente.getTelefone());
        this.endereco = new EnderecoDTO(cliente.getEndereco());
    }

}

