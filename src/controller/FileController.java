package controller;
import model.FileManager;
import views.FileView;
import java.util.List;

public class FileController {
    private FileManager fileManager;
    private FileView fileView;

    // Phương thức xử lý đọc file
    public void readFile() {
        String fileName = fileView.requestFileName();
        List<String> content = fileManager.readFile(fileName);
        fileView.displayFileContent(content);
    }

    // Phương thức xử lý ghi file
    public void writeFile() {
        String fileName = fileView.requestFileName();
        List<String> content = fileView.requestNewContent();
        fileManager.writeFile(fileName, content);
        System.out.println("File has been updated.");
    }
}
