package Day4;

public class PositiveNumbers implements ScannerFactory{
    public void positiveNums() {
        while (true) {
            System.out.println("Enter a number:");
            int num = Integer.valueOf(scanner.nextLine());
            if (num > 0) {
                System.out.println("Number is " + num);
            } else if (num < 0) {
                System.out.println("Number must be a positive number");
            } else {
                break;
            }
        }
    }
}
