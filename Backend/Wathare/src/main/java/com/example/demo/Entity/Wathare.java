package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Wathare {
	@Id
	private String ts;
    private int machine_status;
    private int viberations;
	public String getTs() {
		return ts;
	}

	public void setTs(String ts) {
		this.ts = ts;
	}

	public int getMachine_status() {
		return machine_status;
	}

	public void setMachine_status(int machine_status) {
		this.machine_status = machine_status;
	}

	public int getViberations() {
		return viberations;
	}

	public void setViberations(int viberations) {
		this.viberations = viberations;
	}
    
    
    
    
    
}
