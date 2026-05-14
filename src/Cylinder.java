public class Cylinder extends Form{
    
    protected double radius;
    protected double angle;
    protected double centerToCenterDistance;

    public Cylinder(){

    }
    public Cylinder(double density,Point centerOfGravity,double radius,double centerToCenterDistance,double angle){
        super(density, centerOfGravity);
        this.radius = radius;
        this.centerToCenterDistance = centerToCenterDistance;
        this.angle = angle;
    }
    public Cylinder(Cylinder c){
        super(c);
        this.radius = c.radius;
        this.centerToCenterDistance = c.centerToCenterDistance;
        this.angle = c.angle;
    }

    public double getRadius(){
        return this.radius;
    }
    public double getCenterToCenterDistance(){
        return this.centerToCenterDistance;
    }
    public double getAngle(){
        return this.angle;
    }
    public double getHeight() {
        return this.centerToCenterDistance * Math.sin(angle);
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setCenterToCenterDistance(double centerToCenterDistance) {
        this.centerToCenterDistance = centerToCenterDistance;
    }
    public void setAngle(double angle) {
        this.angle = angle;
    }

    @Override
    public double getVolume(){
        return Math.PI * Math.pow(this.radius,2) * getHeight();
    }

    @Override
    public boolean equals(Object o){
        if(!(o instanceof Cylinder)){
            return false;
        }
        Cylinder c = (Cylinder) o;
        return this.radius == c.radius && this.centerOfGravity.equals(c.centerOfGravity) && this.angle == c.angle && this.centerToCenterDistance == c.centerToCenterDistance && this.density == c.density;
    }
    @Override
    public String toString(){
        return "Cylinder: Radius = " + this.radius +
         " Angle = " + this.angle +
          " Density = " + this.density +
           " Center to Center Distance = " + this.centerToCenterDistance +
           " Center of gravity = " + this.centerOfGravity.toString();
    }
}
