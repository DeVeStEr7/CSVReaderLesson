import java.io.File;
import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        CSVWriter writer = new CSVWriter("writer");
        writer.writeInItem("hello from the pygame community");
        writer.addRow();
        int counter = 0;
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                writer.writeInItem(""+counter);
                counter++;
            }
            writer.addRow();
        }
        writer.returnFile();

        /*
        CSVReader reader = new CSVReader("testcsv.csv");
        reader.readNextLine();
        reader.readNextLine();
        reader.readNextLine();
        String column = reader.getColumn(5);
        System.out.println(column);

         */








        /*
        File myFile = new File("test.dat");

        if(!myFile.exists()) {
            myFile.createNewFile();
        }

        Formatter output = new Formatter(myFile);
        output.format("Hello\n");
        output.format("from the Java Community.");
        output.close();

        Scanner input = new Scanner(myFile);
        while(input.hasNext()) {
            String line = input.nextLine();
            System.out.println(line);
        }
        input.close();

         */
    }
}
