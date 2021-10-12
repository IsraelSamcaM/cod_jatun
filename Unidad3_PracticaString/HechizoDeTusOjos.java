package Ejercicios;

public class HechizoDeTusOjos
{
    public String calDistancia(String name1, String name2){
        String resp = "";
        int suma1 = calSumatoria(name1);
        int suma2 = calSumatoria(name2);
        int resta = Math.abs(suma1-suma2); //devuelve en valor absoluto
        resp = " la distacia entre "+ name1 + " y "+ name2+ "es de: "+ resta;
        return resp;
    
    }
    
    private int calSumatoria(String cad){
        int resp = 0;
        for(int pos = 0; pos<cad.length(); pos++){
            char act = cad.charAt(pos);
            resp = resp + act;//se castea en charecter
        }
        return resp;
    }
}
