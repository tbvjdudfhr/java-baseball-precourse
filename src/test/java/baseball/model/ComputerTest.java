package baseball.model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

class ComputerTest {
    private Set<Integer> numbers;
    Computer computer = new Computer();

    @BeforeEach
    void setUp() {
        numbers = computer.getNumberSet();
    }

    @Test
    void numberDigitsTest() {
        Assertions.assertThat(numbers.size()).isEqualTo(3);
    }
}
