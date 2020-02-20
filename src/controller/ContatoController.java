package controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class ContatoController {

	private String nome;
	private String email;
	private String mensagem;
	
	public void entrar() {
		System.out.println("Nome: "+nome+"\nEmail: "+email+"\nMensagem: "+mensagem);
		limpar();
	}
	
	public void limpar() {
		this.nome = "";
		this.email = "";
		this.mensagem = "";
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getMensagem() {
		return mensagem;
	}
	
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
}
