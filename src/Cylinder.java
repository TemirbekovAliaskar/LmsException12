public class Cylinder {

    private double height;
    private double radius;

    public Cylinder() {
    }

    public Cylinder(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getRadius() {
        return radius;
    }



    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double areaCylinder(){
        return 2*Math.PI * radius*( height + radius);
    }
    public double volumeCylinder(){
        return Math.PI*radius*radius*height;
    }
}
