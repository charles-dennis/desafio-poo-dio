package br.com.dio.desafio.dominio;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class CursoAceleracao extends Curso{
	
	private Set<Conteudo> conteudos = new LinkedHashSet<>();
	private Set<Dev> devsInscritos = new HashSet<>();
	private Conteudo conteudo;

	public Conteudo getConteudo() {
		return conteudo;
	}

	public void setConteudo(Conteudo conteudo) {
		this.conteudo = conteudo;
	}

	public Set<Dev> getDevsInscritos() {
		return devsInscritos;
	}

	public void setDevsInscritos(Set<Dev> devsInscritos) {
		this.devsInscritos = devsInscritos;
	}

	public Set<Conteudo> getConteudos() {
		return conteudos;
	}

	public void setConteudos(Set<Conteudo> conteudos) {
		this.conteudos = conteudos;
	}

	
	
	
	
}
