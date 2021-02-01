package be.pxl.ja.oefening2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class GameCollection {
	private List<VideoGame> videoGames = new ArrayList<>();

	public void addGame(VideoGame game) {
		videoGames.add(game);
	}

	public List<VideoGame> selectGames(Predicate<VideoGame> filter) {
		return videoGames.stream().filter(filter).collect(Collectors.toList());
	}
}
