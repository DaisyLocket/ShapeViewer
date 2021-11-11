import java.awt.*;

public class Quadrilateral extends Shape implements Rotatable{

    private Point[] points;
    public Quadrilateral (Point centerPoint, Point[] points){
        super(centerPoint);
        this.points = points;
    }
    public Quadrilateral (Point centerPoint, Point p1, Point p2, Point p3, Point p4){
        super(centerPoint);
        points = new Point[]{p1,p2,p3,p4};
    }
    public Quadrilateral (Rectangle rectangle){
        super(Rectangle.center());
    }

    @Override
    public void drawShape(Graphics g) {

    }

    @Override
    public void fillShape(Graphics g) {

    }

    @Override
    public void drawName(Graphics g) {

    }

    @Override
    public void boundingBox() {

    }
}
