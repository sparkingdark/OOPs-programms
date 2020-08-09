class parameter_mod1{

    
    parameter_mod1(){

        System.out.println("non parameter constructor initialised succesfully");
    }

    void add(){
        System.out.println("I am the method");
    }
}

class non_parameter{
    public static void main(String[] args) {
        parameter_mod1 k = new parameter_mod1();

        k.add();
    }
}