package versiones;

import java.util.ArrayList;

public class Receta {
	
	private String nombre;
	private ArrayList<Ingrediente> ingredientes;
	private ArrayList<String> preparacion;
	private int personas;
	private String autor;

	public Receta(String nombre) {
		this.nombre = nombre;
	}
	
	
	public Receta(String nombre, ArrayList<Ingrediente> ingredientes, ArrayList<String> preparacion) {
		this.nombre = nombre;
		this.ingredientes = ingredientes;
		this.preparacion = preparacion;
	}


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<Ingrediente> getIngredientes() {
		return ingredientes;
	}
	public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
		this.ingredientes = ingredientes;
	}
	public ArrayList<String> getPreparacion() {
		return preparacion;
	}
	public void setPreparacion(ArrayList<String> preparacion) {
		this.preparacion = preparacion;
	}
	public void addIngrediente(Ingrediente ingrediente) {
		this.ingredientes.add(ingrediente);
	}
	public void addPreparacion(String preparacion) {
		this.preparacion.add(preparacion);
	}


	public int getPersonas() {
		return personas;
	}


	public void setPersonas(int personas) {
		this.personas = personas;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	@Override
	public String toString() {
		String cadena = "Receta:" + nombre.toUpperCase();
		cadena += "\n, Ingredientes \n";
		for(Ingrediente ing : ingredientes) {
			cadena += ing.toString() + "\n";
		}
		cadena += "\n Preparación \n";
		for (int i = 0; i<preparacion.size(); i++) {
			cadena += "Paso " + i + ": " + preparacion.get(i) + "\n";
			
		}
		return cadena;
	}

}
