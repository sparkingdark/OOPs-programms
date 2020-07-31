import java.util.ArrayList;
import java.util.Scanner;;

public class average {
     public static void main(String[] args) {
         ArrayList<Integer> a = new ArrayList<Integer>();

         Scanner sc = new Scanner(System.in);
         
         System.out.print("enter the size of the array:");
         int i = sc.nextInt();

         while (i>0) {
    
             a.add(sc.nextInt());
             i--;
         }

         sc.close();
         int sum = 0;
         //enhanced for loop
         for(Integer p:a){
              sum+=p;
         }

         System.out.println("The average of the array is:"+sum/a.size());
     }   
}