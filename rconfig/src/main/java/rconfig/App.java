package rconfig;

import static rconfig.Utils.*;
import java.io  .*;

public class App {
    public static void main( String[] args ) throws IOException {
        System.out.println(compute_os_name());
        r_config_file_at("app.config");
        compute_dir_config_location();
    }
}
