// Classe abstrata que define o Template Method

public abstract class Jogador {
// Métodos abstratos que devem ser implementados pelas subclasses
    protected abstract void prepararJogada();
    protected abstract void fazerJogada();
    protected abstract void finalizarJogada();
   
   
    // Método template para realizar uma jogada
    public final void jogar(){
        prepararJogada();
        fazerJogada();
        finalizarJogada();   
    }

}
