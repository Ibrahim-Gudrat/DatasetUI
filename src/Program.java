import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Program {

    private final String Datasetpath = "archive/Large_Passenger_Plane_Crashes_1933_to_2009.csv";
    private final ArrayList<DataSet> data = new ArrayList<>();

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
                    String[] values = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);
                    loadData(values);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void loadData(String[] values) {
        Date date = new Date(values[0].replace("-", "/"));

        if(!values[1].equals("")) {
            String[] time = values[1].split(":");
            date.setHours(Integer.parseInt(time[0]));
            date.setMinutes(Integer.parseInt(time[1]));
        }
        String location = values[2];
        String operator = values[3];
        String flight = values[4];
        String route = values[5];
        String type = values[6];
        String registration = values[7];
        String cnIN = values[8];
        Integer aboard = values[9].equals("") ? null : Integer.parseInt(values[9]);
        Integer fatalities = values[10].equals("") ? null : Integer.parseInt(values[10]);
        Integer ground = values[11].equals("") ? null : Integer.parseInt(values[11]);
        Integer survivors = values[12].equals("") ? null : Integer.parseInt(values[12]);
        Float survivalRate = values[13].equals("") ? null : Float.parseFloat(values[13]);
        String summary = values[15];
        String clustID = values[16];


        data.add(new DataSet(date, location, operator, flight, route, type,
                registration, cnIN, aboard, fatalities, ground, survivors, survivalRate, summary, clustID));
    }

}
