public class JogadorA extends Jogador{

    @Override
    protected void prepararJogada() {
        System.out.println("Jogador A está se preparando para jogar");
        
    }
    @Override
    protected void fazerJogada() {
        System.out.println("O jogador A está fazendo sua jogada");
        
    }
    @Override
    protected void finalizarJogada() {
        System.out.println("Jogador A finalizou sua jogada");        
    }
    
}
