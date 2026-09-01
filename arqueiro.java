public class arqueiro extends personagem {

    public arqueiro(String nome, int vida) {
     super(nome, vida);
    }
    @Override 
    void atacarInimigo() {
        System.out.println("Atirar flechas!");
    }
}
