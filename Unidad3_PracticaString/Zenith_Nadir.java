package Ejercicios;

public class Zenith_Nadir
{
    public String invertirCad1(String cad){
        String resp = "";
        for  (int pos = 0; pos<cad.length();pos++){
            char act = cad.charAt(pos);
            resp = act + resp;//no es conmutativa
        }
        return resp;
    }
    //invertir el recorrido de la cadena 
    public String invertirCad2(String cad){
        String resp = "";
        for  (int pos = cad.length()-1; pos>=0;pos--){
            char act = cad.charAt(pos);
            resp = resp + act;//no es conmutativa
        }
        return resp;
    }
    
    //libreria
    public String invertirCad3(String cad){
        StringBuilder resp = new StringBuilder(cad); // es una clase mas poderosa de unString normal
        resp = resp.reverse();
        return resp.toString();
    }
}
