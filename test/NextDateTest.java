import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NextDateTest {

    @Test
    void testLastDayOfNonDecemberMonth() {
        int d = 30;
        int m = 4;
        int y = 2023;
        int[] expectedResult = {1, 5, 2023};
        int[] result = new int[3];

        NextDate.nextDate(d, m, y, result);

        assertArrayEquals(expectedResult, result, "Incorrect next date for last day of non-December month");
    }

    @Test
    void testLastDayOfDecember() {
        int d = 31;
        int m = 12;
        int y = 2023;
        int[] expectedResult = {1, 1, 2024};
        int[] result = new int[3];

        NextDate.nextDate(d, m, y, result);

        assertArrayEquals(expectedResult, result, "Incorrect next date for last day of December");
    }

    @Test
    void testLeapYearFebruaryNonLastDay() {
        int d = 28;
        int m = 2;
        int y = 2024;
        int[] expectedResult = {29, 2, 2024};
        int[] result = new int[3];

        NextDate.nextDate(d, m, y, result);

        assertArrayEquals(expectedResult, result, "Incorrect next date for leap year February non-last day");
    }

    @Test
    void testLeapYearFebruaryLastDay() {
        int d = 29;
        int m = 2;
        int y = 2024;
        int[] expectedResult = {1, 3, 2024};
        int[] result = new int[3];

        NextDate.nextDate(d, m, y, result);

        assertArrayEquals(expectedResult, result, "Incorrect next date for leap year February last day");
    }

    @Test
    void testNonLeapYearFebruaryLastDay() {
        int d = 28;
        int m = 2;
        int y = 2023;
        int[] expectedResult = {1, 3, 2023};
        int[] result = new int[3];

        NextDate.nextDate(d, m, y, result);

        assertArrayEquals(expectedResult, result, "Incorrect next date for non-leap year February last day");
    }

    @Test
    void testNonLastDayOfMonth() {
        int d = 15;
        int m = 6;
        int y = 2023;
        int[] expectedResult = {16, 6, 2023};
        int[] result = new int[3];

        NextDate.nextDate(d, m, y, result);

        assertArrayEquals(expectedResult, result, "Incorrect next date for non-last day of month");
    }
}