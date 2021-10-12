package Ejercicios;

public class FragmentosDhilva
{
    public String posLexicografica(String pal1, String pal2){
        String resp = "";
        int x = comparar(pal1,pal2);
        if(x<0){
            resp = "La palabra " + pal1+" es menor lexicográficamente que " + pal2;
            
        }else if(x>0){
            resp = "La palabra " + pal1+" es mayor lexicográficamente que " + pal2;
        }else if(x == 0){
            resp = "Las palabras son lexicográficamente iguales";
        }
        
        return resp;
        
    }
    
    private int comparar(String cad1, String cad2){
        return cad1.compareTo(cad2);
        //un numero negativo ----> cad1<cad2
        //si es 0 ---> cad1 = cad2
        // un numero positivo ----> cad1>cad2
    }
}
