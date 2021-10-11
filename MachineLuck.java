

public class MachineLuck
{
    private String nombre;
    private int premio;
    private int fichas;
    private int numeroGanador;
    
    public MachineLuck(int premio){
        nombre = "UnicornioTron";
        this.premio = premio;
        fichas = 0;
        numeroGanador = (int)(Math.random()*10+1);
    }
    
    public String intentos(int fichas){
        String resp = "usted tiene "+ fichas+ " intentos";
        this.fichas = fichas;
        return resp;
    }
    
    public int getNumGnador(){
        return numeroGanador;
    }
    
    
    public String jugar(int numero){
        String resp= "";
        fichas = fichas - 1;
        
        if (premio>0){
            if(fichas>0){
                if(numero == numeroGanador){
                    resp = "usted gano "+ premio + "Bs";
                    premio = 0;
                }else{
                resp = "siga intentandolo le quedan "+ fichas +" intentos";
            } 
        }else{
            resp = "usted no tiene fichas disponibles";
        }
            return resp;
       }else{
           resp = "no existe premio";
           return resp;
        }    
    }
    
    public void recargarPremio(int premioNew){
        premio = premioNew;
    }
    
}
