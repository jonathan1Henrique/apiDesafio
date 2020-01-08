package com.desafio.backEndDesafio.models;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.List;

/**
 * Entidade Cliente
 * @author JONATHAN HENRIQUE
 * @LastEdition 07/01/2020
 *
 */
@Getter
@Setter
@Entity
@Table(name = "cliente", schema = "desafio")
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "SQ_CLIENTE", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "SQ_CLIENTE", sequenceName = "desafio.SQ_CLIENTE", initialValue = 1, allocationSize = 1)
    private Long id;

    @Column(name = "NOME")
    private String nome;

    @Column(name = "CPF")
    private String cpf;

    @Column(name = "EMAIL")
    private String email;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ENDERECO", referencedColumnName = "id")
    private Endereco endereco;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<Telefone> telefone;

}
