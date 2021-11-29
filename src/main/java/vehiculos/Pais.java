package vehiculos;
import java.util.ArrayList;

public class Pais {
	
	private String nombre;
	protected int vehiculos;
	protected static ArrayList<Pais> paises = new ArrayList<>();
	
	public Pais(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public static Pais paisMasVendedor() {
		Pais mayor = null;
		for(int i = 0; i < Pais.paises.size(); i++) {
			if (mayor == null) {
				mayor = Pais.paises.get(i);
			}else if (mayor.vehiculos < Pais.paises.get(i).vehiculos){
				mayor = Pais.paises.get(i);
			}
		}
		return mayor;
	}
}
