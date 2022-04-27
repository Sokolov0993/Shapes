package service;

import enttity.Point;

import java.util.ArrayList;

public abstract class Square {
    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    public Point getPoint3() {
        return point3;
    }

    public void setPoint3(Point point3) {
        this.point3 = point3;
    }

    public Point getPoint4() {
        return point4;
    }

    public void setPoint4(Point point4) {
        this.point4 = point4;
    }

    boolean isItQadrangle;
    Point point1;
    Point point2;
    Point point3;
    Point point4;

    public double getLengthOfLine1() {
        return (Math.sqrt((this.getPoint2().getX() - this.getPoint1().getX()) * (this.getPoint2().getX() - this.getPoint1().getX()) + (this.getPoint2().getY() - this.getPoint1().getY()) * (this.getPoint2().getY() - this.getPoint1().getY())));
    }

    public double getLengthOfLine2() {
        return (Math.sqrt((this.getPoint3().getX() - this.getPoint2().getX()) * (this.getPoint3().getX() - this.getPoint2().getX()) + (this.getPoint3().getY() - this.getPoint2().getY()) * (this.getPoint3().getY() - this.getPoint2().getY())));
    }

    public double getLengthOfLine3() {
        return (Math.sqrt((this.getPoint4().getX() - this.getPoint3().getX()) * (this.getPoint4().getX() - this.getPoint3().getX()) + (this.getPoint4().getY() - this.getPoint3().getY()) * (this.getPoint4().getY() - this.getPoint3().getY())));
    }

    public double getLengthOfLine4() {
        return (Math.sqrt((this.getPoint1().getX() - this.getPoint4().getX()) * (this.getPoint1().getX() - this.getPoint4().getX()) + (this.getPoint1().getY() - this.getPoint4().getY()) * (this.getPoint1().getY() - this.getPoint4().getY())));
    }


    public double calculateQadranglePerimeter() {
        return (getLengthOfLine1() + getLengthOfLine2() + getLengthOfLine3() + getLengthOfLine4());
    }

    public double getLengthOfDiadonal1() {
        return (Math.sqrt((this.getPoint3().getX() - this.getPoint1().getX()) * (this.getPoint3().getX() - this.getPoint1().getX()) + (this.getPoint3().getY() - this.getPoint1().getY()) * (this.getPoint3().getY() - this.getPoint1().getY())));
    }

    public double getLengthOfDiagonal2() {
        return (Math.sqrt((this.getPoint2().getX() - this.getPoint4().getX()) * (this.getPoint2().getX() - this.getPoint4().getX()) + (this.getPoint2().getY() - this.getPoint4().getY()) * (this.getPoint2().getY() - this.getPoint4().getY())));
    }

    public double calculateQadrangleSquare() {
        double p = (getLengthOfLine1() + getLengthOfLine2() + getLengthOfLine3() + getLengthOfLine4()) / 2;
        double qadrandleSquare = Math.sqrt((p - getLengthOfLine1()) * (p - getLengthOfLine2()) * (p - getLengthOfLine3()) * (p - getLengthOfLine4()));
        return qadrandleSquare;
    }

    public boolean checkIfQadrangle() {
        ArrayList<Double> cordinatArray = new ArrayList<>();
        cordinatArray.add(this.getPoint1().getX());
        cordinatArray.add(this.getPoint2().getX());
        cordinatArray.add(this.getPoint3().getX());
        cordinatArray.add(this.getPoint4().getX());
        ArrayList<Double> cordinatArray2 = new ArrayList<>();
        cordinatArray2.add(this.getPoint1().getY());
        cordinatArray2.add(this.getPoint2().getY());
        cordinatArray2.add(this.getPoint3().getY());
        cordinatArray2.add(this.getPoint4().getY());
        ArrayList<Double> checkIf = new ArrayList<>();
        ArrayList<Double> checkIf2 = new ArrayList<>();
        boolean x = false;
        boolean y = false;
        for (int i = 1; i < cordinatArray.size(); i++) {
            if (cordinatArray.get(i).compareTo(cordinatArray.get(i - 1)) == 0) {
                checkIf.add(cordinatArray.get(i));
                checkIf.add(cordinatArray.get(i - 1));
            }
        }
        if (checkIf.size() > 2 && (checkIf.get(1).compareTo(checkIf.get(0)) == 0 && checkIf.get(1).compareTo(checkIf.get(3)) == 0)) {
            x = true;
        }
        for (int i = 1; i < cordinatArray2.size(); i++) {
            if (cordinatArray2.get(i).compareTo(cordinatArray2.get(i - 1)) == 0) {
                checkIf2.add(cordinatArray2.get(i));
                checkIf2.add(cordinatArray2.get(i - 1));
            }
        }
        if (checkIf2.size() > 2 && (checkIf2.get(1).compareTo(checkIf2.get(0)) == 0 && checkIf2.get(1).compareTo(checkIf2.get(3)) == 0)) {
            y = true;
        }
        if (x || y) {
            return false;
        } else {
            isItQadrangle = true;
            return true;
        }
    }

    public boolean checkIfQadrangleIsSqare() {

        if (getLengthOfLine1() == getLengthOfLine4() && getLengthOfLine1() == getLengthOfLine3()
                && getLengthOfDiadonal1() == getLengthOfDiagonal2()) {
            return true;
        } else {
            return false;
        }


    }


    public boolean checkIfQadrangleIsRhombus() {
        if (isItQadrangle) {
            if (getLengthOfLine1() == getLengthOfLine4() && getLengthOfLine1() == getLengthOfLine3()
                    && getLengthOfDiadonal1() != getLengthOfDiagonal2()) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
