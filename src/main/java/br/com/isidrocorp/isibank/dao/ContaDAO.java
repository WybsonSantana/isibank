package br.com.isidrocorp.isibank.dao;

import org.springframework.data.repository.CrudRepository;
import br.com.isidrocorp.isibank.model.Conta;

public interface ContaDAO extends CrudRepository<Conta, Integer> {

}
