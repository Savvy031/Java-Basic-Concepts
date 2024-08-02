import java.util.*;
import java.io.*;

public class application{
    private static Scanner input;
    private static ObjectOutputStream output;

    public static void openInputFile() {
        try {
            input = new Scanner(new File("propertydata.txt"));
            input.useDelimiter("[#\\n\\r]");
        } catch (IOException ioE) {
            System.out.println("Cannot open input file ");
            System.exit(1);
        }
    }

    public static void openOutputFile() {
        try {
            output = new ObjectOutputStream(new FileOutputStream("propertydata.ser"));
        } catch (IOException ioE) {
            System.out.println("Cannot open output file");
            System.exit(1);
        }
    }

    public static void closeInputFile() {
        input.close();
    }

    public static void closeOutputFile() {
        try {
            output.close();
        } catch (IOException ioE) {
            System.out.println("Cannot close output file ");
            System.exit(1);
        }
    }

    public static void main(String[] args) {
        int cap = 25; // capacity of array
        int nrOfObjects = 0; // number of objects in array
        File file = new File("propertydata.txt"); // open file
        Property[] property = new Property[cap]; // create an array of type superclass

        openInputFile();
        openOutputFile();

        try {
            input = new Scanner(file); // scan/read all elements in file

            while (input.hasNextLine()) // while not end of file
            {
                String code;
                String agent;
                double price;
                double rentPm;
                int duration;

                String line = input.nextLine(); // save each and every line to (line) variable so that you can later split the line into wanted parts
                String[] parts = line.split("#"); // create an array to hold the different parts, split the line saved above(splited part is achieved)

                code = parts[0]; // the split will get the first element before the #
                agent = parts[1]; // the split will get the second element before the #

                if (code.charAt(0) == '1') {
                    price = Double.parseDouble(parts[2]);

                    property[nrOfObjects++] = new SellProperty(code, agent, price);
                } else if (code.charAt(0) == '2') {
                    rentPm = Double.parseDouble(parts[2]); // the split will get the third element before the #
                    duration = Integer.parseInt(parts[3]); // the split will get the fourth element before the #
                    property[nrOfObjects++] = new RentProcerty(code, agent, rentPm, duration);
                } else {
                    System.out.println("Please provide a valid code");
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (input != null) {
                input.close();
            }
        }

        // print the objects before sorting
        for (int i = 0; i < nrOfObjects; i++) {
            System.out.println(property[i]);
        }

        // Serialization, writing the objects as byte stream into our text FILE
        try {
            for (int i = 0; i < nrOfObjects; i++) {
                output.writeObject(property[i]);
                System.out.println("Property written to file");
            }
            output.flush(); // Flushes the stream to ensure all data is written
        } catch (IOException ioE) {
            System.out.println("Cannot write object to output file ");
            System.exit(1);
        }

        closeInputFile();
        closeOutputFile();
		
		
		//Sort the items in the array
		System.out.println("\n List of the products after sorting");
		
		Property[] tempList = Arrays.copyOf(property,  nrOfObjects);
		Arrays.sort(tempList);
		
		for(int i = 0 ; i < nrOfObjects ; i++)
		{
			System.out.println(tempList[i]);
		}
		
		
    }
}
