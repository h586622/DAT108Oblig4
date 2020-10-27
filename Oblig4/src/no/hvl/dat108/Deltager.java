package no.hvl.dat108;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(schema = "oblig4")

public class Deltager {
	


	private String fornavn;
	private String etternavn;
	@Id
	private int telefonnummer;
	private Kjonn kjonn;
	private Passord passord;
	
	
	public Deltager(String fornavn, String etternavn, int telefonnummer, String kjonn, Passord passord ) {
		this.fornavn = fornavn;
		this.etternavn = etternavn;
		this.telefonnummer = telefonnummer;
		kjonn = kjonn.toUpperCase();
		this.kjonn = Kjonn.valueOf(kjonn);
		this.passord = passord;
	}
	
	public Passord getPassord() {
		return passord;
	}
}
