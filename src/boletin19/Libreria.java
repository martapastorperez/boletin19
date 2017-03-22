package boletin19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import javax.swing.JOptionPane;
import libreriamarta.PedirDatos;
import static libreriamarta.PedirDatos.pedirInt;
import static libreriamarta.PedirDatos.pedirString;
import static libreriamarta.PedirDatos.pedirFloat;

public class Libreria {

    private ArrayList<Libro> libreria = new ArrayList< Libro>();
    Libro lib = new Libro();

    public void engadirLibro() {
        libreria.add(new Libro(pedirString(), pedirString(), pedirString(), (int) pedirFloat(), pedirInt()));

    }

    public void Vender() {
        //Libro lib = new Libro(pedirString(), pedirString(), pedirString(), (int) pedirFloat(), pedirInt());
        String vender = JOptionPane.showInputDialog("Introduce: ");
        libreria.equals(lib);
        for (int i = 0; i < libreria.size(); i++) {
            if (libreria.get(i).getISBN().equals(vender)) {
                libreria.get(i).setUnidades(libreria.get(i).getUnidades() - 1);
            }
        }

    }

    public void visualizarYordenar() {
        Collections.sort(libreria);
        Iterator<Libro> it = libreria.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());

        }

    }
   public void darDeBaixa(){
       for(int i=0;i<libreria.size();i++)
    if(libreria.get(i).unidades==0)
         libreria.remove(i);
    
}
public void buscar(){    
 boolean atopado = false;
        String atopa = JOptionPane.showInputDialog("Introduce el titulo del libro que buscas: ");
        for(int i=0;i<libreria.size();i++){
            if(atopa.equals(libreria.get(i).titulo)){
                atopado = true;
                System.out.println("O libro de titulo está ");
            }else{
            
            System.out.println(" non está ");
        }
}
}
}