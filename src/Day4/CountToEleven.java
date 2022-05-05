package Day4;

public class CountToEleven implements ScannerFactory{

    public void toEleven() {
        while (true) {
            System.out.println("Enter a number less than 11");
            int num = Integer.valueOf(scanner.nextLine());
            if (num < 11) {
                this.increment(num);
                break;
            }
            System.out.println("Not less than 11 try again");
        }
    }

    public void increment(int num) {
        while (num < 12) {
            System.out.println(num);
            num++;
        }
    }
}
