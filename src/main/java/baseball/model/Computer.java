package baseball.model;

import nextstep.utils.Randoms;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Computer {

	private static final int SIZE = 3;
	private static final int START_INDEX = 1;
	private static final int END_INDEX = 9;

    public List<Integer> numbers = new ArrayList<>();

    protected Set<Integer> getNumberSet() {
        Set<Integer> numberSet = new LinkedHashSet<>();
        while (numberSet.size() != SIZE) {
            numberSet.add(Randoms.pickNumberInRange(START_INDEX, END_INDEX));
        }

        return numberSet;
    }

    public void generateRandomNumbers() {
        Set<Integer> numberSet = getNumberSet();
        for (int number : numberSet) {
            numbers.add(number);
        }
    }

    public int getStrikeCount(String input) {
        int count = 0;
        String[] split = input.split("");

        for (int i = 0; i < numbers.size(); i++) {
            count += isStrike(i, Integer.parseInt(split[i]));
        }

        return count;
    }

    private int isStrike(int index, int value) {
        if (numbers.get(index) == value) {
            return 1;
        }
        return 0;
    }

    public int getBallCount(String input) {
        int count = 0;
        String[] split = input.split("");

        for (int i = 0; i < numbers.size(); i++) {
            count += isBall(i, Integer.parseInt(split[i]));
        }

        return count;
    }

    private int isBall(int index, int value) {
        if (isStrike(index, value) == 0 && numbers.contains(value)) {
            return 1;
        }
        return 0;
    }
}
