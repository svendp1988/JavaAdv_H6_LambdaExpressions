package be.pxl.ja.oefening2;

import java.util.List;
import java.util.function.Predicate;

public class GameBrowser {

	private GameCollection gameCollection;


	public GameBrowser(GameCollection gameCollection) {
		this.gameCollection = gameCollection;
	}

	public List<VideoGame> showFreeGames() {
		return gameCollection.selectGames(game -> game.getPrice() == 0);
	}

	public List<VideoGame> showGamesInGenre(String action) {
		return gameCollection.selectGames(game -> game.getGenres().contains(action));
	}

	public List<VideoGame> showGamesForSearch(String cd) {
		return gameCollection.selectGames(new Predicate<VideoGame>() {
			@Override
			public boolean test(VideoGame n) {
				return GameBrowser.this.containsIgnoreCase(n.getName(), cd);
			}
		});
	}

	private boolean containsIgnoreCase(String name, String cd) {
		return name.toLowerCase().contains(cd.toLowerCase());
	}
}
