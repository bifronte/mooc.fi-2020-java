/**
 *
 * @author bifronte
 */
public class Game {
    private String homeTeam;
    private String opposingTeam;
    private int homePoints;
    private int opposingPoints;
    
    public Game(String homeTeam, String opposingTeam, int homePoints, int opposingPoints){
        this.homeTeam = homeTeam;
        this.opposingTeam = opposingTeam;
        this.homePoints = homePoints;
        this.opposingPoints = opposingPoints;
    }
    
    public String getHomeTeam(){
        return this.homeTeam;
    }
    
    public String getOpposingTeam(){
        return this.opposingTeam;
    }
    
//    public int getHomePoints(){
//        return this.homePoints;
//    }
//    
//    public int getOpposingPoints(){
//        return this.opposingPoints;
//    }
    
    public boolean isWinner(String teamName){
        if(this.homeTeam.equals(teamName) && this.homePoints > this.opposingPoints){
            return true;
        }
        if(this.opposingTeam.equals(teamName) && this.opposingPoints > this.homePoints){
            return true;
        }        
        return false;
    }
}
