public class GumballContainer {

    private int gumballCounter;

    public boolean isEmpty(){
        return this.gumballCounter <= 0;
    }
    public int getGumballCounter() {
        return gumballCounter;
    }

    public GumballContainer(){
        this.gumballCounter = 200;
    }

    public void reset(){
        this.gumballCounter = 200;
    }

    public boolean dispenseGumball(){
        if (!isEmpty()){
            gumballCounter--;
            return true;
        }
        return false;
    }
}
