
  public class MachReco{
    private String nombre;
    private boolean estaOn;
    private int savia;
    private int refleLag;
    
    public MachReco(){
        nombre= "SylvanoCornio";
        estaOn = false;
        savia = 0;
        refleLag = 0;
    }
    
    public String aniadirSavia (int newSavia){
        String resp = "";
        if(savia < 91){
            savia = newSavia;
            resp= "savia añadida existosamente";
        }else{
            resp = "usted no tiene espacio para añadir savia";
        }
        return resp;
    }
    
    public String crearLagrimaReflec(){
        String resp = "";
        if(savia>50){
            if(refleLag<21){
                savia = savia-50;
                refleLag++;
                resp = "se creo con exito una lagrima Reflectantes";
            }else{
                resp = "usted no tienes espacio para guardar Lagrimas Reflectantes";
            }
        }else{
            resp = "usted no tiene suficiente para crear Lagrimas Reflectantes";
        }
        return resp;
    }
    
    public String encender (){
        String resp = "";
        if(estaOn == false){
            estaOn  = true;
            resp = "la maquina se encendio exitosamente";
        }else{
            resp = "la maquina ya estaba encendida";
        }
        return resp;
    }
    
    public String apagarr (){
        String resp = "";
        if(estaOn == true){
            estaOn  = false;
            resp = "la maquina se apago exitosamente";
        }else{
            resp = "la maquina ya estaba apagada";
        }
        return resp;
    }
    
    
    
    
    
}