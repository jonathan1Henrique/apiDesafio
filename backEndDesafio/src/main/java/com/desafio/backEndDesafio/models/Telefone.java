package com.desafio.backEndDesafio.models;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Entidade Telefone
 * @author JONATHAN HENRIQUE
 * @LastEdition 07/01/2020
 *
 */
@Getter
@Setter
@Entity
@Table(name = "telefone", schema = "desafio")
public class Telefone implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "SQ_TELEFONE", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "SQ_TELEFONE", sequenceName = "desafio.SQ_TELEFONE", initialValue = 1, allocationSize = 1)
    private Long id;

    @Column(name = "DDD")
    private Long ddd;

    @Column(name = "NUMERO_TEL")
    private String numeroTel;

    @ManyToOne
    @JoinColumn(name = "cliente")
    private Cliente cliente;

}
