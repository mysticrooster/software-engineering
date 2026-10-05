package project.datastore;

import project.server.data.DataDestination;
import project.server.data.DataSource;

public class StoreRequest {
    private DataSource source;
    private DataDestination destination;

    public StoreRequest(DataSource source, DataDestination destination) {
        this.source = source;
        this.destination = destination;
    }

    public DataSource getSource() {
        return source;
    }

    public DataDestination getDestination() {
        return destination;
    }

}
