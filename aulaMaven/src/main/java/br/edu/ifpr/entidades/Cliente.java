package br.edu.ifpr.entidades;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Entity implementation class for Entity: Cliente
 *
 */
@Entity
public class Cliente implements Serializable {

	   
	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	private Integer id;
	private String nome;
	private static final long serialVersionUID = 1L;

	public Cliente() {
		super();
	}   
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int hashCode(){
		return this.nome.charAt(0);
	}
	
	public boolean equals(Object obj){
		Cliente clienteAcomparar = (Cliente) obj;
		if(clienteAcomparar.getId() != null && clienteAcomparar.getId() != 0 && clienteAcomparar.getId() == this.id)
			return true;
		else
			return false;
	}
   
}
