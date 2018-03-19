//package user_management;
//
//import org.apache.commons.io.IOUtils;
//import parsing_json.ElementCollection;
//
//import java.io.IOException;
//
//public class UserCollectionInitializer {
//
//    public static UserCollection generate() {
//        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
//        String json = null;
//        try {
//            json = IOUtils.toString(classLoader.getResourceAsStream("users.json"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//
//        return UserCollection.fromJSONString(json);
//    }
//}
//
//
