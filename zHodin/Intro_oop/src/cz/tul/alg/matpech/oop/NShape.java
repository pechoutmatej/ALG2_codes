package cz.tul.alg.matpech.oop;

import java.util.Arrays;

public class NShape {
    private Point[] shape;

    //region constructors
    public NShape(Point[] shape)
    {
        this.shape = Arrays.copyOf(shape, shape.length);
    }

    public NShape(double[][] shape)
    {
        Point p;
        this.shape = new Point[shape.length];
        for (int i = 0; i < shape.length; i++)
        {
            p = new Point(shape[i][0], shape[i][1]);
            this.shape[i] = p;
        }
    }

    public double volume()
    {
        double vol = 0;
        for(int i = 0; i < shape.length -1; i++)
        {

            vol = vol + ((shape[i].getX() * shape[i+1].getY()) - (shape[i+1].getX() * shape[i].getY()));
        }
        vol = vol + ((shape[shape.length-1].getX() + shape[0].getY()) - (shape[0].getX() * shape[shape.length-1].getY()));
        vol = Math.abs(vol);
        vol = vol/2;
        return vol;
    }

    public double perim(){
        double perim = 0;
        for(int i = 0; i < shape.length -1; i++) {
            perim = perim + shape[i].pointDistance(shape[i+1]);
        }
        perim = perim + shape[shape.length-1].pointDistance(shape[0]);
        return perim;
    }

}
