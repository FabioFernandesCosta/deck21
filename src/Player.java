import java.util.ArrayList;
import java.util.List;

public class Player{

    public boolean hold = false;
    public List<Card> mao = new ArrayList<Card>();
    private int value = 0;
    public void setHold(){
        hold = !hold;
    }

    public boolean getHold(){
        return hold;
    }

    public int getMaoV(){
        value = 0;
        for(int i = 0; i<mao.size(); i++){
            value = value + mao.get(i).getValue();
        }
        return value;
    }

    public void buy(){
        mao.add(Principal.buy());
        value = getMaoV();
    }

    public void resetMao(){
        mao.clear();
    }

    public void show(){
        System.out.println(value);
        System.out.println("Your hand is: " +  handCards() + '\n');
    }

    public String handCards(){
        String cardNames = "";
        for (int i = 0; i < mao.size(); i++) {
            cardNames = mao.get(i).getName() + ", ";
        }
        return cardNames;
    }

}