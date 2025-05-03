package com;

import com.clases.ComputadoraPortatil;
import com.clases.ProductoElectrodomestico;
import com.clases.Televisor;
import com.clases.TiendaElectronica;

public class Aplicacion {

	public static void main(String[] args) {
	
	TiendaElectronica listaTienda = new TiendaElectronica(); 
		
	ProductoElectrodomestico licuadora = new ProductoElectrodomestico("licuadora", 40.27, 5);
	ProductoElectrodomestico batidora = new ProductoElectrodomestico("batidora", 35.15, 10);
	ProductoElectrodomestico tostadora = new ProductoElectrodomestico("tostadora", 23.99);
	ProductoElectrodomestico microondas = new ProductoElectrodomestico("microondas", 98.99);
	listaTienda.agregarProducto(licuadora);
	listaTienda.agregarProducto(batidora);
	listaTienda.agregarProducto(tostadora);
	listaTienda.agregarProducto(microondas);
	
	
	Televisor tvLG = new Televisor ("TV LG", 450.98, 5, 40, "fullHD");
	Televisor tvSamsung = new Televisor ("TV Samsung", 650.98, 3, 60, "4K");
	Televisor tvTLC = new Televisor ("TV TLC", 550.98, 10, 60, "fullHD");
	listaTienda.agregarProducto(tvLG);
	listaTienda.agregarProducto(tvSamsung);
	listaTienda.agregarProducto(tvTLC);
	
	ComputadoraPortatil hpEnvy = new ComputadoraPortatil("HP Envy", 650.98, 4, "HP", 16, 154525812);
	ComputadoraPortatil iMac = new ComputadoraPortatil("iMac", 1200, 6, "HP", 16, 154478512);
	ComputadoraPortatil thinkPAD = new ComputadoraPortatil("ThinkPAD", 948.99, 10, "HP", 32, 1547784812);
	listaTienda.agregarProducto(hpEnvy);
	listaTienda.agregarProducto(iMac);
	listaTienda.agregarProducto(thinkPAD);
	
	System.out.print("---------------Inventario INICIAL----------------");
	listaTienda.mostrarProductos();

	//------------- OPERACIONES DEL DÍA ---------------------
	listaTienda.venta(licuadora);
	listaTienda.venta(tostadora);
	listaTienda.venta(iMac);
	listaTienda.venta(tvSamsung);
	listaTienda.venta(tvTLC);
	listaTienda.venta(thinkPAD);
	
	System.out.print("------------Inventario ACTUALIZADO--------------");
	listaTienda.mostrarProductos();
	

	}
}
