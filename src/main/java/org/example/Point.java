package org.example;

import java.util.Scanner;
import java.util.logging.Logger;

class Point implements  Cloneable{
    String x1 = String.valueOf(10);
    String y1 = String.valueOf(20);
    String x2;
    String y2;
    Logger l= Logger.getLogger("com.api.jar");
    Scanner s = new Scanner(System.in);
    Point()
    {
        l.info("Enter the Co-ordinate of X2 :");
        x2 =s.nextLine();

        l.info("Enter the Co-ordinate of Y2 :");
        y2 =s.nextLine();
    }

    //this method calls object clone().
    Point clonePoint() {
        try {
            //call clone in object.
            return (Point) super.clone();
        } catch (CloneNotSupportedException e) {
            l.info("Cloning not allowed");
            return this;
        }
    }
}
