package com.example.javatestb;

import com.example.javatestb.Entity.Customers;
import com.example.javatestb.Service.CustomersService;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import org.springframework.beans.factory.annotation.Autowired;


public class TransferCSVtoDBTables {
  private static final String customerpath = "/Users/hanyrenando/Downloads/javatestb/src/main/java/com/example/javatestb/attachments_test_java/Customers.csv";

  @Autowired
  private static CustomersService customersService;

  public static void main(String[] args) throws IOException
  {
    readCsv();
  }

  private static void readCsv() throws IOException
  {
    CSVParser parser = new CSVParserBuilder().withSeparator(';').build();
    try (
        Reader reader = Files.newBufferedReader(Paths.get(customerpath));
        CSVReader csvReader = new CSVReaderBuilder(reader).withSkipLines(1).withCSVParser(parser).build();
    ) {
      // Reading Records One by One in a String array
      String[] nextRecord;
      while ((nextRecord = csvReader.readNext()) != null) {
        Customers saverow = new Customers();
        saverow.setCustomerID(Integer.parseInt(nextRecord[0]));
        saverow.setCompanyName((nextRecord[1]));
        saverow.setFirstName((nextRecord[2]));
        saverow.setLastName((nextRecord[3]));
        saverow.setBillingAddress((nextRecord[4]));
        saverow.setCity(nextRecord[5]);
        saverow.setStateOrProvince(nextRecord[6]);
        saverow.setZIPCode(nextRecord[7]);
        saverow.setEmail(nextRecord[8]);
        saverow.setCompanyWebsite(nextRecord[9]);
        saverow.setPhoneNumber(nextRecord[10]);
        saverow.setFaxNumber(nextRecord[11]);
        saverow.setShipAddress(nextRecord[12]);
        saverow.setShipCity((nextRecord[13]));
        saverow.setShipStateOrProvince(nextRecord[14]);
        saverow.setShipZIPCode(nextRecord[15]);
        saverow.setShipPhoneNumber(nextRecord[16]);
        customersService.saveCustomer(saverow);

      }
    }
  }
}
