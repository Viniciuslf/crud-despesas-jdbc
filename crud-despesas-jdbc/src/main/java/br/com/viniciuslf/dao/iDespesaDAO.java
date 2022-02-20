package br.com.viniciuslf.dao;

import br.com.viniciuslf.model.Categoria;
import br.com.viniciuslf.model.Despesa;

import java.util.List;
import java.util.Optional;

public interface iDespesaDAO {

    Despesa save(Despesa despesa);
    Despesa update(Despesa despesa);
    void delete(Long id);
    List<Despesa> findAll();
    Optional<Despesa> findById(long id);
    List<Despesa> findByCategoria(Categoria categoria);

}
