package com.clases;

public class ProductoElectrodomestico {

	//----------------- ATRIBUTOS ---------------------
	private String nombre;
	private double precio;
	private int cantidad;
	//public TiendaElectronica listaDeProductos;

//------------------- CONSTRUCTORES -------------------
public ProductoElectrodomestico(String nombre, double precio, int cantidad) {
	this.nombre = nombre;
	this.precio = precio;
	this.cantidad = cantidad;
}

public ProductoElectrodomestico(String nombre, double precio) {
	this.nombre = nombre;
	this.precio = precio;
	this.cantidad = 0;
}

//----------------------- MÉTODOS ---------------------
public void mostrarInformacion() {
	System.out.println(this.getNombre());
	System.out.println(this.getPrecio());
	System.out.println(this.getCantidad());
}

//----------------- GETTERS Y SETTERS -----------------
public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public double getPrecio() {
	return precio;
}

public void setPrecio(double precio) {
	this.precio = precio;
}

public int getCantidad() {
	return cantidad;
}

public void setCantidad(int cantidad) {
	this.cantidad = cantidad;
}
	
	
}
