package it.polito.tdp.poweroutages.model;

import java.util.LinkedList;
import java.util.List;

import it.polito.tdp.poweroutages.db.PowerOutageDAO;

public class Model {

	PowerOutageDAO podao;
	List<PowerOutages> powerOutages;
	List<PowerOutages> best;
	
	public Model() {
		podao = new PowerOutageDAO();
		powerOutages = new LinkedList<PowerOutages>(podao.getAllPowerOutages());
		best=null;
	}
	
	public List<Nerc> getNercList() {
		return podao.getNercList();
	}
	
	public List<PowerOutages> getSoluzione(int anni, int ore){
		List<PowerOutages> parziale = new LinkedList<PowerOutages>();
		calcola(parziale,0);
		return parziale;
	}
	
	public void calcola(List<PowerOutages> parziale, int level) {
		if(level==powerOutages.size()) {
			if(best==null || this.getClientiColpiti(parziale) > this.getClientiColpiti(best))
				best = new LinkedList<PowerOutages>(parziale);
			return;
		}
		
		for(int i=0; i<2; i++) {
			if(i==0) {
				parziale.add(powerOutages.get(level));
				calcola(parziale,level+1);
				parziale.remove(parziale.size()-1);
			}
			else
				calcola(parziale,level+1);
		}
	}
	
	public int getClientiColpiti(List<PowerOutages> lista) {
		int clienti=0;
		for(PowerOutages p : lista)
			clienti += p.getClientiColpiti();
		return clienti;
	}

}
