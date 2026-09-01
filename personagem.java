public abstract class personagem {
    String nome;
    int vida;

public personagem(String nome, int vida) {
    this.nome = nome;
    this.vida = vida;
}
    void exibirVida() {
        System.out.println(vida + "\n" + nome);
    }
    abstract void atacarInimigo();
}
