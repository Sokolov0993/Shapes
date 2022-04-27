import service.FactoryFigure;
import service.Square;

import java.io.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
       FactoryFigure factory = new FactoryFigure();

        Square square =  factory.createSquare();
        System.out.println(square.getLengthOfLine1());
        System.out.println(square.checkIfQadrangle());
        }
    }






