public class ExceptionEx17 {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println("main exception zz");
        }
    }

    static void method1() throws Exception {
        try {
            throw new Exception();
        } catch(Exception e) {
            System.out.println("method1 exception zz");
            throw e;
        }
    }
    
}
