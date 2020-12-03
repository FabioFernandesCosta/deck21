public class Bot{
    public boolean hold = false;
    public Card mao[] = new Card[1];
    public int select;

    public void setHold(){
        hold = !hold;
    }

    public boolean getHold(){
        return hold;
    }
}
