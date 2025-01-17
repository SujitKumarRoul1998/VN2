package com.vn2.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class VehicleService {

	private Speaker speaker;
	private Tyres tyres;
	
	public VehicleService() {
		super();
	}

	@Autowired
	public VehicleService(@Qualifier("sony") Speaker speaker,@Qualifier("bridgestone") Tyres tyres) {
		super();
		this.speaker = speaker;
		this.tyres = tyres;
	}

	public Speaker getSpeaker() {
		return speaker;
	}

	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}

	public Tyres getTyres() {
		return tyres;
	}

	public void setTyres(Tyres tyres) {
		this.tyres = tyres;
	}

	public void playMusic() {
		speaker.makeSound();
	}
	
	public void moveVehicle() {
		tyres.rotate();
	}

	@Override
	public String toString() {
		return "VehicleService [speaker=" + speaker + ", tyres=" + tyres + "]";
	}
}
