class parameter_mod{

    int a,b;
    parameter_mod(int a,int b){
        this.a = a;
        this.b = b;

        System.out.println("parameter constructor initialised succesfully");
    }

    void add(){
        System.out.println("the sum is:"+(a+b));
    }
}

class parameter{
    public static void main(String[] args) {
        parameter_mod k = new parameter_mod(4, 5);

        k.add();
    }
}