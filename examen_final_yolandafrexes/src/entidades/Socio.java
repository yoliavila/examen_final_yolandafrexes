package entidades;



import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
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

public String mostrarCompleto() {
String com = "";
com += "Id de socio: " + this.getId() + "\n";
com += "Nombre de socio: " + this.getNombre() + "\n";
com += "Fecha nacimiento de socio: " + this.getFechanac() + "\n";
com += "Fecha de alta de socio: " + this.getFechaalta() + "\n";
com += "Id de la categoría: " + this.getCategoria().getId() + "\n";



if (this.mascotas != null) {
for (Mascota m : mascotas) {
System.out.println(m.getId() + "\t" + m.getNombre() + "\t");
}
} else {
System.out.println("Este socio no tiene mascotas");
}
return com;
}



@Override
public boolean exportarBinario(Socio s, String path) {
path = "operario.dat";
try {
File fichero = new File(path);
FileOutputStream fos = new FileOutputStream(path, false);
ObjectOutputStream escritor = new ObjectOutputStream(fos);
escritor.writeObject(s.data());
escritor.flush();
escritor.close();
} catch (FileNotFoundException e) {
System.out.println("Se ha producido una FileNotFoundException" + e.getMessage());
return false;
} catch (IOException e) {
System.out.println("Se ha producido una IOException" + e.getMessage());
return false;



} catch (Exception e) {
System.out.println("Se ha producido una Exception" + e.getMessage());
return false;



}
return true;



}


@Override
public boolean exportarTexto(Socio s, String path) {
path = "Socio.txt";
File fichero = new File(path);
FileWriter escritor = null;
PrintWriter buffer = null;
try {
try {
escritor = new FileWriter(fichero, false);
buffer = new PrintWriter(escritor);
buffer.println(s.mostrarCompleto());



} finally {
if (buffer != null) {
buffer.close();
}
if (escritor != null) {
escritor.close();
}
}



} catch (FileNotFoundException ex) {
System.out.println("Se ha producido una FileNotFoundException" + ex.getMessage());
return false;
} catch (IOException ex) {
System.out.println("Se ha producido una IOException" + ex.getMessage());
return false;
} catch (Exception ex) {
System.out.println("Se ha producido una Exception" + ex.getMessage());
return false;
}
return true;
}
}


