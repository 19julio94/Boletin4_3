
package boletin.pkg4_3;

/**
 *
 * @author JULIO
 */
public class CalcDiaMes {
     private int numMes;
    public CalcDiaMes(int numM){
    this.numMes=numM;
    }
    public String mostrarDias(){
        String mes="";
        switch(this.numMes){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: mes="tiene 31 dias";
              break;
            case 2: mes="tiene 28 dias";   
              break;
            case 4:
            case 6:
            case 9:
            case 11:mes="tiene 30 dias";
                break;
        }
        return mes;
    }
}
