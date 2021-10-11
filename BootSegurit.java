
public class BootSegurit
{
    private String nombre;
    private int clave;
    private boolean estaCerrado;
    public BootSegurit(){
        clave = 1111;
        nombre = "unicornioBaul";
        estaCerrado = true;
    }
    
    public String open(){
        String resp = "";
        if(estaCerrado == true){
            estaCerrado = false;
            resp = "la caja se abrio exitosamente";
        }else{
            resp = "la caja ya estaba abierta";
        }
        return resp;
    }
    
    public String close(){
        String resp = "";
        if(estaCerrado == false){
            estaCerrado = true;
            resp = "la caja se cerró exitosamente";
        }else{
            resp = "la caja ya estaba cerrada";
        }
        return resp;
    }
    
    public String newClave(int newPassword){
        String resp = "";
        if(estaCerrado == false){
            if(newPassword>0){
                int digitos = 0;
                while (newPassword>0){
                    newPassword = newPassword/10;
                    digitos++;
                }
                    if(digitos == 4){
                        clave = newPassword;
                        resp = "tu clave "+ clave + " fue guardado exitosamente";
                   }
              }else{
                  resp="su clave tiene que ser de 4 digitos";
            }
        
        }else{
            resp = "la caja esta cerrada usted no puede cambiar la clave";
      }
    return resp;
   }
}