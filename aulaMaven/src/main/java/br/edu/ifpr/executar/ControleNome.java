package br.edu.ifpr.executar;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ControleNome
 */
@WebServlet("/controleNome")
public class ControleNome extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private List<String> nomes;
    
    
    public ControleNome() {
        nomes = new ArrayList<String>();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		nomes.add(nome);
		
		System.out.println("-*-*-*-- IMPRIMINDO A LISTA--*-*-*-*-");
		for(String n : nomes){
			System.out.println(n);
		}
	}

}
