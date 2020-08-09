import java.util.*;


public class perimeter_circle {

   static Integer a;

    static void  area(){
        System.out.println("The area of the rectangle:"+3.17*a*a);
    }

   static void perimeter(){
        System.out.println("The perimeter of the rectangle:"+2*3.17*a);
    }
    
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        

        perimeter_circle.perimeter();
        perimeter_circle.area();
    }
}