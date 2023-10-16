public class exemplo2 {
    public static void main(String[] args) {
        boolean ehEstudante = true;
        boolean temNotaBoa = false;

        boolean podeParticipar = ehEstudante && temNotaBoa;
        boolean precisaMelhorar = ehEstudante || temNotaBoa;
        boolean naoEhEstudante = !ehEstudante;

        System.out.println("Pode participar: "+ podeParticipar);
        System.out.println("Precisa melhorar: " + precisaMelhorar);
        System.out.println("Não é estudante: " + naoEhEstudante);
    }
}
