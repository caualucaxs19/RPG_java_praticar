public class rpg {
    public static void main(String[] args) {
        bruxa zatanna = new bruxa("Zatanna", 100);
        arqueiro venti = new arqueiro("Venti", 120);

        zatanna.exibirVida();
        zatanna.atacarInimigo();
        venti.exibirVida();
        venti.atacarInimigo();

    }
}
