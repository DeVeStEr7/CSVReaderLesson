
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;

public class CSVWriter {

    private static int currentRow = 0;
    private static int currentCol = 0;

    private ArrayList<ArrayList<String>> csvTest = new ArrayList<ArrayList<String>>();
    private Formatter output;

    public CSVWriter(String filename) throws IOException {
        File newFile = new File(filename);
        if(!newFile.exists()) {
            newFile.createNewFile();
        }
        csvTest.add(new ArrayList<String>());
        output = new Formatter(newFile);
    }

    public void writeInItem(String item){
        csvTest.get(currentRow).add(item);
        currentCol++;
    }


    public void addRow(){
        csvTest.add(new ArrayList<String>());
        currentRow++;
    }

    public void returnFile() {
        //String completeFile = "";
        for(int i = 0; i < csvTest.size(); i++) {
            for(int j = 0; j < csvTest.get(i).size(); j++) {
                //completeFile += csvTest.get(i).get(j);
                //completeFile += ",";
                output.format(csvTest.get(i).get(j));
                output.format(",");
            }
            //completeFile += "\n";
            output.format("\n");
        }
        output.close();
        //return completeFile;
    }

    /*


    public void writeIn(){
        System.out.print("Place your topics for your CSV file: ");
        String info = input.nextLine();
        String beforeComma = "";
        int i = 0;
        while(info.length() != 0) {
            if(!info.contains(",")) {
                arr[0][i] = info;
                info = "";
            }
            else {
                beforeComma = info.substring(0, info.indexOf(","));
                arr[0][i] = beforeComma;
                info = info.substring(info.indexOf(",") + 1);
            }
            i++;
        }
        i=0;
        while(arr[0][i] != null) {
            int j = 0;
            System.out.print("Write info for " + arr[0][i] + " in one line with commas in between and no spaces: ");
            String result = input.nextLine();
            while (result.length() != 0) {
                if (!result.contains(",")) {
                    arr[i][j] = result;
                    result = "";
                }
                else {
                    beforeComma = result.substring(0, result.indexOf(","));
                    arr[i][j] = beforeComma;
                    result = result.substring(info.indexOf(",") + 1);
                }
                j++;
            }
        }
    }

     */

}
