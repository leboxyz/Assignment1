//RoomDemo class 
class RoomDemo {
    public static void main(String[] args) {
        //create a new Room object
        Room room = new Room();
        //set the height, width, and breadth
        room.height = 10;
        room.width = 20;
        room.breadth = 30;
        //display the volume
        System.out.println("Volume: " + room.volume());
    }
}