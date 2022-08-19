package com.techelevator;

public class BuyoutAuction extends Auction {

    private int buyoutPrice;

    private int buyoutPrice(){
        return buyoutPrice();
    }

    public BuyoutAuction(String itemForSale, int buyoutPrice){
        super(itemForSale);
        this.buyoutPrice = buyoutPrice;
    }

    @Override
    public boolean placeBid(Bid offeredBid) {
        boolean isCurrentWinningBid = false;
        if (getHighBid().getBidAmount() < buyoutPrice){
            if (offeredBid.getBidAmount() >= buyoutPrice){
                offeredBid = new Bid
            }
        }
    }
}
