package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private Shape shape;
    private List<Shape> shapeList = new ArrayList<>();


    public void addFigure(Shape shape) {
        shapeList.add(shape);

    }

    public boolean removeFigure(Shape shape) {

        boolean result = false;
        if (shapeList.contains(shape)) {
            shapeList.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int shapeNumber) {

        if (shapeNumber >= 0 && shapeNumber < shapeList.size()) {
            shape = shapeList.get(shapeNumber);
        }

        return shape.getShapeName();
    }

    public List<Shape> showFigutes() {

        List<Shape> temp = new ArrayList<>();
        if (shapeList.size() >= 0) {
            for (Shape temporaryShape : shapeList) {
                temp.add(temporaryShape);
            }
        }
        return temp;
    }

    public List<Shape> getShapeList() {
        return shapeList;
    }
}