public abstract class Form {
    
    protected double density;
    protected Point centerOfGravity;

    public Form(){

    }

    public Form(double density,Point centerOfGravity){
        this.density = density;
        this.centerOfGravity = centerOfGravity;
    }

    public Form(Form f){
        this.density = f.density;
        this.centerOfGravity = new Point(f.centerOfGravity);
    }

    public double getDensity(){
        return this.density;
    }

    public Point getCenterOfGravity(){
        return this.centerOfGravity;
    }

    public void setDensity(double density){
        this.density = density;
    }

    public void setCenterOfGravity(Point centerOfGravity){
        this.centerOfGravity = centerOfGravity;
    }

    public abstract double getVolume();

    public double getWeight(){
        return this.density * this.getVolume() * 9.81;
    }
    public static boolean haveSameVolume(Form f1,Form f2){
        return f1.getVolume() == f2.getVolume();
    }

    public boolean hasSameVolumeAs(Form f){
        return this.getVolume() == f.getVolume();
    }

    public boolean isBiggerThan(Form f){
        return this.getVolume() > f.getVolume();
    }
    public boolean isSmallerThan(Form f){
        return this.getVolume() < f.getVolume();
    }

    public static boolean haveSameWeight(Form f1,Form f2){
        return f1.getWeight() == f2.getWeight();
    }

    public boolean hasSameWeightAs(Form f){
        return this.getWeight() == f.getWeight();
    }

    public boolean isHeavierThan(Form f){
        return this.getWeight() > f.getWeight();
    }

    public boolean isLighterThan(Form f){
        return this.getWeight() < f.getWeight();
    }

    public void moveTo(Point pt){
        this.centerOfGravity.moveTo(pt);
    }

}
