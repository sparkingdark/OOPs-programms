class test{

    static int p = 10,q = 11;

    static{
        System.out.println("Static block called");
        System.out.println("The sum is:"+(p+q));
    }
    public static void main(String[] args) {
        System.out.println("Now in main");
    }
}