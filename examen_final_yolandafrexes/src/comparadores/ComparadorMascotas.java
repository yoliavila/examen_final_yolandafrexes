package comparadores;



import java.util.Comparator;



import entidades.Mascota;



public class ComparadorMascotas implements Comparator<Mascota>{



@Override
public int compare(Mascota o1, Mascota o2) {
int ret = 0;
ret = o1.getFechanac().compareTo(o2.getFechanac());
if (ret == 0) {
ret = o1.getNombre().compareTo(o2.getNombre());
}
return ret;
}




}