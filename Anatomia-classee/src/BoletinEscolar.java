public class BoletinEscolar {
    public static void main(String[] args) {
        int media = 10;

        if (media < 5) {
            System.out.println("Aluno rreprovado");
        } else if (media == 6) {
            System.out.println("Aluno Presisa de Prova de recuperação");
        } else {
            System.out.println("Aluno Aprovado");
        }
    }
}
