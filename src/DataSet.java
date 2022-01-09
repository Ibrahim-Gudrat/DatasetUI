import java.time.LocalTime;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

public class DataSet {
    private final AtomicInteger count = new AtomicInteger(0);
    private Integer Id;
    private Date date;
    private LocalTime time;
    private String location;
    private String operator;
    private String flight;
    private String route;
    private String type;
    private String registration;
    private String cnIN;
    private Integer aboard;
    private Integer fatalities;
    private Integer ground;
    private Integer survivors;
    private Float survivalRate;
    private String summary;
    private String clustID;

    public DataSet(Integer id, Date date, LocalTime time, String location, String operator, String flight, String route, String type, String registration, String cnIN, Integer aboard, Integer fatalities, Integer ground, Integer survivors, Float survivalRate, String summary, String clustID) {
        Id = count.incrementAndGet();
        this.date = date;
        this.time = time;
        this.location = location;
        this.operator = operator;
        this.flight = flight;
        this.route = route;
        this.type = type;
        this.registration = registration;
        this.cnIN = cnIN;
        this.aboard = aboard;
        this.fatalities = fatalities;
        this.ground = ground;
        this.survivors = survivors;
        this.survivalRate = survivalRate;
        this.summary = summary;
        this.clustID = clustID;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getFlight() {
        return flight;
    }

    public void setFlight(String flight) {
        this.flight = flight;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public String getCnIN() {
        return cnIN;
    }

    public void setCnIN(String cnIN) {
        this.cnIN = cnIN;
    }

    public Integer getAboard() {
        return aboard;
    }

    public void setAboard(Integer aboard) {
        this.aboard = aboard;
    }

    public Integer getFatalities() {
        return fatalities;
    }

    public void setFatalities(Integer fatalities) {
        this.fatalities = fatalities;
    }

    public Integer getGround() {
        return ground;
    }

    public void setGround(Integer ground) {
        this.ground = ground;
    }

    public Integer getSurvivors() {
        return survivors;
    }

    public void setSurvivors(Integer survivors) {
        this.survivors = survivors;
    }

    public Float getSurvivalRate() {
        return survivalRate;
    }

    public void setSurvivalRate(Float survivalRate) {
        this.survivalRate = survivalRate;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getClustID() {
        return clustID;
    }

    public void setClustID(String clustID) {
        this.clustID = clustID;
    }
}