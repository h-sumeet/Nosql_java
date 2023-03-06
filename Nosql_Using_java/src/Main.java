import org.json.JSONObject;
public class Main {
    public static void main(String[] args) {

        // Create a new instance of the NoSQLDatabase class
        NoSQLDatabase db = new NoSQLDatabase();

        // Insert some data into the database
        JSONObject data1 = new JSONObject();
        data1.put("name", "Sumeet");
        data1.put("age", 21);
        db.insert("key1", data1);

        JSONObject data2 = new JSONObject();
        data2.put("name", "Rohit");
        data2.put("age", 40);
        db.insert("key2", data2);

        // Select some data from the database
        JSONObject result1 = db.select("key1");
        System.out.println(result1); // prints {"name":"Sumeet","age":21}

        JSONObject result2 = db.select("key2");
        System.out.println(result2); // prints {"name":"Rohit","age":40}

        // Update some data in the database
        JSONObject newData1 = new JSONObject();
        newData1.put("name", "Sumeet Haldar");
        newData1.put("age", 21);
        db.update("key1", newData1);

        JSONObject newData2 = new JSONObject();
        newData2.put("name", "Rohit Haldar");
        newData2.put("age", 41);
        db.update("key2", newData2);

        // Select the updated data from the database
        JSONObject updatedResult1 = db.select("key1");
        System.out.println(updatedResult1); // prints {"name":"Sumeet Haldar","age":21}

        JSONObject updatedResult2 = db.select("key2");
        System.out.println(updatedResult2); // prints {"name":"Rohit Haldar","age":41}

        // Delete some data from the database
        db.delete("key1");

        // Attempt to select the deleted data from the database
        JSONObject deletedResult1 = db.select("key1");
        System.out.println(deletedResult1); // prints null
    }
}
