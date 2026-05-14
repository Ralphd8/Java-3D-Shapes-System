public class RightCylinder extends Cylinder{
    
    public RightCylinder(){

    }
    public RightCylinder(double density,Point centerOfGravity,double radius,double centerToCenterDistance){
        super(density, centerOfGravity, radius, centerToCenterDistance,Math.PI/2);
    }
    public RightCylinder(RightCylinder c){
        super(c);
        this.angle = Math.PI /2;
    }

    @Override
    public boolean equals(Object o){
        if(!(o instanceof RightCylinder)){
            return false;
        }
        RightCylinder c = (RightCylinder) o;
        return this.radius == c.radius && this.centerOfGravity.equals(c.centerOfGravity) && this.angle == c.angle && this.centerToCenterDistance == c.centerToCenterDistance && this.density == c.density;
    }
    @Override
    public String toString(){
        return "Right Cylinder: Radius = " + this.radius +
         " Angle = " + this.angle +
          " Density = " + this.density +
           " Center to Center Distance = " + this.centerToCenterDistance +
           " Center of gravity = " + this.centerOfGravity.toString();
    }
}
