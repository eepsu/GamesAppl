package be.belfius.Games.repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Collections;

import be.belfius.Games.domain.Category;
import be.belfius.Games.domain.Game;

public class GameRepository {
	
	private List<Game> games = new ArrayList<>();
	
	public GameRepository() {	
		games.add(new Game(1,"Getting started with waste","De Helix",null,2005,"from 13y",4,20,2,"46 min to 2h",2,7.50,"aandeslagmetafval.jpg"));
		games.add(new Game(2,"Abracadabra","DaVinci Games","Di Giorgio Domenico en Barletta Roberta",2004,"from 9 to 12y",4,6,1,"16 min to 45 min",3,10.00,"abracadabra.jpg"));
		games.add(new Game(5,"The Hobbit","Iron Crown Enterprises","Jean Vanaise",1994,"van 13y",2,4,1,"46 min to 2 h",3,40.00,"thehobbit.jpg"));
		games.add(new Game(4,"Maan roos vis letter-schrijfspel","Zwijsen","van den Waarsenburg Richard",2003,"from 5 to 8 y",2,6,3,"16 min to 45 min",4,12.00,"maan.jpg"));
	}
	public Game getFifthGame() {
		int fifth = 5;
		Game foundGame = null;
		for (Game fifthGame : games) {
			if (fifthGame.getGameId() == fifth){
				foundGame = fifthGame;
				break;
			}
		}
		return foundGame;
		
	}
	public List<Game>allSortedGames(){
		sortGamesByName();
		return games;
	}
	public void sortGamesByName() {
		Collections.sort(games);
	}
	
	public void getGameByPartName(String inGameName) {	
		Game foundGameByName = null;
		boolean isFound = false;
		String inUpperName = inGameName.toUpperCase();
		for (Game gameByName : games) {
			String gameUpperName = gameByName.getGameName().toUpperCase();
			if (gameUpperName.contains(inUpperName)) {
				foundGameByName = gameByName;
				isFound = true;
				System.out.println(foundGameByName.getGameName()+ "\t"+foundGameByName.getGameEditor()+"\t"+foundGameByName.getGameAge()+"\t"+foundGameByName.getPrice()						);
				break;
			}
		}
		if (isFound == false){
			System.out.println("Game not found");
		}
	}
	public List<Game>getAllGames(){
		return games;
	}
	
}
