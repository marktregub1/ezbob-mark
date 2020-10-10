package org.ezboardhiring.restservice;

import org.ezboardhiring.restservice.algo.Shuffling;
import org.ezboardhiring.restservice.beans.ShuffleRequest;
import org.ezboardhiring.restservice.beans.ShuffleResponse;
import org.ezboardhiring.restservice.clients.LoggingClient;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@Validated
public class NumbersShufflingController {
	private final LoggingClient loggingClient;

	public NumbersShufflingController(LoggingClient loggingClient) {
		this.loggingClient = loggingClient;
	}

	@PostMapping("/shuffle-numbers")
	public ShuffleResponse shuffleNumbers(@Valid @RequestBody ShuffleRequest request) {
		ShuffleResponse response = new ShuffleResponse();
		response.setNumbers(Shuffling.shuffleNumbers(request.getNumber()));
		loggingClient.log(response.toString());
		return response;
	}


}
