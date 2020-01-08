package com.desafio.backEndDesafio.dto;

import com.desafio.backEndDesafio.models.Endereco;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class EnderecoDTO {

    private Long id;

    private Long cep;

    private String logradouro;

    private String complemento;

    private String bairro;

    private String uf;

    public EnderecoDTO(Endereco endereco) {
        this.id = endereco.getId();
        this.cep = endereco.getCep();
        this.logradouro = endereco.getLogradouro();
        this.complemento = endereco.getComplemento();
        this.bairro = endereco.getBairro();
        this.uf = endereco.getUf();
    }
}
