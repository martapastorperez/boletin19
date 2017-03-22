
package boletin19;

import javax.swing.JOptionPane;


public class Boletin19 {

    public static void main(String[] args) {
      Libreria libr=new Libreria();
      
      int op;
    do{
       try{
        op= Integer.parseInt(JOptionPane.showInputDialog("***MENU*** \n1. Añadir libro \n2. Vender libro \n3. Visualizar y ordenar\n4. Dar de baixa \n5. Buscar \n6. Salir")); 
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            op=0;
        }
       
        
        switch(op){
        case 1: libr.engadirLibro();
            break;
        case 2: libr.Vender();
            break;
        case 3: libr.visualizarYordenar();
            break;
        case 4: libr.darDeBaixa();
            break;
        case 5: libr.buscar();
            break;
        case 6:
            System.exit(0);
    
    }
    
    }while(op<5);
}
}
    
    

