package br.com.db1.dao.impl;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.db1.dao.DAO;
import br.com.db1.model.Lembrete;

public class LembreteDao implements DAO<Lembrete>{
	
	private EntityManager manager;

	@Inject
	public LembreteDao(EntityManager manager) {
		this.manager = manager;
	}
	
	public String inserir(String descricao){
		manager.contains(descricao);
		
		return descricao;
	}

	public List<Lembrete> findAll() {
		return null;
	}

	public Lembrete findById(Integer id) {
		return null;
	}

	public List<Lembrete> findByName(String name) {
		return null;
	}

	public boolean save(Lembrete t) {
		return false;
	}

	public boolean delete(Integer id) {
		return false;
	}
	
}
