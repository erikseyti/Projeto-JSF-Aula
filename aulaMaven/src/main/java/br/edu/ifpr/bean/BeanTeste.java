package br.edu.ifpr.bean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class BeanTeste {
	
	private String valor;

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}
	
	public void salvar()
	{
		//salvar
		valor = valor+" Boa Noite!";
	}

}
