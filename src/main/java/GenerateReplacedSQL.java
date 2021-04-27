import java.io.File;
import java.net.URL;
import java.util.Optional;

public class GenerateReplacedSQL {
    public static void main(String[] args) {
        ClassLoader classLoader = GenerateReplacedSQL.class.getClassLoader();

        Optional<String> optionalFile = Optional.ofNullable(classLoader.getResource("sql_queries.xml"))
                .map(URL::getFile);

        if (optionalFile.isPresent()) {
            File file = new File(optionalFile.get());

            //File is found
            System.out.println("File Found : " + file.exists());
        } else {
            System.out.println("Resource not found");
        }
    }
}