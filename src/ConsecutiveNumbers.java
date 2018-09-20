import java.util.Arrays;
import java.util.Scanner;

public class ConsecutiveNumbers {

   static boolean found;

   static int[] nums;
   ConsecutiveNumbers(int [] n){
       nums=n;

   }

  /*  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Input:");

        for (int i = 0; i < 5; i++) {
            nums[i] = input.nextInt();
        }

        for (int j=0;j<5;j++)
            System.out.print(nums[j]+"\t");
        //boolean found1=consecutive(nums);

        if (found1) {
            System.out.println("are consecutive");
        } else {
            System.out.println("are not consecutive");
        }


    }*/



    public  Boolean consecutive(int[] num) {

        if (num.length < 7)
            return found = false;

        else {
            Arrays.sort(num);
            int c = num[0];
            for (int i = 1; i < 5; i++) {
                if (num[i] == ++c) {
                    found = true;
                } else {
                    found = false;
                }
            }
            return found;

        }
    }
}


