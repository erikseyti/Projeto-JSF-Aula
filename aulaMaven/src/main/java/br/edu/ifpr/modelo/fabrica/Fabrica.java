package br.edu.ifpr.modelo.fabrica;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Fabrica {
	private static EntityManagerFactory factory;
	
	static{
		factory = Persistence.createEntityManagerFactory("postgresqlPU");
	}
	
	public static EntityManagerFactory get(){
		return factory;
	}
}
