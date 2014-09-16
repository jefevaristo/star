package br.com.star.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.star.modelo.Recebimentos;


public class RecebimentosDAO {
	
	//primeiro crie um construtor para receber o entitymanager
	private EntityManager manager;
	
	public RecebimentosDAO (EntityManager manager) {
		this.manager = manager;
	}
	
	//proximo passo é criar os construtrer add rmove altera e lista
	
	public Recebimentos busca (Integer id){
		return this.manager.find(Recebimentos.class, id);
	}
	
	public Recebimentos Adiciona (Integer id){
		return this.manager.find(Recebimentos.class, id);
	}
	
	public Recebimentos remove (Integer id){
		return this.manager.find(Recebimentos.class, id);
	}
	
	public List<Recebimentos> lista() {
		return this.manager.createQuery("Select c from Recebimentos c",Recebimentos.class).getResultList();
	}
	
	
}
