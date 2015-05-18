public class Score {
    
    int note1 ; //note de la chanson
    int note2 ; //note chanté par le joueur
    int score ;
    
    public Score(int anote1, int anote2) {
        
        note1 = anote1 ;
        note2 = anote2 ;
        
    }
    
    if( Math.abs(note1 - note2) < 30 ) {
        score = 100 ;
    } else if ( Math.abs(note1 - note2) < 40 && Math.abs(note1 - note2) > 30 ) {
        score = 80 ;
    } else if ( Math.abs(note1 - note2) < 50 && Math.abs(note1 - note2) > 40 ) {
        score = 60 ;
    } else if ( Math.abs(note1 - note2) < 60 && Math.abs(note1 - note2) > 50 ) {
        score = 30 ;
    } else if ( Math.abs(note1 - note2) < 80 && Math.abs(note1 - note2) > 60 ) {
        score = 10 ;
    } else if ( Math.abs(note1 - note2) < 100 && Math.abs(note1 - note2) > 80 ) {
        score = 5 ;
    } else if ( Math.abs(note1 - note2) > 100 ) {
        score = 0 ;
    
    
    
}
