package com.anthonyrojas;

public class Vehiculo {
	private String matricula;
	private String marca;
	private String modelo;
	private int anio;
	
	public void arrancar () {
		System.out.println("El vehículo arrancó");
	}
	
	public void frenar () {
		System.out.println("El vehículo frenó");
	}
	
	public void reversa () {
		System.out.println("El vehículo está de reversa");
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		if (matricula.length() == 6) {
			this.matricula = matricula;
		}
		else {
			System.out.println("La matrícula debe ser de 6 caracteres.");
		}
	}
}
