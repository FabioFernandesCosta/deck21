public class Card {

    public int value;
    public String naipe, name;

    public Card(int value, String naipe){

        setCard(value, naipe);
        setName();
    }

    public void setCard(int value, String naipe){
        this.value = value;
        this.naipe = naipe;


    }

    public void setName(){
        if (this.value == 1 || this.value >= 11){
            setName(this.value);
        }else {
            this.name = (value + " of " + naipe);
        }
    }

    public void setName(int value){

        if (value == 1){
            this.name = ("Ace of " + this.naipe);
        }else if (value == 11){
            this.name = ("Jack of " + this.naipe);
        }else if (value == 12){
            this.name = ("Queen of " + this.naipe);
        }else if (value == 13){
            this.name = ("King of " + this.naipe);
        }else {
            System.err.println("error");
        }
    }

    public int getValue(){
        return this.value;
    }

    public String getName(){
        return this.name;
    }
}
