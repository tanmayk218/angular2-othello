package gmu.isa681.project.othelloserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import gmu.isa681.project.othelloserver.entity.GameEntity;
import gmu.isa681.project.othelloserver.repository.GameRepository;

@Component
public class H2Bootstrap implements CommandLineRunner{
	
	@Autowired
	GameRepository gameRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Getting games");
		gameRepository.save(new GameEntity());
		gameRepository.save(new GameEntity());
		gameRepository.save(new GameEntity());
		
		Iterable<GameEntity> itr = gameRepository.findAll();
		System.out.println("Priting games");
		for(GameEntity game: itr) {
			System.out.println(game.getId());
		}
	}

}
