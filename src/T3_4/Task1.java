package T3_4;


import java.io.*;
import java.net.*;

public class Task1 {
    private final static String ADDRESS = "https://users.metropolia.fi/~jarkkov/temploki.csv";

    public static void main(String[] args) {
        // First, create the URL
        URL myUrl;

        try {
            myUrl = new URL(ADDRESS);
        } catch (MalformedURLException e) {
            System.err.println(e);
            return;
        }

        // Variables for calculating the average
        double totalTemperature = 0;
        int count = 0;

        String line;
        String[] columnNames = new String[0];
        int temperatureIndex = -1;
        boolean header = true;

        try (
                // open the connection and get the input stream
                // it will automatically generate HTTP GET-request
                InputStream istream = myUrl.openStream();

                // jump to character streams
                InputStreamReader istreamreader = new InputStreamReader(istream);

                // and to buffered reader for efficiency
                BufferedReader reader = new BufferedReader(istreamreader)
        ) {
            // here we read the content of the web page line by line
            while ((line = reader.readLine()) != null) {

                if (header) {
                    // Read the column names
                    columnNames = line.split(";");

                    // Find the UlkoTalo column
                    for (int i = 0; i < columnNames.length; i++) {
                        if (columnNames[i].trim().equals("UlkoTalo")) {
                            temperatureIndex = i;
                        }
                    }

                    header = false;

                } else {
                    // Read the data columns
                    String[] columns = line.split(";");

                    // Check that the column exists
                    if (temperatureIndex != -1 && columns.length > temperatureIndex) {

                        // Check if the date is 1st of January 2023
                        if (columns[0].startsWith("01.01.2023")) {

                            // Convert temperature to double
                            double temperature = Double.parseDouble(
                                    columns[temperatureIndex].replace(",", ".")
                            );

                            totalTemperature += temperature;
                            count++;
                        }
                    }
                }
            }

            // now it is time to print the result and calculate the average
            if (count > 0) {
                double average = totalTemperature / count;
                System.out.println("Measurements: " + count);
                System.out.println("Average temperature: " + average);
            } else {
                System.out.println("No measurements found.");
            }

        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
