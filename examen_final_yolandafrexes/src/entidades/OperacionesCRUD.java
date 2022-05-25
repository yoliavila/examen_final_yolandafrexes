package entidades;
//Esto corresponde con el ejercicio 5
	import java.util.Collection;
	
	public interface OperacionesCRUD<T> {
		
	public int insertarSinID(T elemento);
	public T buscarPorID(long id);
	public Collection<T> buscarTodos();
	
	}



