public class rectangle {

    static int a, b;

    static void  area(){
        System.out.println("The area of the rectangle:"+a*b);
    }

   static void perimeter(){
        System.out.println("The perimeter of the rectangle:"+2*(a+b));
    }
    
    public static void main(String[] args) {
        a = 10;
        b = 22;

        rectangle.perimeter();
        rectangle.area();
    }
}