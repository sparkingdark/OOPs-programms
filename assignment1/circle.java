/**
 * Innercircle area
 * perimeter calculated
 */
class areaperi{
    void area(int radius){
        System.out.println("the area of the circle:"+3.14*radius*radius);
    }

    void perimeter(int radius){
        System.out.println("The perimeter of the circle:"+3.14*2*radius);
    }
}
public class circle {

    public static void main(String[] args) {
        int radius = 10;
        areaperi ab = new areaperi();
    
        ab.area(radius);
        ab.perimeter(radius);
    }

}