import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Program {

    private final String Datasetpath = "archive/Large_Passenger_Plane_Crashes_1933_to_2009.csv";
    private final HashMap<Integer, DataSet> data = new HashMap<>();

    public void start() {

        System.out.println("Starting");
        readData();
        System.out.println("Welcome to Console UI Based Program");
    }

    public void readData() {

        boolean firstLine = true;
        try (BufferedReader br = new BufferedReader(new FileReader(Datasetpath))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (firstLine) {
                    firstLine = false;
                    continue;
                } else {

                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
