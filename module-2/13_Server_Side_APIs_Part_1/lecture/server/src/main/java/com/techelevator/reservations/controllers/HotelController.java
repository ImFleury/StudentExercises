package com.techelevator.reservations.controllers;

import com.techelevator.reservations.dao.HotelDao;
import com.techelevator.reservations.dao.MemoryHotelDao;
import com.techelevator.reservations.dao.MemoryReservationDao;
import com.techelevator.reservations.dao.ReservationDao;
import com.techelevator.reservations.model.Hotel;
import com.techelevator.reservations.model.Reservation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class HotelController {

    private HotelDao hotelDao;
    private ReservationDao reservationDao;

    public HotelController() {
        this.hotelDao = new MemoryHotelDao();
        this.reservationDao = new MemoryReservationDao(hotelDao);
    }

    /**
     * Return All Hotels
     *
     * @return a list of all hotels in the system
     */
    @RequestMapping(path = "/hotels", method = RequestMethod.GET)
    public List<Hotel> list() {
        return hotelDao.list();
    }

    /**
     * Return hotel information
     *
     * @param id the id of the hotel
     * @return all info for a given hotel
     */
    @RequestMapping(path = "/hotels/{id}", method = RequestMethod.GET)
    public Hotel get(@PathVariable int id) {
        return hotelDao.get(id);
    }

    @RequestMapping(path="/reservations" , method = RequestMethod.GET)
    public List<Reservation> listReservations(){
        return reservationDao.findAll();
    }
    @RequestMapping(path="/reservations/id)", method = RequestMethod.GET)
    public Reservation getReservation(@PathVariable int id){
        return reservationDao.get(id);
    }
    @RequestMapping(path="/hotels/{id}/reservations", method = RequestMethod.GET)
    public List<Reservation> listReservationsByHotel(@PathVariable("id") int hotelID) {
        return  reservationDao.findByHotel(hotelID);
    }
    @RequestMapping(path="/reservations", method = RequestMethod.POST)
    public Reservation addReservation(@RequestBody Reservation reservation){          // same thing as line 60-63
        return reservationDao.create(reservation, reservation.getHotelID());
    }
    @RequestMapping(path="/hotels/{id}/reservations", method = RequestMethod.POST)
    public Reservation addReservation(@PathVariable int id, @RequestBody Reservation reservation) {
        return reservationDao.create(reservation, id);
    }
    @RequestMapping(path="hotels/filter?state={state}&city={city}", method = RequestMethod.GET)
    public List<Hotel> filterHotelByStateAndCity(@RequestParam String state, @RequestParam(required=false) String city){
        List<Hotel> filteredHotelList = new ArrayList<>();

        List<Hotel> hotelList = this.list();

        for( Hotel hotel : hotelList){

            if(city == null){
                if(hotel.getAddress().getState().toLowerCase(Locale.ROOT).equals(state.toLowerCase(Locale.ROOT))){
                    filteredHotelList.add(hotel);
                }
            } else {
                if (hotel.getAddress().getState().toLowerCase().equals(state.toLowerCase()) &&
                        hotel.getAddress().getCity().toLowerCase().equals(city.toLowerCase())){
                            filteredHotelList.add(hotel);
                }
            }
        }

        return filteredHotelList;
    }

}
