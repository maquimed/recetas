package versiones;

import java.util.ArrayList;

public class Receta {

	private String nombre;
	private ArrayList<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
	private ArrayList<String> preparacion = new ArrayList<String>();
	private int personas = 4;
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
		String cadena = "Receta: " + nombre.toUpperCase();
		cadena += "\n\nIngredientes  para " + personas + "\n";
		if (ingredientes != null) {
			for (Ingrediente ing : ingredientes) {
				cadena += ing.toString() + "\n";
			}
		} else {
			cadena += "Esta receta todavía no tiene ingredientes.";
		}
		cadena += "\nPreparación \n";
		if (preparacion != null) {
			for (int i = 0; i < preparacion.size(); i++) {
				int cont = i+1;
				cadena += "Paso " + cont + ": " + preparacion.get(i) + "\n";

			}
		} else {
			cadena += "Esta receta todavía no tiene preparación";
		}
		return cadena;
	}

	public static void main(String[] args) {
		Receta r = new Receta("tortilla");
		r.addIngrediente(new Ingrediente(4, "unidades", "huevos"));
		r.addIngrediente(new Ingrediente(0.5f, "kg", "patatas"));
		r.addPreparacion("Pelar las patatas y cortarlas en rodajas finas");
		r.addPreparacion("Freir las patatas");
		r.addPreparacion("Batir los huevos");
		r.addPreparacion("Incorporar los huevos a las patatas ya fritas");
		r.addPreparacion("Dar la vuelta a la tortilla");
		System.out.println(r);
	}
}
