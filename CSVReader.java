import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CSVReader {

    private String currentLine;
    private File csvFile;
    private Scanner input;


    public CSVReader(String path) throws FileNotFoundException {
        this.csvFile = new File(path);
        if(!this.csvFile.exists()) {
            System.out.println("FILE NOT EXIST");
        }

        input = new Scanner(csvFile);

    }

    public void readNextLine(){
        currentLine = input.nextLine();
        System.out.println(currentLine);
    }

    public String getColumn(int n){
        int counter = 0;
        String beforeCommaReader = "";
        if(n == 0){
            return currentLine.substring(0,currentLine.indexOf(","));
            }
        else {
            String columnLoc = "";
            while(counter != n) {
                if(!currentLine.contains(",")) {
                    return currentLine;
                }
                else {
                    beforeCommaReader = currentLine.substring(0, currentLine.indexOf(","));
                    currentLine = currentLine.substring(currentLine.indexOf(",") + 1);
                    counter++;
                }
            }
            return beforeCommaReader;
        }
    }
}
