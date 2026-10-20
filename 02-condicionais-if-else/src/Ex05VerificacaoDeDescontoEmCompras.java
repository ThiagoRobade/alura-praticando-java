public class Ex05VerificacaoDeDescontoEmCompras {
    public static void main(String[] args) {
        double valorDaCompra = 100.0;
        double valorComDesconto = 0.0;

        if (valorDaCompra >= 100.0) {
            valorComDesconto = valorDaCompra * 0.9;
            System.out.println("Desconto de 10% aplicado.");
            System.out.println("O valor da compra com desconto é: " + valorComDesconto);
        } else {
            System.out.println("Nenhum desconto aplicado. ");
            System.out.println("O valor da compra sem desconto é: " + valorDaCompra);
        }
    }
}
