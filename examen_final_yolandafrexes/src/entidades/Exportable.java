package entidades;
//Esto corresponde con el ejercicio 5
public interface Exportable<T> {
	
public boolean exportarBinario(T elemento, String path );

public boolean exportarTexto(T elemento, String path);


}