package com.desafio.backEndDesafio.repository;

import com.desafio.backEndDesafio.models.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface ClienteRepository extends CrudRepository<Cliente, Long> {
}
