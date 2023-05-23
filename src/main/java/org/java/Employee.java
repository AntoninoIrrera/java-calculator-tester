package org.java;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Employee {

	private String nome;
	private String cognome;
	private LocalDate dataDiNascita;
	private String ruolo;
	

	public Employee(String nome, String cognome, LocalDate dataDiNascita, String ruolo) {
		this.nome = nome;
		this.cognome = cognome;
		this.dataDiNascita = dataDiNascita;
		this.ruolo = ruolo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) throws Exception {
		
		if(nome.equals("")) {
			throw new Exception("il nome non puo essere vuoto");
		}else {
			
			this.nome = nome;
		}
		
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) throws Exception {
		if(nome.equals("")) {
			throw new Exception("il cognome non puo essere vuoto");
		}else {
			
			this.cognome = cognome;
		}
	}

	public LocalDate getDataDiNascita() {
		return dataDiNascita;
	}

	public void setDataDiNascita(LocalDate dataDiNascita) throws Exception {
		
		if(dataDiNascita.isBefore(LocalDate.now())) {
			throw new Exception("inserire una data valida");
		}else {
			
			this.dataDiNascita = dataDiNascita;
		}
		
	}

	public String getRuolo() {
		return ruolo;
	}

	public void setRuolo(String ruolo) throws Exception {
		
		List<String> myList = new ArrayList<>();
		
		myList.add("employee");
		myList.add("boss");
		
		if(myList.contains(ruolo)) {
			this.ruolo = ruolo;			
		}else {
			throw new Exception("il ruolo selezionato non va benen");
		}
		
	}
	
	
	
	
	
}
