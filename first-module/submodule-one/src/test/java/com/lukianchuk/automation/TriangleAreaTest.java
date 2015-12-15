package com.lukianchuk.automation;

import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Objects;

/**
 * Created by qa1 on 12/15/15.
 */
@RunWith(Parameterized.class)

public class TriangleAreaTest {

    @Parameterized.Parameters()
    public static Object[][] data() {
        Object [][] result = {
            {
                1, 1, 0.5  // base, height and result
            },
            {
                2, 3, 3
            },
            {
                10, 5, 25.1
            }
        };
        return result;
    }

    public static double base;
    public static double height;
    public static double area;

    public TriangleAreaTest(double base, double height, double area) {
        this.base = base;
        this.height = height;
        this.area = area;
    }

    @Test
    public void areaTest() {
        Triangle triangle = new Triangle();
        Assert.assertEquals("Triangle Area is: ", area, triangle.getTriangleArea(base, height));
        System.out.println("base = " + base + ";" + " height = " + height + ";" + " area = " + area);
    }


}
