package views;
import java.util.ArrayList;
import java.util.List;

public class FileView {
    //Hien thi noi dung file len console
    public void displayFileContent(List<String> content){
        System.out.println("File content: ");
        for (String line: content){
            System.out.println(line);
        }
    }
    //Yeu cau nguoi dung nhap file va du lieu moi
    public String requestFileName(){
        System.out.print("Enter file name: ");
        return System.console().readLine();
    }
    //
    public List<String> requestNewContent(){
        System.out.println("Enter new content(enter exit to stop): ");
        List<String> content = new ArrayList<>();
        String line;
        while (!(line = System.console().readLine()).equals("exit")){
            content.add(line);
        }
        return content;
    }
}
