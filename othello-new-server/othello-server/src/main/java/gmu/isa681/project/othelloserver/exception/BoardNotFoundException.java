package gmu.isa681.project.othelloserver.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class BoardNotFoundException extends RuntimeException {

	public BoardNotFoundException(String boardId) {
		super("The board with id: " + boardId + " was not found");
	}

}
