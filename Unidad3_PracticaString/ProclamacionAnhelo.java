package Ejercicios;


public class ProclamacionAnhelo
{
    private String cad;
    public ProclamacionAnhelo(String cadena){
        cad = cadena;
    }
    
    public String contarSignos(){
        
        String resp = "";
        int contador = 0;
        String aux = cad.toLowerCase();
        
        for(int pos = 0; pos<aux.length(); pos++){
            char actual = aux.charAt(pos);
            if(esSigno(actual)){
                contador++;
            }
        }
        resp = "Existen "+ contador + " signos de puntuacion";
        return resp;
    }
    
    private boolean esSigno(char signo){
        return signo ==','||signo =='.'||signo ==';'||signo ==':'||signo =='¿'||signo =='?'||signo =='!'||signo =='¡';
    }
    
    public void cambiarCadena(String newCad){
        cad = newCad;
    }
}
