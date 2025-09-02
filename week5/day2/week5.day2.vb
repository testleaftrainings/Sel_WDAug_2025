10:00 - 10:45 -> Read from excel
10:45 - 11:15 -> Breakout+Break
11:15 - 11:45 -> EXCEL integration
11:45 - 12:15 ->BreakOut
12:15 - 12:40 -> Common Integration
12:40 - 1:00  -> Breakout

How to read the values from excel:
1)Apache Poi-library to be added
  .xls & .xlsx
  workbook--->worksheet--row---cell
  XSSF--->class

  How to create the data folder:
1)right click project--->new--->folder-->data--->finish
2)right click--->data folder--->showin--->sy explorer--->doubleclick data folder-->right click--->new--->excel sheet
3)pass ths dats from excel

  Create 2- dimensional array in the ReadEXcel Class with rowCount and columnCount String[][] data = new String[rowCount][columnCount];
 
Push stringCellValue to the Array data[i-1][j]=stringCellValue;
 
Close the workbook and return the data wBook.close(); return data;
 
Change main method to a normal static method public static String[][] readExcel(){
 
}
 
Inside the testcase within the sendData() call the readExcel() from ReadExcel Class and return the data @DataProvider(name="fetchData") public String[][] sendData() throws IOException { return ReadExcel.readExcel(); }
 
Move sendData() into the BaseClass and declare a fileName globally public String fileName; ------------ > Global declaration @DataProvider(name="fetchData") public String[][] sendData() throws IOException { return ReadExcel.readExcel(fileName); }
 
Create setValues() inside each testcase and annotate with @BeforeTest and mention the filename here @BeforeTest public void setValues() { fileName="EditLead";
 
}
 
Finally , run from the xml file


  