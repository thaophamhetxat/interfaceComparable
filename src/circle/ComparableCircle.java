package circle;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {


    @Override
    public int compareTo(ComparableCircle o) {
        if(getRadius()>o.getRadius())return 1;
        else if (getRadius()<o.getRadius())return -1;
        else return 1;
    }

    public ComparableCircle(){
    }
    public ComparableCircle(double radius) {
        this.radius=radius;
    }
    public ComparableCircle(double radius, String color){
        super(radius, color);
    }



}
