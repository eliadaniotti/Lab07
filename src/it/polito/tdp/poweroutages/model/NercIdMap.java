package it.polito.tdp.poweroutages.model;

import java.util.HashMap;
import java.util.Map;

public class NercIdMap {
	Map<Integer, Nerc> map ;
	
	public NercIdMap() {
		map = new HashMap<Integer,Nerc>();
	}
	
	public Nerc get(Nerc nerc) {
		Nerc old=map.get(nerc.getId());
		if(old==null) {
			map.put(nerc.getId(), nerc);
			return nerc;
		}
		return old;
	}
	
	public Nerc get(int id) {
		return map.get(id);
	}
}