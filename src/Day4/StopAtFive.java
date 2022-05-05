package Day4;

public class StopAtFive implements ScannerFactory{

    public void toFive() {
        while (true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            if (num == 5) {
                break;
            }
        }
    }
}
