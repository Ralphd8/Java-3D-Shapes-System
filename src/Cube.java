public class Cube extends RectangularParallelepiped{
    
    public Cube(){

    }
    public Cube(double density,Point centerOfGravity,double side){
        super(density, centerOfGravity, side,side,side);
    }
    public Cube(Cube c){
        super(c);
    }

    @Override
    public boolean equals(Object o){
        if(!(o instanceof Cube)){
            return false;
        }
        Cube c = (Cube) o;
        return this.width == c.width && this.height == c.height  && this.depth == c.depth && this.centerOfGravity.equals(c.centerOfGravity) && this.density == c.density;
    }
    @Override
    public String toString(){
        return "Cube: Side = " + this.width +
          " Density = " + this.density +
           " Center of gravity = " + this.centerOfGravity.toString();
    }
}
