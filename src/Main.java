import controller.*;
import model.*;
import views.*;

import java.util.List;
public class Main {
    public static void main(String[] args) {
        // Khởi tạo các file nếu chưa có
        FileUtils.createFilesIfNotExist();

        // Khởi tạo Controller
        MenuController menuController = new MenuController();
        menuController.showMenu();
    }
}