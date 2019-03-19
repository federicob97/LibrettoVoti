package it.polito.tdp.libretto;

import java.util.*;
import java.time.LocalDate;

public class Test_Libretto {

	public static void main(String[] args) {
		Libretto libr = new Libretto();
		
		libr.add(new Voto(30, "analisi I", LocalDate.of(2017, 1, 15)));
		libr.add(new Voto(24, "analisi I", LocalDate.of(2017, 2, 7)));
		libr.add(new Voto(21, "Diritto", LocalDate.of(2017, 2, 15)));
		libr.add(new Voto(25, "Economia", LocalDate.of(2017, 6, 15)));
		libr.add(new Voto(28, "analisi II", LocalDate.of(2017, 6, 16)));
		libr.add(new Voto(18, "Fisica II", LocalDate.of(2018, 2, 1)));
		libr.add(new Voto(25, "RO", LocalDate.of(2018, 1, 15)));
		libr.add(new Voto(23, "PO", LocalDate.of(2018, 6, 19)));
		libr.add(new Voto(27, "Statistica", LocalDate.of(2019, 7, 15)));
		libr.add(new Voto(30, "Basi dati", LocalDate.of(2019, 6, 20)));

		List<Voto> ventic = libr.cercaVoti(25);
		 System.out.println(ventic);
		 
		 Voto a1 = libr.cercaVoto("analisi I");
		 System.out.println(a1);
		 
		 Voto giusto = new Voto(21,"Diritto",LocalDate.now());
		 Voto sbagliato = new Voto(27,"Diritto",LocalDate.now());
		 Voto mancante = new Voto(30,"merendine",LocalDate.now());

		 
		 System.out.format("Il voto %s + %s\n", giusto.toString(), libr.esisteVoto(giusto));
		 System.out.format("Il voto %s + %s\n", sbagliato.toString(), libr.esisteVoto(sbagliato));
		 System.out.format("Il voto %s + %s\n", mancante.toString(), libr.esisteVoto(mancante));

	}

}
