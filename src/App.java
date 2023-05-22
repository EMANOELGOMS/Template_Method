public class App {
    public static void main(String[] args) throws Exception {

        Jogador jogadorA = new JogadorA();
        Jogador jogadorB = new JogadorB();


        jogadorA.jogar();
        System.out.println("----------------");
        jogadorB.jogar();

    }
}
