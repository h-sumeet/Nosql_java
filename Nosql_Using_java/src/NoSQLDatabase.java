import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class NoSQLDatabase {
    private Map<String, JSONObject> data = new HashMap<>();

    public void insert(String key, JSONObject value) {
        data.put(key, value);
    }

    public JSONObject select(String key) {
        return data.get(key);
    }

    public void update(String key, JSONObject value) {
        data.put(key, value);
    }

    public void delete(String key) {
        data.remove(key);
    }
}

