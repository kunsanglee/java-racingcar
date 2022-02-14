package racingcar.controller;

import java.util.List;
import java.util.stream.Collectors;

import racingcar.domain.CarDto;
import racingcar.service.RacingService;
import racingcar.util.RandomUtilImpl;
import racingcar.validator.AttemptValidator;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class RacingController {

	private final RacingService racingService = new RacingService();
	private final RandomUtilImpl randomUtil = new RandomUtilImpl();

	public void start() {
		racingService.registerCars(InputView.getCars());

		int attemptNumber = inputAttemptNumber();
		OutputView.printResultMessage();
		play(attemptNumber);

		printRacingResult();
	}

	private int inputAttemptNumber() {
		String attemptNumberInput = InputView.getAttemptNumber();
		AttemptValidator.checkFromInput(attemptNumberInput);

		return Integer.parseInt(attemptNumberInput);
	}

	private void play(int attemptNumber) {
		for (int i = 0; i < attemptNumber; i++) {
			List<CarDto> carDtos = racingService.race(randomUtil);
			OutputView.printRacingInfo(carDtos);
		}
	}

	private void printRacingResult() {
		List<String> winnerNames = racingService.findWinnerCars().stream()
			.map(CarDto::getName)
			.collect(Collectors.toList());

		OutputView.printWinnersMessage(winnerNames);
	}

}
