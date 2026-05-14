public class Point{
    private double x;
    private double y;
    private double z;

    public Point(){

    }
    public Point(double x,double y,double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public Point(Point point){
        this.x = point.x;
        this.y = point.y;
        this.z = point.z;
    }

    @Override
    public boolean equals(Object obj){
        if (!(obj instanceof Point)){
            return false;
        }
        Point pt = (Point) obj;
        if(this.x == pt.x && this.y == pt.y && this.z == pt.z){
            return true;
        }
        return false;
    }

    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }
    public double getZ(){
        return this.z;
    }

    public void setX(double x){
        this.x = x;
    }
    public void setY(double y){
        this.y = y;
    }
    public void setZ(double z){
        this.z = z;
    }

    @Override
    public String toString(){
        return "Point Coords: X = " + this.x + ", Y = " + this.y + ", Z = " + this.z;
    }

    public void moveTo(Point point){
        this.x = point.x;
        this.y = point.y;
        this.z = point.z;
    }

}