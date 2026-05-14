public class RectangularParallelepiped extends Form{

    protected double width;
    protected double height;
    protected double depth;

    public RectangularParallelepiped(){

    }
    public RectangularParallelepiped(double density,Point centerOfGravity,double width, double height,double depth){
        super(density, centerOfGravity);
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    public RectangularParallelepiped(RectangularParallelepiped r){
        super(r);
        this.width = r.width;
        this.height= r.height;
        this.depth = r.depth;
    }

    public double getWidth(){
        return this.width;
    }
    public double getHeight(){
        return this.height;
    }
    public double getDepth(){
        return this.depth;
    }

    public void setWidth(double width){
        this.width = width;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public void setDepth(double depth){
        this.depth = depth;
    }

    @Override 
    public double getVolume(){
        return this.width * this.height * this.depth;
    }

    @Override
    public boolean equals(Object o){
        if(!(o instanceof RectangularParallelepiped)){
            return false;
        }
        RectangularParallelepiped c = (RectangularParallelepiped) o;
        return this.width == c.width && this.height == c.height  && this.depth == c.depth && this.centerOfGravity.equals(c.centerOfGravity) && this.density == c.density;
    }
    @Override
    public String toString(){
        return "Rectangular Parallelepiped: Width = " + this.width +
        " Height = " + this.height +
        " Depth = " + this.depth +
          " Density = " + this.density +
           " Center of gravity = " + this.centerOfGravity.toString();
    }

}