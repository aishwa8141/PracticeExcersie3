public class MainException {



    public static void main(String[] args) {
        try {
            func();
        } catch (Exception1 e) {
            System.out.println("Caught Exception1");

        } finally {
            System.out.println("final msg");
        }

    }

    public static void  func() throws Exception1 {

        int n1=5,n2=3;
        int sum=n1+n2;
        System.out.println(sum);

        System.out.println("Throwing MyException from f()");
        throw new Exception1("From f()");
    }
}




class Exception1 extends Exception {
    public Exception1(String msg) {
        super(msg);
        System.out.println("Exception1(String msg)");
    }
}








