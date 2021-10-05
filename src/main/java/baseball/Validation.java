package baseball;

import baseball.exception.InputException;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Validation {

    private static final String DIGIT_MESSAGE = "3자리의 숫자를 입력해주세요.";
    private static final String NUMBER_RANGE_MESSAGE = "1 ~ 9 범위의 숫자를 입력해주세요.";
    private static final String DUPLICATE_MESSAGE = "각 자리마다 서로 다른 숫자를 입력하세요.";

    private static final int SIZE = 3;

    public static Boolean validationInput(String userNum) {
        try {
            validateDigit(userNum);
            validateNumberRange(userNum);
            validateDuplicate(userNum);
        } catch (InputException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    private static void validateDigit(String input) {
        if (input.length() != SIZE) {
            throw new InputException(DIGIT_MESSAGE);
        }
    }

    private static void
    validateNumberRange(String input) {
        if (!input.matches("^[1-9]*$")) {
            throw new InputException(NUMBER_RANGE_MESSAGE);
        }
    }

    private static void validateDuplicate(String input) {
        Set<String> inputSet = new HashSet<>(Arrays.asList(input.split("")));
        if (inputSet.size() != SIZE) {
            throw new InputException(DUPLICATE_MESSAGE);
        }
    }
}
