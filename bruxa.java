public class bruxa extends personagem {

    public bruxa(String nome, int vida) {
        super(nome, vida);
    }
    @Override 
    void atacarInimigo() {
        System.out.println("Lançar feitiço");
    }
}
