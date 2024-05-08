package rconfig;

import java.util.*;
import java.io  .*;
import java.nio.file.*;

public final class Utils{

    public static void compute_dir_config_location() throws IOException{
        byte os    = compute_os_name();
        String add = "";

        switch (os){
            case 1:
                break;
            default:
                break;
        };

        String __dir__ = "areorc";
        System.out.println("@root " + new File(".").getCanonicalPath().toString());
        // checks if the folder areorc is defined
        // if (Files.exists(__dir__));
    }

    public static void r_config_file_at(String at){
        Properties prop = new Properties();

        try (FileInputStream fis = new FileInputStream(at)) {
            prop.load(fis);
        } catch (FileNotFoundException ex) {
            System.out.println("@filenotfoundexp " + ex);
        } catch (IOException ex) {
            System.out.println("@IOException     " + ex);
        }

        System.out.println(prop.getProperty("test"));
    }

    public static byte compute_os_name(){
        String OS = System.getProperty("os.name", "generic").toLowerCase(Locale.ENGLISH);

        if ((OS.indexOf("mac") >= 0) || (OS.indexOf("darwin") >= 0)) {
            return 0;
        } else if (OS.indexOf("win") >= 0) {
            return 1;
        } else if (OS.indexOf("nux") >= 0) {
            return 2;
        } else {
            return 3;
        }
    }
}