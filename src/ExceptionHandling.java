import java.util.Scanner;

public class ExceptionHandling {
    private int a=5;


    public static void main(String[] args){

        ExceptionHandling exceptionHandling=null;

         int arrSize;


            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("enter array size");
                arrSize = scanner.nextInt();
                if (arrSize < 0) {
                    throw new NegativeArraySizeException("array size cannot be negative "+arrSize);
                }
                int[] arr={1,12};
                System.out.println(arr[3]);


                System.out.println(exceptionHandling.a);
            }
            catch (NegativeArraySizeException e){
                System.out.println(e.getMessage()+" "+e);
            }

            catch (NullPointerException e){
                System.out.println(e);
            }







    }
}
