import java.io.*;
import java.util.Scanner;

public class Files {

    public static void main(String[] args) {
        String path= "/Users/joaomonteiro/test.txt";
        BufferedReader bufferedReader = null;
        FileReader fileReader = null;

        try{
            fileReader = new FileReader(path);
            bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();

            while(line != null){
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            try {
                if(bufferedReader != null)
                    bufferedReader.close();
                if(fileReader != null)
                    fileReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }

}
