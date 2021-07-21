public class Area {
    int side;


    Area(int side) {
        this.side = side;
    }
    int area(){
        return  side * side;
    }
    public int perimeter() {
        return side * 4;
    }
    int displaySide(){
        return side;
    }
}