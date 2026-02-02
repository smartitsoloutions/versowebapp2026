public class UserService {

    public static int getUsernameLength(String username) {
        // FIX: Null check before using the object
        if (username == null) {
            return 0; // or throw an IllegalArgumentException
        }
        return username.length();
    }

    public static void main(String[] args) {
        String username = null;
        System.out.println(getUsernameLength(username));
    }
}

