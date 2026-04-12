//Pass by Value / Pass by Reference / Pass by Pointer

public class PassByValuePrimitives {
    public static void main(String[] args) {
        //Pass by Value - a Copy is Passed here - Using Java Primitive Types
        /*int A = 2;
        int B = 3;
        Add(A, B);
        System.out.println("Result from Main : " + (A+B));*/

        //Pass by Value - Using Java Objects
        /*Integer A = 2;
        Integer B = 3;
        Add(A, B); 
        System.out.println("Result from Main : " + (A+B));*/

        //Pass by Value - Using Non - Primitives - Arrays
        /*Integer[] Array = new Integer[2];
        Array[0] = 2;
        Array[1] = 3;
        Add(Array);
        System.out.println("Result from Main : " + (Array[0] + Array[1]));*/

        //Pass by Value for Non-Primitives(With New Reinitialized the Array Object)
        Integer[] Array = new Integer[2];
        Array[0] = 2;
        Array[1] = 3;
        Add(Array);
        System.out.println("Result from Main : " + (Array[0] + Array[1]));
    }
    //Pass by Value - a Copy is Passed here - Using Java Primitive Types
    /*private static void Add(int X, int Y){
        X = 10;
        System.out.println("Result from Method : " + (X+Y));
    }*/

    //Pass by Value - Using Java Objects
    /*private static void Add(Integer X, Integer Y){
        X = 10;
        System.out.println("Result from Method : " + (X+Y));
    }*/

    //Pass by Value - Using Non - Primitives
    /*private static void Add(Integer[] Array){
        Array[0] = 10;
        System.out.println("Result from Method : " + (Array[0] + Array[1]));
    }*/
    /*Here Pass by value will not happen, in-case of non-primitive structures in java, 
    pass by kind of reference will happen here. Rather than the Copy of the Object, We are giving the object
    itself, do whatever you want!!*/

    //Pass by Value for Non-Primitives(With New Reinitialized the Array Object)
    private static void Add(Integer[] Array){
        Array = new Integer[2];
        Array[0] = 10;
        Array[1] = 3;
        System.out.println("Result from Method : " + (Array[0] + Array[1]));
    }
}
