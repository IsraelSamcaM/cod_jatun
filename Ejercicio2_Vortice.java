import java.lang.Math;

public class Ejercicio2_Vortice
{
    
    //buscar el menor y el mayor valor
    public String buscarVortice(int []arr){
        int valMayor = arr[0];
        int valMenor = arr[0];
        
        int posMenor = -1;
        int posMayor = -1;
        for(int pos = 1; pos<arr.length;pos++){
            int valorActual = arr[pos];
            if (valorActual>valMayor){
                valMayor = valorActual;
                posMayor = pos;
            } else{
                if(valorActual < valMenor){
                    valMenor = valorActual;
                    posMenor = pos;
                }
            }
        }
        
        
        int inicio = Math.min(posMayor,posMenor);
        int limite = Math.max(posMayor,posMenor);
        
        String resp = "el vortice esta conformado por los siguientes numeros";
        for(int pos = inicio ; pos<= limite ; pos++){
            int actual = arr[pos];
            resp = resp + actual +   "  ";    
        }
        return resp;
    }
    
}
