public class Text {
    
    Text next ;
    double time ;
    String lyric ;
    
    public Text(double atime, String alyric) {
        
        time = atime ;
        lyric = alyric ;
        next = null ;
        
    }

   
    public String toString () {
        
        System.out.println(lyric);
        return lyric ;
        
    }
    
}
