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
}
