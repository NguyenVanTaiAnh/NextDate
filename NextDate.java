public class NextDate {
    public static void nextDate(int d, int m, int y, int[] result) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Kiểm tra năm nhuận
        if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) {
            daysInMonth[1] = 29;
        }

        // Tính ngày tiếp theo
        int do_day = d + 1;
        int mo_month = m;
        int yo_year = y;

        if (do_day > daysInMonth[m - 1]) {
            do_day = 1;
            mo_month++;
        }

        if (mo_month > 12) {
            mo_month = 1;
            yo_year++;
        }

        result[0] = do_day;
        result[1] = mo_month;
        result[2] = yo_year;
    }

    public static void main(String[] args) {
        int d = 31;
        int m = 12;
        int y = 2023;
        int[] result = new int[3];

        nextDate(d, m, y, result);

        System.out.println("Ngày tiếp theo: " + result[0] + "/" + result[1] + "/" + result[2]);
    }
}