public class Parallelepiped {

    private double length;
    private double width;
    private  double height;

    public Parallelepiped(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Parallelepiped() {
    }

    public double getLength() {
        return length;
    }


    public double getWidth() {
        return width;
    }


    public double getHeight() {
        return height;
    }



    public double areaParallelepiped(){
        return 2*((height * length) + (length * width) + (height * width));
    }
}
