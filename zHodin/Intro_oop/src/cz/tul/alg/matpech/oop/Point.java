package cz.tul.alg.matpech.oop;

public class Point {
    //data
    private double x;
    private double y;

    //constructor
    public Point()
    {

    }
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    //setter
    public void setX(double x){
        this.x = x;
    }

    public void setY(double y){
        this.y = y;
    }
    //getter
    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }
    //methods
    public double getDistance(){
        return Math.sqrt(x*x + y*y);
    }
    public double pointToPointDistance(Point a, Point b)
    {
        double fBracket = b.getX() - a.getX();
        double sBracket = b.getY() - a.getY();
        double result = Math.sqrt(fBracket*fBracket + sBracket*sBracket);
        return Math.abs(result);
    }

    public double pointDistance(Point b){
        double fBracket = b.x - x;
        double sBracket = b.y - y;
        double result = Math.sqrt(fBracket*fBracket + sBracket*sBracket);
        return Math.abs(result);
    }

    public String toString(){
        return "x=" + x + ", y=" + y;
    }


}
