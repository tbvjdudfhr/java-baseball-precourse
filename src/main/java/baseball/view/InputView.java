package baseball.view;

import nextstep.utils.Console;

public class InputView {

	private static final String INPUT_MESSAGE = "숫자를 입력해주세요 : ";

	public String inputUser() {
		System.out.print(INPUT_MESSAGE);
		return Console.readLine();
	}
}
