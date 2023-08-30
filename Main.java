public class Main {
    public static void main(String[] args) {
        String someKey = System.getenv("SOME_KEY");
        if(someKey == null) {
            someKey = "key not found";
        }
        System.out.println(someKey.equals("123456"));
    }
}
