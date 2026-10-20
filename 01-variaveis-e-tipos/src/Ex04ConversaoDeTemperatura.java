import java.util.Scanner;

public class Ex04ConversaoDeTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor em graus celsius: ");
        int celsius = scanner.nextInt();

        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("Valor em Fahrenheit: " + fahrenheit);
    }
}
