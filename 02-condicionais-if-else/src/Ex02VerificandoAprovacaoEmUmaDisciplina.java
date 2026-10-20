public class Ex02VerificandoAprovacaoEmUmaDisciplina {
    public static void main(String[] args) {

        double mediaDoAluno = 7.5;

        if (mediaDoAluno >= 7.0) {
            System.out.println("O estudante teve média " + mediaDoAluno + " e foi aprovado.");
        } else if (mediaDoAluno >= 5.0 && mediaDoAluno <= 7.0) {
            System.out.println("O estudante teve média " + mediaDoAluno + " e está de recuperação.");
        } else {
            System.out.println("O estudante teve média " + mediaDoAluno + " e foi reprovado.");
        }
    }
}
