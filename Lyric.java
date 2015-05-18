public class Lyric {
    
    Text root,last ;
    
    public Lyric() {
        
        root =null ;
        last=null;
               
    }
    public void add (Text txt) {
        
        last.next = txt ;
        last = txt ;
        
    }
    
    public void display (double time) {
        
        Text cur = root ;
        
        while (time > cur.time && cur.next !=null) {
            cur = cur.next ;
        }
        
        root = cur ;
        System.out.print(root) ;
        
    }
    
    
    
    
    
}
