import java.net.MalformedURLException;
import java.net.URL;


public class Test2 {
    public static void main(String[] args) throws MalformedURLException {
        String url = connection();
    }
    public static String connection() throws MalformedURLException {
        URL url = new URL("https://jsonplaceholder.typicode.com/posts/1");
        String result = url.toString();
        System.out.println(result);
        return  result;
    }
    String out = main(["1", "2"]);

}
