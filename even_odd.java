import java.util.Scanner;

public class even_odd {
    static int a;

 static void odd_even(){
        if (a%2==0) {
            System.out.println("The number is even");
        }

        else if(a%2==1){
            System.out.println("The number is odd");
        }
    }

    public static void main(String[] args) {
        a = 22;

        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();

        sc.close();

        even_odd.odd_even();
    }
}