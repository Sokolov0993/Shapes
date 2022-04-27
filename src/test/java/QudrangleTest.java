import org.testng.annotations.Test;
import service.FactoryFigure;
import service.Square;

import java.io.FileNotFoundException;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

 public class QudrangleTest {

     @Test
     public void perimeterCalculationTest() throws FileNotFoundException {
         Square square = new FactoryFigure().createSquare();
         double perimeter = square.calculateQadranglePerimeter();


         assertTrue("Периметр меньше или равно 0", perimeter > 0);
         assertEquals("Периметр неверный! ", 20.0, perimeter);
     }
 }
 /*   @Test
    public void SquareCalculationTest(){
        QadrangleService qadrangleService = new QadrangleService();
        double square = qadrangleService.calculateQadrangleSquare(new Figure(new Point(0,0), new Point(0,5), new Point(5,5), new Point(5,0)));
        assertTrue("Площадь меньше или равно 0", square > 0);
        assertEquals("Площадь неверная! ", 25.0, square);
    }
    @Test
    public void checkingIfSquareTest() {
        QadrangleService qadrangleService = new QadrangleService();
        boolean check = qadrangleService.checkIfQadrangleIsSqare(new Figure(new Point(0, 0), new Point(0, 5), new Point(5, 5), new Point(5, 0)));
        assertEquals("Проверка неверная ", true, check);
    }
    @Test
    public void checkingIfRhombusTest() {
        QadrangleService qadrangleService = new QadrangleService();
        boolean check = qadrangleService.checkIfQadrangleIsRhombus(new Figure(new Point(0, 0), new Point(0, 5), new Point(5, 5), new Point(5, 0)));
        assertEquals("Проверка неверная! ", false, check);
    }
    @Test
    public void checkingIfQuadrangle() {
        QadrangleService qadrangleService = new QadrangleService();
        boolean check = qadrangleService.checkIfQadrangle(new Figure(new Point(0, 0), new Point(0, 5), new Point(5, 5), new Point(5, 0)));
        assertEquals("Проверка неверная! ", true, check);
    }
    @Test
    public void gettingSizeOfLine1Check(){
        QadrangleService qadrangleService = new QadrangleService();
        double line1 = qadrangleService.getLengthOfLine1(new Figure(new Point(0,0), new Point(0,5), new Point(5,5), new Point(5,0)));
        assertTrue("Линия меньше или равно 0", line1 > 0);
        assertEquals("Линия рассчитана неверно! ", 5.0, line1);
    }
    @Test

    public void gettingSizeOfLine2Check(){
        QadrangleService qadrangleService = new QadrangleService();
        double line2 = qadrangleService.getLengthOfLine1(new Figure(new Point(0,0), new Point(0,5), new Point(5,5), new Point(5,0)));
        assertTrue("Линия меньше или равно 0", line2 > 0);
        assertEquals("Линия рассчитана неверно! ", 5.0, line2);
    }
    @Test
    public void gettingSizeOfLine3Check(){
        QadrangleService qadrangleService = new QadrangleService();
        double line3 = qadrangleService.getLengthOfLine1(new Figure(new Point(0,0), new Point(0,5), new Point(5,5), new Point(5,0)));
        assertTrue("Линия меньше или равно 0", line3 > 0);
        assertEquals("Линия рассчитана неверно! ", 5.0, line3);
    }
    @Test
    public void gettingSizeOfLine4Check(){
        QadrangleService qadrangleService = new QadrangleService();
        double line4 = qadrangleService.getLengthOfLine1(new Figure(new Point(0,0), new Point(0,5), new Point(5,5), new Point(5,0)));
        assertTrue("Линия меньше или равно 0", line4 > 0);
        assertEquals("Линия рассчитана неверно! ", 5.0, line4);
    }


}
*/
