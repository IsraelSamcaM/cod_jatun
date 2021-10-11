

public class Ejercicio_inmensidad
{
    public int[] ordenar(int [] array){
        for(int i=0;i < array.length-1;i++){
            for(int j=0;j<array.length-1-i;j++){
                int actual = array[j];
                int vecino = array[j+1];
                if(actual<vecino && actual %2 ==0 ||actual %2 ==0 && vecino %2 != 0){
                    array[j]= vecino;
                    array[j+1] = actual;
                }else {
                    if (actual>vecino && (actual%2 != 0 &&vecino%2 !=0)){
                       array[j]= vecino;
                       array[j+1] = actual; 
                    }
                }
            }
        }
        
        return array;
    }
}
