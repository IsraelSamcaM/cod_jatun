
public class MusicBox
{
    private String music1, music2, music3;
    private boolean enPausa;
    private int musicActual;//1->music1 2->music2 3->music3
    public MusicBox(String music1,String music3,String music2){
        this.music1 = music1;
        this.music2 = music2;
        this.music3 = music3;
        musicActual = 0;
        enPausa = true;
    }
    
    public String play(){
        String resp = "";
        if(enPausa==true){
            enPausa = false;
            resp = "La cancion esta haciendo reproducida";
        }else{
            resp = "Ya esta sonando una canción";
        }
        return resp;
    }
    
    public String pause(){
        String resp = "";
        if(enPausa==false){
            enPausa = true;
            resp = "La cancion esta siendo pausada";
        }else{
            resp = "ya estaba pausada la cancion";
        }
        return resp;
    }
    
    public void newTrack(){
        musicActual++;
        enPausa = false;
        if(musicActual >3){
            musicActual = 1;
        }
    }
    
    public String consulCancionActual(){
        String resp = "";
        if(musicActual == 1){
            resp = music1;
        }else if(musicActual ==2){
            resp = music1;
        }else if(musicActual ==3){
            resp = music3;
        }
        return "la cancion que esta en reproduccion es: "+resp;
    }
    
}
