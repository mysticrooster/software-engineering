package project.server.data;

public abstract class DataLocation {

    private String location;

    public DataLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }
}