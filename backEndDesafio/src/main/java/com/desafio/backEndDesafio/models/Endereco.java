package com.desafio.backEndDesafio.models;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Entidade Endereco
 * @author JONATHAN HENRIQUE
 * @LastEdition 07/01/2020
 *
 */
@Getter
@Setter
@Entity
@Table(name = "endereco", schema = "desafio")
public class Endereco implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "SQ_ENDERECO", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "SQ_ENDERECO", sequenceName = "desafio.SQ_ENDERECO", initialValue = 1, allocationSize = 1)
    private Long id;

    @Column(name = "cep")
    private Long cep;

    @Column(name = "LOGRADOURO")
    private String logradouro;

    @Column(name = "COMPLEMENTO")
    private String complemento;

    @Column(name = "BAIRRO")
    private String bairro;

    @Column(name = "UF")
    private String uf;

}
