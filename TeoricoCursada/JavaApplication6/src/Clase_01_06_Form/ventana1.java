package Clase_01_06_Form;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ventana1 {

    public static void main(String[] args) {

        //1 En C# MessageBox.Show
        //1 JOptionPane.showMessageDialog(null,"hola","titulo",JOptionPane.ERROR_MESSAGE);
        //2String[] opciones = {"Opcion1", "Opcion2", "Opcion3"};
        //2JOptionPane.showOptionDialog(null, "hola", "titulo", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, "");
        //3String nombre = JOptionPane.showInputDialog("Ingrese su nombre");
        /*JFrame ventana = new JFrame("Mi primera ventana");
        ventana.setSize(500,500);
        
        JButton boton1 = new JButton("aceptar");
        ventana.add(boton1);
        
        ventana.setVisible(true);*/
        
        Ventana2 v = new Ventana2();
        v.setVisible(true);
        
    }

}
