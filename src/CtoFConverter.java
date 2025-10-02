import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
        public class CtoFConverter {
            public static void main(String[] args)
            {
                Scanner in = new Scanner(System.in);
                double celsius = 0.0; // ExampleCelsius temperature
                double fahrenheit = 0.0; // (celsius * 9/5) + 32;
                boolean done = false;
                String trash ="";
                do {

                    System.out.print("Enter a temperature in Celsius: ");
                    if (in.hasNextDouble()) {
                        celsius = in.nextDouble();
                        in.nextLine(); // clear the newLine from the buffer
                        done = true;
                        fahrenheit = (celsius * 9 / 5) + 32;
                        System.out.printf("%.1f degrees Celsius is %.1f degrees Fahrenheit.", celsius, fahrenheit);
                    } else {
                        trash = in.nextLine();
                        System.out.println("Illegal number: " + trash + " Please enter a valid number.");
                    }
                }while (!done);

            }
        }