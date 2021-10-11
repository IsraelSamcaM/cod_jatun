
public class UnicornioBot
{
    private String usuario;
    
    public UnicornioBot(String user){
        usuario = user;
    }
    
    public String saludame(){
        return "hola " + usuario + " soy tu asistente";
    }
    
    public void setUsuario(String user){
        usuario = user;
    }
}
