package PointApplication;

import Point.Point;
import PointController.PointController;

public class PointApplication {
    public static void main(String[] args) {
        Point point = new Point(10,20);
        PointController pointController = new PointController();
        pointController.addX(point);
        System.out.println("Punkt addX("+point.getX()+";"+point.getY()+ ")");
        pointController.addY(point);
        System.out.println("Punkt addY("+point.getX()+";"+point.getY()+ ")");

        pointController.minusX(point);
        System.out.println("Punkt minusX("+point.getX()+";"+point.getY()+ ")");

        pointController.minusY(point);
        System.out.println("Punkt minusY("+point.getX()+";"+point.getY()+ ")");


    }
}
