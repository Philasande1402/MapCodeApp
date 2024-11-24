package mapcodeapp;

import java.util.HashMap;
import java.util.Map;

public class MapCodeApp {

    public static void main(String[] args) {
        //Declare and initialize a map that can store String objects representing book titles.
        Map<String,Integer> mapList = new HashMap<>();
        
        //Add the following books to the stack in this order: ”The Great Gatsby”,”1984”, ”To Kill a Mockingbird”, ”Moby Dick”, ”Hamlet”.
        mapList.put("The Great Gatsby",1);
        mapList.put("1984",2);
        mapList.put("To Kill a Mockingbird",3);
        mapList.put("Moby Dick",4);
        mapList.put("Hamlet",5);
        
        //Print the current stack of books.
        
        for(Map.Entry mapdata:mapList.entrySet())
        {
            System.out.println(mapdata.getKey()+"------->"+mapdata.getValue());
        }
        
        System.out.println("");
        
        //Remove the top two books from the map and print their titles
        System.out.println(mapList.remove("1984", 2));
        System.out.println(mapList.remove("Hamlet", 5));
        
        //Print the stack after removing the top two books.
        for(Map.Entry mapdata:mapList.entrySet())
        {
            System.out.println(mapdata.getKey()+"------->"+mapdata.getValue());
        }
        
        
        System.out.println("");
        //Add two more books to the stack: ”Pride and Prejudice” and ”War and Peace”
        mapList.put("Pride and Prejudice", 10);
        mapList.put("War and Peace",30);
        
        //Print the final state of the stack.
        for(Map.Entry mapdata:mapList.entrySet())
        {
            System.out.println(mapdata.getKey()+"------->"+mapdata.getValue());
        }
        
    }
    
}
