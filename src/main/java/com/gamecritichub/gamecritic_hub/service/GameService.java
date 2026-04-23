package com.gamecritichub.gamecritic_hub.service;

import com.gamecritichub.gamecritic_hub.domain.Game;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GameService {

    public List<Game> getAllGames() {
        List<Game> games = new ArrayList<>();

        games.add(new Game(1L, "Elden Ring", "RPG", 4.8));
        games.add(new Game(2L, "God of War", "Action", 4.7));
        games.add(new Game(3L, "Cyberpunk 2077", "RPG", 4.2));
        games.add(new Game(4L, "The Witcher 3", "RPG", 4.9));
        games.add(new Game(5L, "Hades", "Roguelike", 5.0));

        return games;
    }
}