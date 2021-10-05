package baseball.view;

public class OutputView {

    private static final String STRIKE = "%d스트라이크 ";
    private static final String BALL = "%d볼";
    private static final String NOTHING = "낫싱";
    private static final String GAME_OVER_MESSAGE = "3개의 숫자를 모두 맞히셨습니다! 게임 끝";

    public void printResult(int strikeCount, int ballCount) {
        printHits(strikeCount, ballCount);
        System.out.println();
    }

    private void printHits(int strikeCount, int ballCount) {
        if (strikeCount == 0 && ballCount == 0) {
            System.out.printf(NOTHING);
        }
        if (strikeCount > 0) {
            System.out.printf(STRIKE, strikeCount);
        }
        if (ballCount > 0) {
            System.out.printf(BALL, ballCount);
        }
    }

    public void printEndMessage() {
        System.out.println(GAME_OVER_MESSAGE);
    }
}
