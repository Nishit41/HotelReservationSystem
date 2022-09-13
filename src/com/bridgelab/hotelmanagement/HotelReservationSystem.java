package com.bridgelab.hotelmanagement;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class HotelReservationSystem {
     List<Hotel> hotels = new ArrayList<>();
     void  addHotels(){
          Hotel hotel = new Hotel("lakeWood" ,80);
          Hotel hotel2 = new Hotel("BridgeWood",160);
          Hotel hotel3 = new Hotel("Ridgewood",220);
          hotels.add(hotel);
          hotels.add(hotel2);
          hotels.add(hotel3);
     }

}
