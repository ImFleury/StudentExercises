package FileInputOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class FileReaderWriter {

    private final static String INPUTFILE = "vendingmachine.csv";
    private final static String logFile = "log.txt";

    private static File destinationFile;

    private static List<SnackItem> inputData;

    public static void main(String[] args) throws Exception {
        destinationFile = new File(logFile);
        inputData = new ArrayList<SnackItem>();
        File newFile = getInputFile(INPUTFILE);

        try (Scanner fileScanner = new Scanner(newFile)) {
            inputData = processFile(fileScanner);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }


    public static void writeToLog(SnackItem snack) {
        String pattern = "MM/dd/yyyy hh:mm:ssss ";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        String date = simpleDateFormat.format(new Date());


        try (PrintWriter destinationWriter = new PrintWriter(new FileOutputStream(
                new File(String.valueOf(destinationFile.getAbsoluteFile())),
                true /* append = true */))) {

            destinationWriter.printf("'%s'  '%s' \n", date.toString(), snack.toString());
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getCause());
        }
    }


    private static List<SnackItem> processFile(Scanner fileScanner) {

        List<SnackItem> tempList = new ArrayList<>();
        while (fileScanner.hasNextLine()) {

            String lineOfText = fileScanner.nextLine();

            String[] item = lineOfText.split("\\|");

            SnackItem newSnack = new SnackItem();

            newSnack.vendingMachineKey = item[0];
            newSnack.name = item[1];
            newSnack.price = new BigDecimal(item[2]);
            newSnack.snackType = item[3];

            tempList.add(newSnack);
            writeToLog(newSnack);
        }

        return tempList;
    }


    public static File getInputFile(String inputFilePath) {
        File newFile = new File(inputFilePath);
        if (newFile.exists() == false) {
            System.out.println("Input file does not exist.");
        } else if (newFile.isFile() == false) {
            System.out.println(INPUTFILE + " is not a file");
        } else {
            System.out.println("File is Okay!");
        }

        return newFile;
    }
}
