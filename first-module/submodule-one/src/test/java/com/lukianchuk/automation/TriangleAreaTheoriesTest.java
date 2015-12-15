package com.lukianchuk.automation;

import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import java.util.Objects;

import static org.junit.Assert.*;

@RunWith(Theories.class)
public class TriangleAreaTheoriesTest {

    @DataPoints
    public static double[][] area = new double[][] {
            {
                    1, 1, 0.5  // base, height and result
            },
            {
                    2, 3, 3
            },
            {
                    10, 5, 25.2
            }
    };

    @Theory
    public void areaTest(final double... testData) {
        Triangle triangle = new Triangle();
        double actual = triangle.getTriangleArea(testData[0], testData[1]);
        System.out.println(actual);
        assertEquals(testData[2], actual, 0.11);
    }


}