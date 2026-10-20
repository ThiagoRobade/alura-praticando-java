public class Ex06ClassificacaoPorCategoria {
    public static void main(String[] args) {

        double preco = 150.00;

        if (preco <= 50.00) {
            System.out.println("Preço econômico");
        } else if (preco >= 50.01 && preco <= 200.00 ) {
            System.out.println("Preço intermediário");
        } else {
            System.out.println("Preço premium");
        }
    }
}
