package com.kodilla.testing.shape;


import org.junit.*;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests()
    {
        System.out.println("This is beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests()
    {
        System.out.println("All tests are finished.");
    }
    @Before
    public  void beforeEveryTest()
    {
        testCounter++;
        System.out.println("Preparing to execute test#" + testCounter);
    }

    @Test
    public void testAddFigure()
    {
        //Given
        Shape circle = new Circle(5);
        ShapeCollector theShape = new ShapeCollector();

        //When
        theShape.addFigure(circle);

        //Then
        Assert.assertEquals(1,theShape.getShapes().size());
    }

    @Test
    public void testRemoveFigure()
    {
        //Given
        Shape circle = new Circle(5);
        ShapeCollector theShape = new ShapeCollector();
        theShape.addFigure(circle);

        //When
        theShape.removeFigure(circle);

        //Then
        Assert.assertEquals(0,theShape.getShapes().size());
    }

    @Test
    public void testGetFigure()
    {
        //Given
        Shape circle = new Circle(5);
        ShapeCollector theShape = new ShapeCollector();
        theShape.addFigure(circle);

        // When
        Shape retrivedCircle;
        retrivedCircle = theShape.getFigure(0);

        //Then
        Assert.assertEquals(retrivedCircle,circle);
    }

}
