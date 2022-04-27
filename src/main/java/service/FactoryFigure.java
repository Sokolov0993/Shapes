package service;
import enttity.Point;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FactoryFigure extends FactorySquare {


    @Override
    public Square createSquare() throws FileNotFoundException {
        ArrayList<Point> points = getArrayOfPoints();
        return new RealSquare(points.get(0), points.get(1), points.get(2), points.get(3));
    }
}
abstract class FactorySquare{
    public Square createSquare() throws FileNotFoundException {
        
        return null;
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


class RealSquare extends Square {
    public RealSquare(Point point1, Point point2, Point point3, Point point4) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
        this.point4 = point4;
    }
}





