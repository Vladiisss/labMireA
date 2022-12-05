package LAB9;

public class RunExcept {
    public static void main(String[] args) {
        /*Exception6_7 except = new Exception6_7() ;
        try {
            except.getKey();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }*/
        Except8 exception= new Except8();
        exception.getKey();
    }
}