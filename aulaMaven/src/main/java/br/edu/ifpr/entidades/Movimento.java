package br.edu.ifpr.entidades;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Movimento implements Serializable {

	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	private Integer id;
	private Double valor;
	private Conta conta;
	private static final long serialVersionUID = 1L;

	public Movimento() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}
	
	public int hashCode(){
		return conta.getId();
	}
	
	public boolean equals(Object obj){
		Movimento objetoAcomparar = (Movimento) obj;
		if(objetoAcomparar.getId() != null && objetoAcomparar.getId() != 0 && objetoAcomparar.getId() == this.id)
			return true;
		else
			return false;
	}
}
