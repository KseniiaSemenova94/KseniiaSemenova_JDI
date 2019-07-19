package hw7.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum OddSummaryNumber {

    OPTION_1(1),
    OPTION_2(3),
    OPTION_3(5),
    OPTION_4(7);

    private final int number;
}
