public class JogadorB extends Jogador{



    @Override
    protected void prepararJogada() {
        System.out.println("Jogador B está se preparando para jogar");        
    }
    @Override
    protected void fazerJogada() {
        System.out.println("O jogador B está fazendo sua jogada");
        
    }

    @Override
    protected void finalizarJogada() {
        System.out.println("Jogador B finalizou sua jogada");        
        
    }

    
    
}
