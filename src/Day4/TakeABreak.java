package Day4;

public class TakeABreak implements ScannerFactory{
    public static void main(String[] args) {

        while(true) {
            System.out.println("Do you want to take a break?");
            String input = scanner.nextLine();
            if (input.equals("yes")) {
                break;
            }
        }

        StopAtFive five = new StopAtFive();
        five.toFive();
        PositiveNumbers nums = new PositiveNumbers();
        nums.positiveNums();
        CountToEleven count = new CountToEleven();
        count.toEleven();
        MultiplicationTable table = new MultiplicationTable();
        table.table();

    }
}
