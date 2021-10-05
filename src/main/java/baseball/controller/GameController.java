package baseball.controller;

import baseball.Validation;
import baseball.model.Computer;
import baseball.view.InputView;

public class GameController {
	private Computer computer;
	private InputView inputView = new InputView();
	private Validation validation = new Validation();

	public void start() {
		while (true) {
			computer = new Computer();
			computer.generateRandomNumbers();
			playGame();
		}
	}

	private void playGame() {
		validation.validationInput(inputView.inputUser());
	}
}
