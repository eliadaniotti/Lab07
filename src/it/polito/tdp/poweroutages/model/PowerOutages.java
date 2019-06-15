package it.polito.tdp.poweroutages.model;

import java.time.LocalDateTime;

public class PowerOutages {
	int nerc;
	int clientiColpiti;
	LocalDateTime inizio;
	LocalDateTime fine;
	
	public PowerOutages(int nerc, int clientiColpiti, LocalDateTime inizio, LocalDateTime fine) {
		this.nerc = nerc;
		this.clientiColpiti = clientiColpiti;
		this.inizio = inizio;
		this.fine = fine;
	}

	public int getNerc() {
		return nerc;
	}

	public void setNerc(int nerc) {
		this.nerc = nerc;
	}

	public int getClientiColpiti() {
		return clientiColpiti;
	}

	public void setClientiColpiti(int clientiColpiti) {
		this.clientiColpiti = clientiColpiti;
	}

	public LocalDateTime getInizio() {
		return inizio;
	}

	public void setInizio(LocalDateTime inizio) {
		this.inizio = inizio;
	}

	public LocalDateTime getFine() {
		return fine;
	}

	public void setFine(LocalDateTime fine) {
		this.fine = fine;
	}
	
	
	
}
