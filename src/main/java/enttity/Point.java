package enttity;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Point {
    private double x;
    private double y;


    public double getX() {


        return x;
    }


    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }


    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }


    public void setX(double x) {
        this.x = x;
    }

    public ArrayList<Double> getArrayOfDoubles() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("C:\\Users\\Pavel\\Desktop\\stream.txt"));
        ArrayList<Double> pointArray = new ArrayList<>();
        int i = 0;
        while (scanner.hasNextDouble()) {
            pointArray.add(scanner.nextDouble());
        }


        return pointArray;
    }

public ArrayList<Point> getArrayOfPoints() throws FileNotFoundException {
        ArrayList<Double> myarray= getArrayOfDoubles();
        ArrayList<Point> pointArraylist = new ArrayList<>();
    for (int o=0; o<getArrayOfDoubles().size(); o+=2){
        pointArraylist.add(new Point(myarray.get(o), myarray.get(o+1)));

            }
    return pointArraylist;
        }
    }

