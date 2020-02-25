package Day01.com.Lab01.reflection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadShapes {
    String fileName;

//    public ReadShapes(String fileName){
//        this.fileName=fileName;
//    }

    public List<String> readShapesFromFile(String fileName) throws FileNotFoundException {
        this.fileName = fileName;
        List<String> lines = new ArrayList<>();
        Scanner scanner = new Scanner(new File(fileName));
        while (scanner.hasNext()) {
            lines.add(scanner.nextLine());
        }
        scanner.close();
        return lines;
    }
}

//Read Reflections and Generics
