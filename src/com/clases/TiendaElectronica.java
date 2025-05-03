package com.clases;

import java.util.ArrayList;

public class TiendaElectronica {
	private ArrayList<ProductoElectrodomestico> listaDeProductos = new ArrayList<ProductoElectrodomestico>();

//------------------ MÉTODOS -------------------
public void agregarProducto(ProductoElectrodomestico producto) {
	listaDeProductos.add(producto);
}

public void mostrarProductos() {	
	for(ProductoElectrodomestico producto: this.listaDeProductos) {
		producto.mostrarInformacion();
	}
}

public void buscarPorNombre(String nombre){
	String nombreProducto = nombre;
	for(ProductoElectrodomestico producto: this.listaDeProductos) {
		if(nombreProducto.equals(producto.getNombre())){
			producto.mostrarInformacion();
		} else {
			System.out.println("Produto inexistente");
		}
	}
}

public void venta(ProductoElectrodomestico producto) {
	if (producto.getCantidad()>0) {
		producto.setCantidad(producto.getCantidad()-1);
	}else {
		System.out.print("Producto Agotado");
	}
	
}

public ArrayList<ProductoElectrodomestico> getListaDeProductos() {
	return listaDeProductos;
}

public void setListaDeProductos(ArrayList<ProductoElectrodomestico> listaDeProductos) {
	this.listaDeProductos = listaDeProductos;
}
}
