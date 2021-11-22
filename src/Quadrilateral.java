import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.Arrays;

public class Quadrilateral extends Shape implements Rotatable {

    protected static int[] xPoly = {180, 250, 325, 375};
    protected static int[] yPoly = {150, 100, 125, 225};
    int xCenter = (((Arrays.stream(xPoly).max().getAsInt())-(Arrays.stream(xPoly).min().getAsInt()))/2)+(Arrays.stream(xPoly).min().getAsInt());
    int yCenter = (((Arrays.stream(yPoly).max().getAsInt())-(Arrays.stream(yPoly).min().getAsInt()))/2)+(Arrays.stream(yPoly).min().getAsInt());
    static int numOfPoints = xPoly.length;
    protected int centerPoint[] = {xCenter, yCenter};
    int bottomLeftX = Arrays.stream(xPoly).min().getAsInt();
    int bottomLeftY = Arrays.stream(yPoly).max().getAsInt();
    int topRightX = Arrays.stream(xPoly).max().getAsInt();
    int topRightY = Arrays.stream(yPoly).min().getAsInt();
    public BoundingBox boundingBox;
    private Rectangle rectangle = new Rectangle();


    public Quadrilateral(int[] xPoly, int[] yPoly, int numOfPoints) {
        Quadrilateral.xPoly= xPoly;
        Quadrilateral.yPoly= yPoly;
        Quadrilateral.numOfPoints = numOfPoints;

        this.boundingBox = new BoundingBox(new Point(bottomLeftX, bottomLeftY),new Point (topRightX, topRightY));
    }

    /*public Quadrilateral(int x, int y,int i, int i1) {
        rectangle.xRec = x;
        rectangle.yRec= y;
        rectangle.width = i;
        rectangle.height = i1;
    }*/

    @Override
        public void drawShape (Graphics g){
            g.setColor(Color.CYAN);

            if(filled)
                g.fillPolygon(xPoly, yPoly, numOfPoints);
            else
                g.drawPolygon(xPoly, yPoly, numOfPoints);
        }

        @Override
        public void drawName (Graphics g){
            g.setColor(Color.black);
            g.drawString("Quadrilateral", xCenter, yCenter);
        }

        @Override
        public void boundingBox (Graphics g) {
            g.setColor(Color.black);
            g.drawRect(bottomLeftX, topRightY, (topRightX - bottomLeftX), (bottomLeftY - topRightY));
        }

    @Override
    public String toString() {
        return "Quadrilateral{" +
                "xCenter=" + xCenter +
                ", yCenter=" + yCenter +
                ", centerPoint=" + Arrays.toString(centerPoint) +
                ", bottomLeftX=" + bottomLeftX +
                ", bottomLeftY=" + bottomLeftY +
                ", topRightX=" + topRightX +
                ", topRightY=" + topRightY +
                ", boundingBox=" + boundingBox +
                ", rectangle=" + rectangle +
                '}';
    }
}

