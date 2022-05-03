public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        int actual1 = (int) service.calculate(1000_60, true);
        int expected1 = 30;
        System.out.println("ОР: " + expected1 + ", ФР:" + actual1);

        int actual2 = (int) service.calculate(10_000_000_60, true);
        int expected2 = 500;
        System.out.println("ОР: " + expected2 + ", ФР:" + actual2);

        int actual3 = (int) service.calculate(1000_60, false);
        int expected3 = 10;
        System.out.println("ОР: " + expected3 + ", ФР:" + actual3);

        int actual4 = (int) service.calculate(10_000_000_60, false);
        int expected4 = 500;
        System.out.println("ОР: " + expected4 + ", ФР:" + actual4);
    }
}

