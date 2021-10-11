


    public  class  FulgorEstrellas{
    
        public  String estrellasOff ( int [] arr , int  inicio , int  fin ) {
        String resp =  "" ;
        
        if (inicio <= fin && inicio >= 0  && inicio < arr.length && fin >= 0  && fin < arr.length  ) {
            int contador =  0 ;
            
            for ( int pos = inicio; pos <= fin; pos ++ ) {
                int numActual = arr [pos];
                
                if (numActual ==  0 ) {
                    contador ++ ;
                }
            }
            resp =  " Hay " + contador + " estrellas que han dejado de brillar " ;
        } else {
            resp =  " Algun dato no es valido " ;
        }
        return resp;
    }
}

