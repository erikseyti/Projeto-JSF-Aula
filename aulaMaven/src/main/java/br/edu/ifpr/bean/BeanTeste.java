package br.edu.ifpr.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.edu.ifpr.entidades.Empresa;

@Named
@SessionScoped
public class BeanTeste implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String valor;
	private List<String> nomes = new ArrayList<String>();
	@Inject
	private Empresa empresa;

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

	public void salvar(){
		//salvar
		nomes.add(valor);
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	
	
}
