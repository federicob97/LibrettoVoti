package it.polito.tdp.libretto;

import java.time.LocalDate;
import java.util.*;

public class Libretto {

	private List<Voto> voti;
	
	public Libretto() {
		this.voti = new ArrayList<Voto>();
	}
	
	/**
	 * Aggiungere un voto al libretto
	 * @param v il {@link Voto} da aggiungere
	 */
	public void add(Voto v) {
		voti.add(v);
	}
	
	public List<Voto> cercaVoti(int voto) {
		List<Voto> temp = new ArrayList<Voto>();
		for(Voto v : voti) {
			if(v.getPunti()==voto)
				temp.add(v);
		}
		return temp;
	}
	public Voto cercaVoto(String nomeCorso) {
		Voto v = null;
		for(Voto x : voti) {
			if(x.getCorso().equals(nomeCorso))
				v=x;
		}
		
		return v;		
	}
	
	public boolean esisteVoto(Voto v) {
		Voto trovato = this.cercaVoto(v.getCorso());
		if(trovato == null)
			return false;
		if(trovato.getPunti()==v.getPunti())
			return true;
		else
			return false;
	}
}
