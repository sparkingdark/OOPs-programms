import java.util.*;


public class perimeter_rectangle {

   static Integer a,b;

    static void  area(){
        System.out.println("The area of the rectangle:"+a*b);
    }

   static void perimeter(){
        System.out.println("The perimeter of the rectangle:"+2*(a+b));
    }
    
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        perimeter_rectangle.perimeter();
        perimeter_rectangle.area();
    }
}