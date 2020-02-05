package ie.tudublin;
//what is benefit of package of java 
//: prevents name space conflicts 


//changes on the test branches 

public class Main {
    public static void main(String[] args) {
        
        //method 1 
        for(int i=0; i < args.length; i++)
        {
            System.out.println(args[i]);
        }

        //method 2 
        for(String s:args)
        {
            System.out.println(s);
        }
    }
}