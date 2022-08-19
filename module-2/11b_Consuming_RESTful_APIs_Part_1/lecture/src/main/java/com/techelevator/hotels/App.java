package com.techelevator.hotels;

import com.techelevator.hotels.services.ConsoleService;
import com.techelevator.hotels.services.HotelService;

public class App {

    private final ConsoleService consoleService = new ConsoleService();
    private final HotelService hotelService = new HotelService();

    public static void main(String[] args) {
        App app = new App();
        app.run();
    }

    private void run() {
        int menuSelection = -1;

        while (menuSelection != 0) {
            consoleService.printMainMenu();
            menuSelection = consoleService.promptForMenuSelection();
            if (menuSelection == 1) {
                ConsoleService.printHotels(hotelService.listHotels());
            } else if (menuSelection == 2) {
                ConsoleService.printReviews(hotelService.listReviews());
            } else if (menuSelection == 3) {
                ConsoleService.printHotel(hotelService.getHotelById(1));
            } else if (menuSelection == 4) {
                ConsoleService.printReviews(hotelService.getReviewsByHotelId(1));
            } else if (menuSelection == 5) {
                ConsoleService.printHotels(hotelService.getHotelsByStarRating(4));
            } else if (menuSelection == 6) {
                System.out.println("Not implemented - Create a custom Web API query here");
            } else if (menuSelection == 0) {
                continue;
            } else {
                System.out.println("Invalid Selection");
            }
            consoleService.pause();
        }
    }

}
