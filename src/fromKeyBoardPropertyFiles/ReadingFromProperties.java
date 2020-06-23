package fromKeyBoardPropertyFiles;

import java.io.FileReader;
import java.util.Properties;

public class ReadingFromProperties {


    public static void main(String[] args) throws Exception {

//        should be present in the same path as src
        FileReader reader = new FileReader("db.properties");

        Properties p = new Properties();
//        load properties into p
        p.load(reader);

        System.out.println(p.getProperty("user"));
        System.out.println(p.getProperty("password"));
    }

}
