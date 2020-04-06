
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("File:");
        String fileName = reader.nextLine();     
        ArrayList<Game> games = fileReader(fileName);
        
        System.out.println("Team:");
        String teamName = reader.nextLine();
        //creating an array of the matches of said team
        ArrayList<Game> recordOfGames = new ArrayList<>();
        for(Game game: games){
            if(teamName.equals(game.getHomeTeam()) || teamName.equals(game.getOpposingTeam())){
                recordOfGames.add(game);
            }
        }
        System.out.println("Games: " + recordOfGames.size());
        
        //Counting the number of won games
        int wins = 0;
        for(Game game: recordOfGames){
            if(game.isWinner(teamName)){
                wins++;
            }
        }
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + (recordOfGames.size() - wins));
    }
    
    public static ArrayList<Game> fileReader(String file){
        ArrayList<Game> games = new ArrayList<>();        
        
        try(Scanner reader = new Scanner(Paths.get(file))){
            while(reader.hasNextLine()){                
                
                String line = reader.nextLine();
                if(line.isEmpty()){
                    continue;
                }
                
                String[] parts = line.split(",");
                String homeTeam = parts[0];
                String opposingTeam = parts[1];
                int homePoints = Integer.valueOf(parts[2]);
                int opposingPoints = Integer.valueOf(parts[3]);
                
                games.add(new Game(homeTeam, opposingTeam, homePoints, opposingPoints));
                
            }            
        }
        catch(Exception e){
            System.out.println("Reading the file failed.");
        }
        
        return games;
    }

}
