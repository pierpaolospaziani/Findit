package logic.model;

import java.util.Vector;

public class Agenda {
	
	private Vector<Reservation> vReservation;

	public Agenda(Vector<Reservation> vReservation) { // questo costruttore potrebbe non servire
		this.vReservation = vReservation;
	}
	
	public Agenda(String name) {
		// chiamata DAO per recuperare istanza su DB
	}

}
