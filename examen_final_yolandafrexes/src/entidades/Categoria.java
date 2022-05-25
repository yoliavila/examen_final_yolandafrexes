package entidades;

//Esto corresponde con el ejercicio 1
import java.time.format.DateTimeFormatter;

public enum Categoria {
	
	NORMAL(1, "Normal", 3 ),PREMIUM(2, "Premium", 2 ),VIP(3, "V.I.P", 1);

		private int id;
		private String nombre;
		private int orden;
		
		Categoria(int id, String nombre, int orden) {
			this.id = id;
			this.nombre = nombre;
			this.orden = orden;
		}
		//Aunque no lo pida el ejercicio he añadido un contructor por defecto
		Categoria () {
		}
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public int getOrden() {
			return orden;
		}
		public void setOrden(int orden) {
			this.orden = orden;
		}
		
		public static void mostrarTodos() {
			for (Categoria c : Categoria.values()) {
			System.out.println(c.getId() + "\t" + c.getNombre() + "\t" + c.getOrden() + "\n");
			}
			
			}
	}


