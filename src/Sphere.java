public class Sphere extends Form{
    
    protected double radius;

    public Sphere(){

    }
    public Sphere(double density,Point centerOfGravity,double radius){
        super(density, centerOfGravity);
        this.radius = radius;
    }
    public Sphere(Sphere s){
        super(s);
        this.radius = s.radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    @Override 
    public double getVolume(){
        return (4.0/ 3.0) * Math.PI * Math.pow(this.radius,3);
    }

    @Override
    public boolean equals(Object o){
        if(!(o instanceof Sphere)){
            return false;
        }
        Sphere c = (Sphere) o;
        return this.radius == c.radius && this.centerOfGravity.equals(c.centerOfGravity) && this.density == c.density;
    }
    @Override
    public String toString(){
        return "Sphere: Radius = " + this.radius +
          " Density = " + this.density +
           " Center of gravity = " + this.centerOfGravity.toString();
    }
}
