package Test;
import modelo.*;
import javax.swing.JOptionPane;

public class Test 
{
    public static void main(String[] args)
    {
        
        String nomLibro = JOptionPane.showInputDialog("Digite el Nombre del libro: ");
        String nomAutor = JOptionPane.showInputDialog("Digite el Nombre del autor: ");
        int añoEdicion =Integer.parseInt(JOptionPane.showInputDialog("Digite el año de salida del Libro: "));
        String coleccion = JOptionPane.showInputDialog("El libro: "+nomLibro+" Pertenece a una Colección");
        String lujo = JOptionPane.showInputDialog("El libro: "+ nomLibro +" es Edicion de lujo: ");
        
        if(coleccion.equals("si"))
        {
            String nomColeccion = JOptionPane.showInputDialog("Digite el nombre de la Colección: ");
            int numColeccion = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero que ocupa en la Coleccion: "));
            ColeccionLibro miCaracteristicasLibro = new ColeccionLibro(nomLibro,nomAutor,añoEdicion,lujo,coleccion,nomColeccion,numColeccion);
            miCaracteristicasLibro.organizarInformacion1();
            JOptionPane.showMessageDialog(null,("La informacion del libro es\n"+miCaracteristicasLibro.mostrarInformación()));
        }
        if(coleccion.equals("no"))
        {
            ColeccionLibro miColeccionLibro = new ColeccionLibro(nomLibro,nomAutor,añoEdicion,lujo,coleccion);
            miColeccionLibro.organizarInformacion2();
            JOptionPane.showMessageDialog(null,("La informacion del libro es\n"+miColeccionLibro.mostrarInformación()));
        }
        
        
    }
}