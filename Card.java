public class Card {

	int value;
    SUITE suite;

    public Card(SUITE suite, int value) {
        this.suite = suite; 
        this.value = value;
    }

    public int getValue(){
        return value;
    }
	
    public SUITE getSuite(){
        return suite;
    }


    public void setValue(int value){
        this.value = value;
    }
	
    public void setSuite(SUITE suite){
        this.suite = suite;
    }

    @Override
    public String toString() {
        return "Card { " + suite + " " + value + " }";
    }

}
