class penguin{
    private int k;

    public penguin(int k){
        this.k = k;
    }

    void display(){
        System.out.println("The number is:"+k);
    }
    
    penguin(penguin P){
        System.out.println("I am copy constructor");
        k = P.k;

        P.display();
    }

}


public class test3 {
    public static void main(String[] args) {
        penguin N = new penguin(10);
        penguin J = new penguin(N);
    }
}