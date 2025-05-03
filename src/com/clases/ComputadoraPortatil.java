package com.clases;

public class ComputadoraPortatil extends ProductoElectrodomestico {

	private String marca;
	private int memoriaRam;
	private long numeroDeSerie;

public ComputadoraPortatil(String nombre, double precio, int cantidad, String marca , int ram , long nroSerie) {
	super(nombre, precio, cantidad);
	this.marca = marca;
	this.memoriaRam = ram;
	this.numeroDeSerie = nroSerie;
}

@Override
public void mostrarInformacion() {
	super.mostrarInformacion();
	System.out.println(this.getMarca());
	System.out.println(this.getMemoriaRam());
	System.out.println(this.getNumeroDeSerie());
}

public String getMarca() {
	return marca;
}

public void setMarca(String marca) {
	this.marca = marca;
}

public int getMemoriaRam() {
	return memoriaRam;
}

public void setMemoriaRam(int memoriaRam) {
	this.memoriaRam = memoriaRam;
}

public long getNumeroDeSerie() {
	return numeroDeSerie;
}

public void setNumeroDeSerie(long numeroDeSerie) {
	this.numeroDeSerie = numeroDeSerie;
}

}
