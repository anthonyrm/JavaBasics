package com.anthonyrojas;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehiculo miVehiculo = new Vehiculo();
		
		miVehiculo.setMatricula("1234567");
		
		miVehiculo.arrancar();
		miVehiculo.frenar();
		miVehiculo.reversa();
		
		System.out.println(miVehiculo.getMatricula());

	}

}
