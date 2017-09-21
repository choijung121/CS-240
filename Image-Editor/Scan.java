import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Scan {
    Image readFile(String inputFileName) throws IOException{
        Scanner s = null;
        Image img = new Image();

        try{
            s = new Scanner(new BufferedReader(new FileReader(inputFileName)));
            s.useDelimiter("(\\s+)(#[^\\n]*\\n)?(\\s*)|(#[^\\n]*\\n)(\\s*)");
            s.next();
            img.width = Integer.parseInt(s.next());
            img.height = Integer.parseInt(s.next());
            Pixel[][] multi = new Pixel[img.height][img.width];
            s.next();
            int rowCount = 0;
            int columnCount = 0;
            while (s.hasNext()){
                String Red = s.next();
                String Green = s.next();
                String Blue = s.next();
                Pixel pix = new Pixel(Red, Green, Blue);
                multi[rowCount][columnCount] = pix;
                columnCount++;
                if(columnCount == img.width){
                    columnCount = 0;
                    rowCount++;
                }
            }
            img.imageArray = multi;
            return img;
         } finally {
            if (s != null){
                s.close();
            }
         }
    }
}
