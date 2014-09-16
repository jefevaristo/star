package br.com.star.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class JPAUtil {
	
private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("star");
	
		public EntityManager getEntityManager() {
		return factory.createEntityManager();
		}

}
