package com.techelevator.auctions.controller;

import com.techelevator.auctions.dao.AuctionDao;
import com.techelevator.auctions.dao.MemoryAuctionDao;
import com.techelevator.auctions.model.Auction;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/auctions")
public class AuctionController {

    private AuctionDao dao;

    public AuctionController() {
        this.dao = new MemoryAuctionDao();
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Auction> list(@RequestParam(value = "", required = false) String title_like, @RequestParam(required = false) Double currentBid_lte) {

        if (title_like != null && currentBid_lte != null) {
            return dao.searchByTitleAndPrice(title_like, currentBid_lte);
        }
        if (title_like != null) {
            return dao.searchByTitle(title_like);
        }
        if (currentBid_lte != null) {
            return dao.searchByPrice(currentBid_lte);
        }
        return dao.list();
    }


    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public Auction get(@PathVariable int id) {
        return dao.get(id);
    }

    @RequestMapping(path="", method = RequestMethod.POST)
    public Auction addAuction (@RequestBody Auction auction){
        return dao.create(auction);
    }





}
