package vehiculos;

import java.util.ArrayList;

public class Fabricante {
	
	private String nombre;
	private Pais pais;
	protected int vehiculos;
	protected static ArrayList<Fabricante> fabricantes = new ArrayList<>();
	
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Pais getPais() {
		return pais;
	}
	
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	public static Fabricante fabricaMayorVentas() {
		Fabricante mayor = null;
		for(int i = 0; i < Fabricante.fabricantes.size(); i++) {
			if (mayor == null) {
				mayor = Fabricante.fabricantes.get(i);
			}else if (mayor.vehiculos < Fabricante.fabricantes.get(i).vehiculos){
				mayor = Fabricante.fabricantes.get(i);
			}
		}
		return mayor;
	}
}
