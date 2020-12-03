public class Principal {
    private boolean ingame = false;
    private static Deck deck = new Deck();

    public static void newGame() {
        deck = new Deck();
        deck.shuffle();
    }

    public static Card buy(){
        return deck.buy();
    }


}
