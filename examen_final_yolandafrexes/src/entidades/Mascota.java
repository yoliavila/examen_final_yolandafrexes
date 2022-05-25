package entidades;

import java.io.IOException;
import java.time.LocalDate;

public abstract class Mascota {

	
	protected int id;
	protected LocalDate fechanac;
	protected String nombre;
	protected boolean adoptada = false;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDate getFechanac() {
		return fechanac;
	}
	public void setFechanac(LocalDate fechanac) {
		this.fechanac = fechanac;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean isAdoptada() {
		return adoptada;
	}
	public void setAdoptada(boolean adoptada) {
		this.adoptada = adoptada;
	}
	
//3. Se quiere identificar en todo momento del programa cuáles son los identificadores
//de las mascotas registradas más vieja y más joven. Añadir a la clase Mascota un array de 2
//posiciones donde la 1ª posición corresponderá al idMascota más longevo y la 2ª posición el de la
//que sea más joven. 
	
	

}

