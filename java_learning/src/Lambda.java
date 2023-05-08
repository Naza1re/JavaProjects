public class Lambda {
    public static void main(String []args){
        Operationabl operation = (x,y)->x+y;
        Operationabl operation2 = (x,y)->x*y;


        int result = operation.calculate(3,5);
        int result2 = operation2.calculate(3,5);


        System.out.println(result);
        System.out.println(result2);


    }
}
