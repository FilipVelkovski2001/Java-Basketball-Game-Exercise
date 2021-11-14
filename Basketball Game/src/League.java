
public class League {

	public static void main(String[] args) {
		Teams teamGs = new Teams();
		teamGs.team = "Golden State Warriors";
		
		Teams teamLa = new Teams();
		teamLa.team = "Los Angeles Lakers";
		
		System.out.println("Welcome to the game 7 between the " + teamGs.team + " and " + teamLa.team +"!" );
		
		Players thePlayers1 = new Players();
		thePlayers1.playerNames = new String[5];
		thePlayers1.playerNames[0] = "Lebron James";
		thePlayers1.playerNames[1] = "Anthony Davis";
		thePlayers1.playerNames[2] = "Russell Westbrook";
		thePlayers1.playerNames[3] = "Dwight Howard";
		thePlayers1.playerNames[4] = "Rajon Rondo";
		
		System.out.println(" ");
		
		System.out.println("These are the Lakers' starting five: ");
		 
		for(String LaPlayers : thePlayers1.playerNames) {
			 System.out.println(LaPlayers);			 
		 }
		
		System.out.println(" ");
		
		Players thePlayers2 = new Players();
		thePlayers2.playerNames = new String[5];
		thePlayers2.playerNames[0] = "Stephen Curry";
		thePlayers2.playerNames[1] = "Klay Thompson";
		thePlayers2.playerNames[2] = "Andrew Wiggins";
		thePlayers2.playerNames[3] = "Draymond Green";
		thePlayers2.playerNames[4] = "Andrew Bogut";
		
		System.out.println("These are the Warriors' starting five: ");
		 
		for(String GsPlayers : thePlayers2.playerNames) {
			 System.out.println(GsPlayers);
		 }
		
		System.out.println(" ");
		
	    Game gameScoreLa1 = new Game();
	    
	    gameScoreLa1.one = 4;
	    gameScoreLa1.two = 10;
	    gameScoreLa1.three = 15;
	    gameScoreLa1.andOne = 6;
	    gameScoreLa1.andOneThree = 4;
	    gameScoreLa1.gameScore = (gameScoreLa1.one + gameScoreLa1.two + gameScoreLa1.three + gameScoreLa1.andOne + gameScoreLa1.andOneThree);
	    
       Game gameScoreGs1 = new Game();
	    
	    gameScoreGs1.one = 60;
	    gameScoreGs1.two = 8;
	    gameScoreGs1.three = 12;
	    gameScoreGs1.andOne = 2;
	    gameScoreGs1.andOneThree = 8;
	    gameScoreGs1.gameScore = (gameScoreGs1.one + gameScoreGs1.two + gameScoreGs1.three + gameScoreGs1.andOne + gameScoreGs1.andOneThree);
	    
	    System.out.println("The current score to end the first quarter for the " + teamGs.team +" vs "+ teamLa.team +" Game 7 is: "+ gameScoreGs1.gameScore + " - " + gameScoreLa1.gameScore);
	    
	    System.out.println("");
	    
	    if(gameScoreGs1.gameScore > gameScoreLa1.gameScore) {
	    	System.out.println( teamGs.team + " have the lead at the end of 1Q");
	    }
	    else {
	    	System.out.println(teamLa.team + "  have the lead at the end of 1Q!");
	    }
	    
	    System.out.println(" ");
	    
Game gameScoreLa2 = new Game();
	    
	    gameScoreLa2.one = 4;
	    gameScoreLa2.two = 10;
	    gameScoreLa2.three = 15;
	    gameScoreLa2.andOne = 6;
	    gameScoreLa2.andOneThree = 4;
	    gameScoreLa2.gameScore = (gameScoreLa2.one + gameScoreLa2.two + gameScoreLa2.three + gameScoreLa2.andOne + gameScoreLa2.andOneThree);
	    
       Game gameScoreGs2 = new Game();
	    
	    gameScoreGs2.one = 5;
	    gameScoreGs2.two = 8;
	    gameScoreGs2.three = 12;
	    gameScoreGs2.andOne = 2;
	    gameScoreGs1.andOneThree = 8;
	    gameScoreGs2.gameScore = (gameScoreGs2.one + gameScoreGs2.two + gameScoreGs2.three + gameScoreGs2.andOne + gameScoreGs2.andOneThree);
	    
	    System.out.println(" ");
	    
	    System.out.println("The current score at the end of the first half is - " + teamGs.team + ": "+ ((gameScoreGs1.gameScore) + (gameScoreGs2.gameScore))+ " - " + teamLa.team +":  " +((gameScoreLa1.gameScore) + (gameScoreLa2.gameScore)));
	    
	    System.out.println(" ");
	    
	    if((gameScoreLa1.gameScore + gameScoreLa2.gameScore) > (gameScoreGs1.gameScore + gameScoreGs2.gameScore)) {
	    	System.out.println(teamLa.team + " have the lead at halftime!");
	    }
	    else {
	    	System.out.println(teamGs.team + " have the lead at halftime!");
	    }
	    
	    System.out.println(" ");
	    
	    System.out.println(teamLa.team + " stats at halftime: ");
	    
	   System.out.println(" ");
	    
	    Players stats1 = new Players();
	    stats1.playersStats = new String[5];
	    stats1.playersStats[0] = thePlayers1.playerNames[0] + " 30 points!";
	    System.out.println(stats1.playersStats[0]);
	    stats1.playersStats[1] = thePlayers1.playerNames[1] + " 8 points!";
	    System.out.println(stats1.playersStats[1]);
	    stats1.playersStats[2] = thePlayers1.playerNames[2] + " 20 points!";
	    System.out.println(stats1.playersStats[2]);
	    stats1.playersStats[3] = thePlayers1.playerNames[3] + " 12 points!";
	    System.out.println(stats1.playersStats[3]);
	    stats1.playersStats[4] = thePlayers1.playerNames[4] + " 8 points!";
	    System.out.println(stats1.playersStats[4]);
	    
	    System.out.println("");
	    
	    System.out.println( teamGs.team + " stats at halftime: " );
	    
	    System.out.println("");
	    
	    Players stats2 = new Players();
	    stats2.playersStats = new String[5];
	    stats2.playersStats[0] = thePlayers2.playerNames[0] + " 24 points!";
	    System.out.println(stats2.playersStats[0]);
	    stats2.playersStats[1] = thePlayers2.playerNames[1] + " 16 points!";
	    System.out.println(stats2.playersStats[1]);
	    stats2.playersStats[2] = thePlayers2.playerNames[2] + " 10 points!";
	    System.out.println(stats2.playersStats[2]);
	    stats2.playersStats[3] = thePlayers2.playerNames[3] + " 4 points!";
	    System.out.println(stats2.playersStats[3]);
	    stats2.playersStats[4] = thePlayers2.playerNames[4] + " 1 points!";
	    System.out.println(stats2.playersStats[4]);
	    
        Game gameScoreLa3 = new Game();
	    
	    gameScoreLa3.one = 2;
	    gameScoreLa3.two = 8;
	    gameScoreLa3.three = 18;
	    gameScoreLa3.andOne = 2;
	    gameScoreLa3.andOneThree = 4;
	    gameScoreLa3.gameScore = (gameScoreLa3.one + gameScoreLa3.two + gameScoreLa3.three + gameScoreLa3.andOne + gameScoreLa3.andOneThree);
	    
       Game gameScoreGs3 = new Game();
	    
	    gameScoreGs3.one = 7;
	    gameScoreGs3.two = 10;
	    gameScoreGs3.three = 15;
	    gameScoreGs3.andOne = 4;
	    gameScoreGs3.andOneThree = 4;
	    gameScoreGs3.gameScore = (gameScoreGs3.one + gameScoreGs3.two + gameScoreGs3.three + gameScoreGs3.andOne + gameScoreGs3.andOneThree);
		
	    System.out.println(" ");
	    
	    System.out.println("The current score to end the third quarter is : " + teamLa.team + " : " + ((gameScoreLa3.gameScore) + (gameScoreLa2.gameScore) + (gameScoreLa1.gameScore))+
	    " - " + teamGs.team + " : "+ ((gameScoreGs3.gameScore) + (gameScoreGs2.gameScore) + (gameScoreGs1.gameScore)));
		
	    System.out.println(" ");
	    
	    if((gameScoreLa1.gameScore + gameScoreLa2.gameScore + gameScoreLa3.gameScore) > (gameScoreGs1.gameScore + gameScoreGs2.gameScore + gameScoreGs3.gameScore)) {
	    	System.out.println(teamLa.team + " have the lead at the end of the 3Q!");
	    }
	    else {
	    	System.out.println(teamGs.team + " have the lead at the end of the 4Q!");
	    }
       
        Game gameScoreLa4 = new Game();
	    
	    gameScoreLa4.one = 2;
	    gameScoreLa4.two = 8;
	    gameScoreLa4.three = 18;
	    gameScoreLa4.andOne = 2;
	    gameScoreLa4.andOneThree = 4;
	    gameScoreLa4.gameScore = (gameScoreLa3.one + gameScoreLa3.two + gameScoreLa3.three + gameScoreLa3.andOne + gameScoreLa3.andOneThree);
	    
       Game gameScoreGs4 = new Game();
	    
	    gameScoreGs4.one = 7;
	    gameScoreGs4.two = 10;
	    gameScoreGs4.three = 15;
	    gameScoreGs4.andOne = 4;
	    gameScoreGs4.andOneThree = 4;
	    gameScoreGs4.gameScore = (gameScoreGs3.one + gameScoreGs3.two + gameScoreGs3.three + gameScoreGs3.andOne + gameScoreGs3.andOneThree);
		
	    System.out.println(" ");
	    
	    System.out.println("The current score to end the game is : " + teamLa.team + " : " + ((gameScoreLa4.gameScore + gameScoreLa3.gameScore) + (gameScoreLa2.gameScore) + (gameScoreLa1.gameScore))+
	    " - " + teamGs.team + " : "+ ((gameScoreGs4.gameScore + gameScoreGs3.gameScore) + (gameScoreGs2.gameScore) + (gameScoreGs1.gameScore)));
		
	    System.out.println(" ");
	    
	    if((gameScoreLa1.gameScore + gameScoreLa2.gameScore + gameScoreLa3.gameScore + gameScoreLa4.gameScore) > (gameScoreGs1.gameScore + gameScoreGs2.gameScore + gameScoreGs3.gameScore + gameScoreGs4.gameScore)) {
	    	System.out.println(teamLa.team + " have won the 2022 NBA Championship!!!!");
	    }
	    else {
	    	System.out.println(teamGs.team + " have won the 2022 NBA Championship!!!!");
	    }
	    
	    System.out.println(" ");
	    
	    System.out.println("The final stats of the game are: ");
	    
	    System.out.println(" ");
	    
	    System.out.println(teamLa.team + " stats at the end of the game: ");
	    
		   System.out.println(" ");
		    
		    Players stats3 = new Players();
		    stats3.playersStats = new String[5];
		    stats3.playersStats[0] = thePlayers1.playerNames[0] + " 56 points!";
		    System.out.println(stats3.playersStats[0]);
		    stats3.playersStats[1] = thePlayers1.playerNames[1] + " 24 points!";
		    System.out.println(stats3.playersStats[1]);
		    stats3.playersStats[2] = thePlayers1.playerNames[2] + " 24 points!";
		    System.out.println(stats3.playersStats[2]);
		    stats3.playersStats[3] = thePlayers1.playerNames[3] + " 16 points!";
		    System.out.println(stats3.playersStats[3]);
		    stats3.playersStats[4] = thePlayers1.playerNames[4] + " 10 points!";
		    System.out.println(stats3.playersStats[4]);
		    
		    System.out.println("");
		    
		    System.out.println( teamGs.team + " stats at the end of the game: " );
		    
		    System.out.println("");
		    
		    Players stats4 = new Players();
		    stats4.playersStats = new String[5];
		    stats4.playersStats[0] = thePlayers2.playerNames[0] + " 54 points!";
		    System.out.println(stats4.playersStats[0]);
		    stats4.playersStats[1] = thePlayers2.playerNames[1] + " 26 points!";
		    System.out.println(stats4.playersStats[1]);
		    stats4.playersStats[2] = thePlayers2.playerNames[2] + " 17 points!";
		    System.out.println(stats4.playersStats[2]);
		    stats4.playersStats[3] = thePlayers2.playerNames[3] + " 8 points!";
		    System.out.println(stats4.playersStats[3]);
		    stats4.playersStats[4] = thePlayers2.playerNames[4] + " 5 points!";
		    System.out.println(stats4.playersStats[4]);
		    
		    System.out.println(" ");
		    
		    if((gameScoreLa1.gameScore + gameScoreLa2.gameScore + gameScoreLa3.gameScore + gameScoreLa4.gameScore) > (gameScoreGs1.gameScore + gameScoreGs2.gameScore + gameScoreGs3.gameScore + gameScoreGs4.gameScore)) {
		    	System.out.println(thePlayers1.playerNames[0] + " has won the 2022 NBA finals MVP!!!!");
		    }
		    else {
		    	System.out.println(thePlayers2.playerNames[0] + " has won the 2022 NBA finals MVP");
		    }
	    
	    
	    
	}

}
