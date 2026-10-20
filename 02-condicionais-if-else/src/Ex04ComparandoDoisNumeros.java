public class Ex04ComparandoDoisNumeros {
    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 20;

        if (numero1 > numero2) {
            System.out.println("O número " + numero1 + " é maior que o número " + numero2);
        } else if (numero1 < numero2) {
            System.out.println("O número " + numero1 + " é menor que o número " + numero2);
        } else {
            System.out.println("Os números são iguais");
        }
    }
}
