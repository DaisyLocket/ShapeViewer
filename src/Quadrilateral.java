import java.awt.*;
import java.util.Arrays;

public class Quadrilateral extends Shape implements Rotatable {

    private Point[] points;
    protected int[] xPoly = {180, 250, 325, 375};
    protected int[] yPoly = {150, 100, 125, 225};
    int xCenter = Arrays.stream(xPoly).max().getAsInt();
    int yCenter = Arrays.stream(yPoly).max().getAsInt();
    protected int centerPoint[] = {xCenter, yCenter};


    /*public Quadrilateral(Point centerPoint, Point[] xPoly, Point[] yPoly) {
        this.points = points;
        //this.xPoly = xPoly;
        */

    /*public Quadrilateral (Point centerPoint, int xPoly, int yPoly){
        super(centerPoint);
        //points = new Point[]{p1,p2,p3,p4};
    }
    public Quadrilateral (Rectangle rectangle){
        super(Rectangle.center());
    }*/

        @Override
        public void drawShape (Graphics g){

            g.setColor(Color.CYAN);
            g.drawPolygon(xPoly, yPoly, 4);

        }

        @Override
        public void fillShape (Graphics g){

        }

        @Override
        public void drawName (Graphics g){
            g.setColor(Color.black);
            g.drawString("Quadrilateral", xCenter, yCenter);

        }

        @Override
        public void boundingBox () {

        }
    }

