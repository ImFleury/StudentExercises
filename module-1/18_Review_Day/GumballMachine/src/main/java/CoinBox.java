public class CoinBox {

    //properties
    private int coinCounter;

    //getters and setter

    public int getCoinCounter() {
        return coinCounter;
    }

    //constructors
    public CoinBox(){
        this.coinCounter = 0;
    }

    //methods
    public void reset(){
        this.coinCounter = 0;
    }

    public boolean acceptCoin(){
        coinCounter++;
        return true;
    }

}
