package Ejercicios;
public class LegadoAncentros
{
    String name = "";
    public LegadoAncentros(String nombre){
        name = nombre;
    }
    
    public String esPrefijo(String prefijo){
        String aux1 = name.toLowerCase();
        String resp = "el nombre "+name+" , no comienza con "+prefijo;
        int comprobar = 0;
        
        for(int pos = 0; pos<aux1.length(); pos++){
            char act = aux1.charAt(pos);
            comprobar = comprobar + act;
            if(comprobar == calcularPrefijo(prefijo) ){
                resp = "el nombre "+name+" , si comienza con "+prefijo;
            }    
        }
        return resp;
    }
    
    private int calcularPrefijo(String cad){
        String aux = cad.toLowerCase();
        int resp = 0;
        
        for(int pos = 0; pos<aux.length(); pos++){
            char act = aux.charAt(pos);
            resp = resp + act;//se castea el charecter
        }
        return resp;
    }
    
    public void setNombre(String newName){
        name = newName;
    }
    
}
