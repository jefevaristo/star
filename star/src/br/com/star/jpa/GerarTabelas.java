package br.com.star.jpa;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GerarTabelas {
	public static void main(String[] args) {
		
		EntityManagerFactory factoryRecebimentos = Persistence.createEntityManagerFactory("star");
		
		
		factoryRecebimentos.close();
		
	}
	

}
