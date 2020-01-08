package com.desafio.backEndDesafio.dto;

import com.desafio.backEndDesafio.models.Telefone;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class TelefoneDTO{

    private Long id;

    private Long ddd;

    private String numeroTel;

    public TelefoneDTO (Telefone telefone){
        this.id = telefone.getId();
        this.ddd = telefone.getDdd();
        this.numeroTel = telefone.getNumeroTel();


    }

    public List<TelefoneDTO> trasformaTelefoneDTO(List<Telefone> telefones){
        List<TelefoneDTO> dto = new ArrayList<>();
        for (Telefone telefone : telefones){
            dto.add(new TelefoneDTO(telefone));
        }
        return dto;
    }

}
