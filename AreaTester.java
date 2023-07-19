import java.awt.*;

public class AreaTester {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle(10,20,10,20);
        double area ;
        area = rec.getHeight() * rec.getWidth() ;
        System.out.println("Expected area: 200");
        System.out.println("Calculated area: "+area);
    }
}
