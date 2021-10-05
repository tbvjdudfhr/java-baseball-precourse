package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class StringTest {

    @DisplayName("1,2을 ,로 split 했을 때 1과 2로 잘 분리되는지 확인하는 학습 테스트")
    @Test
    void split() {
        String str = "1,2";
        assertThat(str.split(",")).containsExactly("1", "2");
    }

    @DisplayName("1을 ,로 split 했을 때 1만을 포함하는 배열이 반환되는지에 대한 학습 테스트")
    @Test
    void split2() {
        String str2 = "1";
        assertThat(str2.split(",")).contains("1");
    }

    @DisplayName("(1,2) 값이 주어졌을 때 String의 substring() 메소드를 활용해 ()을 제거하고 1, 2를 반환하도록 구현")
    @Test
    void substring() {
        String str = "(1,2)";

        int beginIndex = str.indexOf("(") + 1;
        int endIndex = str.indexOf(")");

        assertThat(str.substring(beginIndex, endIndex)).isEqualTo("1,2");
    }

    @DisplayName("특정 위치에 해당하는 문자를 가져와야한다.")
    @ParameterizedTest
    @CsvSource(value = {"1:a", "2:b", "3:c"}, delimiter = ':')
    void charAt(int index, char singleStr) {
        String str = "abc";
        assertThat(str.charAt(index - 1)).isEqualTo(singleStr);
    }

    @DisplayName("문자열 범위를 벗어나면 에러가 발생한다.")
    @Test
    void charAt_error() {
        String str = "abc";
        assertThatThrownBy(() -> str.charAt(str.length()))
                .isInstanceOf(IndexOutOfBoundsException.class)
                .hasMessageContaining("String index out of range: 3");
    }
}
