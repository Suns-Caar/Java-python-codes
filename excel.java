import java.awt.*;
import  java.io.*;
import java.util.Scanner;
import  org.apache.poi.hssf.usermodel.HSSFSheet;
import  org.apache.poi.hssf.usermodel.HSSFWorkbook;
import  org.apache.poi.hssf.usermodel.HSSFRow;

public class excel {
    public static void main(String[] args) throws IOException {
        String filename = "D:\\College\\code\\sample.xlsx";
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("excelsheet");

        File text = new File("D:\\College\\code\\sample1.txt");
        Scanner scan = new Scanner(text);
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of columns in the text file: ");
        int columns = input.nextInt();

        String[][] a = new String[columns][columns];
        while (scan.hasNextLine()) {
            for (int i = 0; i < a.length; i++) {
                String[] line = scan.nextLine().trim().split(" ");
                for (int j = 0; j < line.length; j++) {
                    a[i][j] = line[j];
                }
            }
        }

        int k, l;

        for (k = 0; k < columns; k++) {
            HSSFRow rowhead = sheet.createRow((short) k);
            for (l = 0; l < columns; l++) {
                rowhead.createCell(l).setCellValue(a[k][l]);
            }
        }
        FileOutputStream fileOut = new FileOutputStream(filename);
        workbook.write(fileOut);
        fileOut.close();
        workbook.close();
        

        Desktop.getDesktop().open(new File("D:\\College\\code\\sample.xlsx"));

    }
}
