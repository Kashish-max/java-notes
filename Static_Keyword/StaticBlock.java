package Static_Keyword;

import java.io.IOException;

// There are two main reasons behind java static block.
// 1. Static block is used to initialize the static data member.
// 2. It is used to perform some operations which should be done before execution of main method.
public class StaticBlock {
    static {
        System.out.println("Static block");
    }
}

// why do we need static block to initialize static variables as we can initialize them while declaring?
// There are cases where we need to initialize static variables by some complex logic.
class AppConfig {
    public static String databaseUrl;

    static {
        // Complex initialization logic
        try {
            databaseUrl = readDatabaseUrlFromConfig();
        } catch (IOException e) {
            // Handle exception
            e.printStackTrace();
        }
    }

    private static String readDatabaseUrlFromConfig() throws IOException {
        // Logic to read the database URL from a configuration file
        return "jdbc:mysql://localhost:3306/mydatabase";
    }
}

