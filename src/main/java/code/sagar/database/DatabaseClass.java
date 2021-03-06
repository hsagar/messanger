package code.sagar.database;

import code.sagar.model.Message;
import code.sagar.model.Profile;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Sagar
 */
public class DatabaseClass {
    private static Map<Long, Message> messages = new HashMap<>();
    private static Map<String, Profile> profiles = new HashMap<>();

    public static Map<Long, Message> getMessages() {
        return messages;
    }

    public static Map<String, Profile> getProfiles() {
        return profiles;
    }
}
