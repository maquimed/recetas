package versiones;

public class Ingrediente {
	private float cantidad;
	private String unidad;
	private String nombre;
	public Ingrediente(float cantidad, String unidad, String nombre) {
		this.cantidad = cantidad;
		this.unidad = unidad;
		this.nombre = nombre;
	}
	public float getCantidad() {
		return cantidad;
	}
	public void setCantidad(float cantidad) {
		this.cantidad = cantidad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
