
package boletin.pkg4_3;

import javax.swing.JOptionPane;

/**
 *
 * @author JULIO
 */
public class Boletin4_3 {

   
    public static void main(String[] args) {
     int numM;
       numM=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero del mes"));
       CalcDiaMes calc1=new CalcDiaMes(numM);
       JOptionPane.showMessageDialog(null, calc1.mostrarDias());
    }
    
}
