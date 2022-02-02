package edu.eci.cvds.patterns.shapes;
import edu.eci.cvds.patterns.shapes.*;
import edu.eci.cvds.patterns.shapes.concrete.*;

public class ShapeFactory {
    public static Shape create(RegularShapeType type){
        Shape selectedShape = null;
        switch (type) {
            case Triangle:
                selectedShape = new Triangle();
                break;
            case Quadrilateral:
                selectedShape = new Quadrilateral();
                break;
            case Pentagon:
                selectedShape = new Pentagon();
                break;
            case Hexagon:
                selectedShape = new Hexagon();
                break;
        }
        return selectedShape;
    }
}
