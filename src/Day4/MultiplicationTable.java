package Day4;

public class MultiplicationTable implements ScannerFactory{
    public void table() {
        System.out.println("Input a number:");
        int num = Integer.valueOf(scanner.nextLine());
        for (int i = 1; i < 11; i++) {
            System.out.println(num + " x " + i + " = " + (i * num));
        }
    }
}
