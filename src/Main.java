import org.json.simple.JSONObject;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("This is an example!");

//      Skapa ett JSON object
        JSONObject jsonOb = new JSONObject();

//      Spara värden i JSON Object
        jsonOb.put("name", "Marcus");
        jsonOb.put("age", 34);

//      Skriva ut värden
        System.out.println("Mitt namn är " + jsonOb.get("name"));
        System.out.println("Jag är " + jsonOb.get("age") + " år gammal.");

        System.out.println(jsonOb);
    }
}