package com.sebs.database;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Alien {

	@Id
	private int aid;
	private String anme;
	private String apoints;
	public String getApoints() {
		return apoints;
	}
	public void setApoints(String apoints) {
		this.apoints = apoints;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAnme() {
		return anme;
	}
	public void setAnme(String anme) {
		this.anme = anme;
	}
	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", anme=" + anme + ", apoints=" + apoints + "]";
	}
	
	
	
}
