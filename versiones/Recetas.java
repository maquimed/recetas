package versiones;

import java.util.ArrayList;

public class Recetas {
	private String nombre;
	private String ingredientes;
	private ArrayList<String> preparacion;
	public Recetas(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getIngredientes() {
		return ingredientes;
	}
	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}
	public ArrayList<String> getPreparacion() {
		return preparacion;
	}
	public void setPreparacion(ArrayList<String> preparacion) {
		this.preparacion = preparacion;
	}
	
}
