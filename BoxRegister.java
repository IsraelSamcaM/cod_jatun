

public class BoxRegister
{
    private int total;
   
    public BoxRegister(){
       total = 0;
    }
   
    public String precioTotal(int cantidad, int precio){
       total = total+(precio*cantidad);
       return "el precio total fue recibido exitosamente";
    }
   
    public String getPrecioTotal(){
       return "el precio registrado es: "+total;
    }
   
    public String cobrar(int dinero){
       String resp = "";
       int din = dinero;
       if (total>din){
           resp="el dinero es insuficiente";
           return resp;
       }if (total<= din){
           int cambio;
           cambio = din - total;
           resp = "se cobro exitosamente y su cambio es:"+ cambio;
       }
       return resp;
       
    } 
   
    public void resetBoxRegister(){
       total = 0;
    }
   
}
