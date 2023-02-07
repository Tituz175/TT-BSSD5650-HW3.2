import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        NumberBase nb = new NumberBase();
        nb.addPropertyChangeListener(new HexaObserver());
        nb.addPropertyChangeListener(new OctalObserver());
        nb.addPropertyChangeListener(new BinaryObserver());
        nb.addPropertyChangeListener(new AsciiObserver());

        Scanner input = new Scanner(System.in);
        System.out.print("Input your desired three numbers separated with a comma: ");
        String numbers = input.nextLine();
        System.out.println("You entered: " + numbers);
        String[] numbersArray = numbers.split(",");

        for (int i = 0; i < numbersArray.length; i++) {
            int number = Integer.parseInt(numbersArray[i]);
            boolean state = (number > 96 && number < 123) ? true : false;
            if (!state) {
                System.out.println("\nNumber must be within the range 97 and 122.\n" + number + " is beyond the given range.");
                break;
            }
            if (i == 0) {
                System.out.println("First state change:");
                nb.setValue(number);
            } else if (i == 1) {
                System.out.println("\nSecond state change:");
                nb.setValue(number);
            } else {
                System.out.println("\nThird state change:");
                nb.setValue(number);
            }
        }
    }
}