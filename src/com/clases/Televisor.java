package com.clases;

public class Televisor extends ProductoElectrodomestico{

	private double tamañoPantalla;
	private String resolucion;
	//public TiendaElectronica listaDeProductos;
	
	public Televisor(String nombre, double precio, int cantidad, double tamañoPantalla, String resolucion) {
		super(nombre, precio, cantidad);
		this.tamañoPantalla = tamañoPantalla;
		this.resolucion = resolucion;
		//listaDeProductos.agregarProducto(this);
	}
	
	//----------------------- MÉTODOS ---------------------
	public void mostrarInformacion() {
		super.mostrarInformacion();
		System.out.println(this.getTamañoPantalla());
		System.out.println(this.getResolucion());
	}

	public double getTamañoPantalla() {
		return tamañoPantalla;
	}

	public void setTamañoPantalla(double tamañoPantalla) {
		this.tamañoPantalla = tamañoPantalla;
	}

	public String getResolucion() {
		return resolucion;
	}

	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}

}
