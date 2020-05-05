package be.belfius.Games.services;

	import java.util.List;

import be.belfius.Games.domain.Borrower;
import be.belfius.Games.domain.Category;
import be.belfius.Games.domain.Game;
import be.belfius.Games.repository.BorrowerRepository;
import be.belfius.Games.repository.CategoryRepository;
import be.belfius.Games.repository.GameRepository;

public class GameService {
		
		private CategoryRepository categoryRepository = new CategoryRepository();
		private GameRepository gameRepository = new GameRepository();
		private BorrowerRepository borrowerRepository = new BorrowerRepository();
		
		public List<Category> getAllCategories() {
			return categoryRepository.getAllCats();
		}
		public Category getFirstCategory() {
			return categoryRepository.getFirstCat();		
		}
		public Game getFifthGame() {
			return gameRepository.getFifthGame();
		}
		public Borrower getFirstBorrower() {
			return borrowerRepository.getFirstBorrower();
		}
		public List<Game> sortedGames() {
			return gameRepository.allSortedGames();
		}
		public List<Game> getAllGames() {
			return gameRepository.getAllGames();
		}
		public void getGameByPartName(String inGameName) {
				gameRepository.getGameByPartName(inGameName);
		}
		
	}

	