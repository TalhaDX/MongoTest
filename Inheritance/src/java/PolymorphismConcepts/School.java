package PolymorphismConcepts;

import java.util.*;

/**
 * Created by Talha on 4/26/2016.
 */
public class School  extends Building {

    public List<Room> rooms = new ArrayList<Room>();

    // Composition, as the Room is being passed as necessary.
    public School(int value, Room room){
        numOfRooms = value;

        for (int i = 0; i < value; i++){
            System.out.println(i);
            rooms.add(new Room());
        }
    }

    public void AddRoom(Room room){
        rooms.add(room);
    }


}
