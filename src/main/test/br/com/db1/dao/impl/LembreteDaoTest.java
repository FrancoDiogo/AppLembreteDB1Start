package br.com.db1.dao.impl;

import org.junit.Before;
import org.junit.Test;

import br.com.db1.model.Lembrete;

public class LembreteDaoTest extends AbstractTestCase {
	
	private LembreteDao dao;
	
	@Before
	public void init() {
		dao = new LembreteDao(manager);
	}
	
	@Test
	public void inserirTest() {
	
		dao.inserir("Acordar");
	}
}
