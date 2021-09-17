package br.com.isidrocorp.isibank.dao;

import org.springframework.data.repository.CrudRepository;
import br.com.isidrocorp.isibank.model.Cliente;

public interface ClienteDAO extends CrudRepository<Cliente, Integer> {

}