package com.kodilla.testing.shape;
import org.junit.*;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure() {
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(new Circle(3));

        Assert.assertEquals(1, shapeCollector.getShapeList().size());
    }

    @Test
    public void removeAddFigureTest() {
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape1 = new Circle(10);
        shapeCollector.removeFigure(shape1);
        Assert.assertEquals(0, shapeCollector.getShapeList().size());
    }

    @Test
    public void getFigureNameTest() {
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape1 = new Triangle(30, 20);
        shapeCollector.addFigure(shape1);

        Shape temporaryShape = shapeCollector.getFigureName(0);

        Assert.assertEquals(shape1.getShapeName(), temporaryShape);
    }

    @Test
    public void showFiguresTest(){
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape1 = new Square(10);
        Shape shape2 = new Triangle(10, 20);
        Shape shape3 = new Circle(10);

        shapeCollector.addFigure(shape1);
        shapeCollector.addFigure(shape2);
        shapeCollector.addFigure(shape3);

        Assert.assertEquals(shapeCollector.showFigutes(), shapeCollector.getShapeList());
    }
}



