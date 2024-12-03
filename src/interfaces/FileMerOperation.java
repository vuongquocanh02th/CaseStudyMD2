package interfaces;

import java.util.List;

public interface FileMerOperation <M>{
    List<M> readFromFile(String fileName);
    void writeToFile(String fileName, List<M> items);
    void addToFile(String fileName, M item);
    void updateInFile(String fileName, M item);
    void deleteFromFile(String fileName, M item);
}
