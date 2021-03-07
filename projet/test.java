import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Main {
    public static void main(String[] args) {

        JSONParser parser = new JSONParser();

        try {     
            Object obj = parser.parse(new FileReader("./test.json"));

            JSONObject jsonObject =  (JSONObject) obj;

            String name = (String) jsonObject.get("name");
            System.out.println(name);

            String city = (String) jsonObject.get("age");
            System.out.println(city);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}