package baseball.view;

import nextstep.utils.Console;

public class InputView {

    private static final String INPUT_MESSAGE = "숫자를 입력해주세요 : ";
    private static final String NEW_GAME_MESSAGE = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";

    public String inputUser(){
        System.out.print(INPUT_MESSAGE);
        return Console.readLine();
    }

    public String newGame(){
        System.out.println(NEW_GAME_MESSAGE);
        return Console.readLine();
    }
}
