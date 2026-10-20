public class Ex03ValidacaoDeSenha {
    public static void main(String[] args) {

        String senha = "senha123";
        String senhaDigitada = "senha123";

        if (senha.equals(senhaDigitada)) {
            System.out.println("Acesso permitido");
        } else {
            System.out.println("Acesso negado");
        }
    }
}
