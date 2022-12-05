package LAB9;


public class Except5 {
    public void getDetails(String key){

        if(key == null){
            throw new NullPointerException("null key in getDetails!");
        }

        key = key + "abc";
        System.out.println(key);
    }
}