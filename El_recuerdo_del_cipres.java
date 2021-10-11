


public class El_recuerdo_del_cipres
{
    
    public int[] estendsSombra(int valInicial, int horas){
        int [] arr = new int[horas];
        arr[0]=valInicial;
        int x = 1; 
        
        for(int pos = 0; pos<arr.length-1;pos++){
            
            if(arr[pos]%2 != 0){
                 
                arr[pos+1]=arr[pos]+x;
                x++;
            }else if(arr[pos]%2 == 0){
                arr[pos+1] = (arr[pos])/2;  
            }
        }
        return arr;
    }
}
