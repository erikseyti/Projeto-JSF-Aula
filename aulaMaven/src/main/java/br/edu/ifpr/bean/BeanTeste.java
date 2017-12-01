package br.edu.ifpr.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Named;

@Named
@javax.enterprise.context.SessionScoped
public class BeanTeste implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String valor;
	private List<String> nomes = new ArrayList<String>();

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}
	
	public List<String> getNomes() {
		return nomes;
	}

	public void setNomes(List<String> nomes) {
		this.nomes = nomes;
	}

	public void salvar()
	{
		//Salvar String em List Nomes
		nomes.add(valor);
	}

}
