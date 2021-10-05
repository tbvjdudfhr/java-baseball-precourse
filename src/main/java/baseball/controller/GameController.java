package baseball.controller;

import baseball.Validation;
import baseball.model.Computer;
import baseball.view.InputView;
import baseball.view.OutputView;

public class GameController {
	private Computer computer;
	private InputView inputView = new InputView();
	private OutputView outputView = new OutputView();
	private Validation validation = new Validation();

	private static final String NEW_GAME = "1";

	private static final int SIZE = 3;

	public void start() {
		do {
			computer = new Computer();
			computer.generateRandomNumbers();
			playGame();
		} while (reStart());
	}

	private boolean reStart() {
		return inputView.newGame().equals(NEW_GAME);
	}

	private void playGame() {
		boolean isFinish = false;

		while (!isFinish) {
			isFinish = checkValidation(inputView.inputUser());
		}

		outputView.printEndMessage();
	}

	private boolean checkValidation(String input) {
		if (validation.validationInput(input)) {
			return result(input);
		}

		return false;
	}

	private boolean result(String input) {
		outputView.printResult(computer.getStrikeCount(input), computer.getBallCount(input));

		if (computer.getStrikeCount(input) == SIZE) {
			return true;
		}

		return false;
	}
}
