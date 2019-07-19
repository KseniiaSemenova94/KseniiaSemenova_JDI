package hw7.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum EvenSummaryNumber {

    OPTION_1(2),
    OPTION_2(4),
    OPTION_3(6),
    OPTION_4(8);

    private final int number;
}
