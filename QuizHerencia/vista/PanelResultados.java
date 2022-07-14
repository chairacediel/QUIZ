package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;


 
public class PanelResultados extends JPanel
{
    //----------------------
    //Atributos
    //----------------------
    private JTextArea taResultado;
    private JScrollPane spResultado;

    
    //----------------------
    //Metodos
    //----------------------
    
    //Constructor
    public PanelResultados()
    {
        //Definicion del contendor del panel
        setLayout(null);
        setBackground(Color.WHITE);
        
        //Creación y adicion del area de texto
        taResultado = new JTextArea();
        spResultado = new JScrollPane(taResultado);
        spResultado.setBounds(10,20, 440, 50);
        add(spResultado);
       
        
        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Resultado");
        borde.setTitleColor(Color.BLUE);
        setBorder(borde);
    }
    
    //Borar los resultados
    public void borrar()
    {
        taResultado.setText("");
    }
    
    //Mostrar resultado
    public void mostrarResultado(long numero, Object operador ,double costoplan )
    {
        taResultado.setText("el numero es:"+numero+"\nOperador: "+operador+"\nel saldo a pagar: "+costoplan);
    }
}
