package entidades;



import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import entidades.Exportable;

public class Socio implements Exportable<Socio>{



private int id;
private String nombre;
private LocalDate fechanac;
private LocalDate fechaalta;



private Categoria categoria;
private Mascota[] mascotas;



public Socio() {



}



public Socio(int id, String nombre, LocalDate fechanac, LocalDate fechaalta, Categoria categoria,
Mascota[] mascota) {
super();
this.id = id;
this.nombre = nombre;
this.fechanac = fechanac;
this.fechaalta = fechaalta;
this.categoria = categoria;
this.mascotas = mascota;
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



public LocalDate getFechanac() {
return fechanac;
}



public void setFechanac(LocalDate fechanac) {
this.fechanac = fechanac;
}



public LocalDate getFechaalta() {
return fechaalta;
}



public void setFechaalta(LocalDate fechaalta) {
this.fechaalta = fechaalta;
}



public Categoria getCategoria() {
return categoria;
}



public void setCategoria(Categoria categoria) {
this.categoria = categoria;
}



public Mascota[] getMascota() {
return mascotas;
}



public void setMascota(Mascota[] mascota) {
this.mascotas = mascota;
}



public String data() {
String ret = "";
ret += this.getId() + "|" + this.getNombre() + "|"
+ this.getFechanac().format(DateTimeFormatter.ofPattern("dd/MM/YYYY")) + "|"
+ this.getFechaalta().format(DateTimeFormatter.ofPattern("dd/MM/YYYY")) + "|"
+ this.getCategoria().getId();
return ret;
}

public void mostrarCompleto() {
String cad = "";
cad += "Id de socio: "+ this.getId() + "\n";
cad += "Nombre de socio: "+ this.getNombre() +"\n";
cad += "Fecha nacimiento de socio: " + this.getFechanac() + "\n";
cad += "Fecha de alta de socio: "+ this.getFechaalta() + "\n";
cad += "Id de la categoría: "+ this.getCategoria().getId() + "\n";



if(this.mascotas!= null) {
for (Mascota m : mascotas) {
System.out.println(m.getId() + "\t" + m.getNombre() + "\t" );
}
}
else {
System.out.println("Este socio no tiene mascotas");
}
System.out.println(cad);
}




@Override
public boolean exportarBinario(Socio elemento, String path) {
// TODO Auto-generated method stub
return false;
}



@Override
public boolean exportarTexto(Socio elemento, String path) {
// TODO Auto-generated method stub
return false;
}



}