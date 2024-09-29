import java.io.*;

public class FileExercise {

    public static void main(String[] args) {

        String path = "/Users/joaomonteiro/summary.csv";
        String[] lines = {"TV LED,1290.99",
                "Video Game Chair,1051.50",
                "Iphone X,1800.00",
                "Samsung Galaxy 9,1700.00"};

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            File file = new File("/Users/joaomonteiro/summaryUpdate.csv");
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
                while (line != null) {
                    line = br.readLine();
                }
                    for (String l : lines) {
                        bw.write(l);
                        bw.newLine();
                }

            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
