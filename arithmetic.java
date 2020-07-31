/**
 * arithmetic operations 
 * addition
 * subtraction
 * multiplication
 * remainder
 * divide
 */
class operations {

    static void add(int a,int b){
        System.out.println("the addition is:"+a+b);
    }

    static void multiply(int a,int b){
        System.out.println("the multiplication is:"+a*b);
    }

    static void subtract(int a,int b){
        System.out.println("the subtraction is:"+(a-b));
    }

    static void divide(int a,int b){
        System.out.println("the divide is: "+a/b);
    }

    static void remainder(int a,int b){
        System.out.println("The remainder is:"+a%b);
    }

}

class arithmetic{
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        
        operations ab = new operations();

        ab.add(a,b);
        ab.divide(a, b);
        ab.multiply(a, b);
        ab.remainder(a, b);
        ab.subtract(a, b);
        
    }
}