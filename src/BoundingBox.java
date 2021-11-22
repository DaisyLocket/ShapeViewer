/**
 * Bounding box class is implemented in each shape
 * All bounding boxes have the same calculations based on the original points of the shape
 */
public class BoundingBox {
    private Point bottomLeft;
    private Point topRight;

    public BoundingBox(Point bottomLeft, Point topRight){
        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
    }

    @Override
    public String toString() {
        return "BoundingBox{" +
                "bottomLeft=" + bottomLeft +
                ", topRight=" + topRight +
                '}';
    }
}
