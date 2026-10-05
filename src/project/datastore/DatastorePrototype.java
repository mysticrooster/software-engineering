package project.datastore;

import project.annotations.ProcessAPIPrototype;
import project.server.data.DataDestination;
import project.server.data.DataSource;

public class DatastorePrototype {
    @ProcessAPIPrototype
    public void prototypeDataStorage(Datastore api) {
        StoreRequest storeRequest = new StoreRequest(new DataSource("mock_source"),
                new DataDestination("mock_database_location"));
        StoreResponse storeResponse = api.store(storeRequest);

        if (storeResponse.isSuccess()) {
            System.out.println("Datastore store request successful: " + storeResponse.getResult());
        } else {
            System.out.println("Datastore store request failed: " + storeResponse.getErrorMessage());
        }

        LoadRequest loadRequest = new LoadRequest("mock_database_data");
        LoadResponse loadResponse = api.load(loadRequest);

        if (loadResponse.isSuccess()) {
            System.out.println("Load successful: " + loadResponse.getResult());
        } else {
            System.out.println("Load failed: " + loadResponse.getErrorMessage());
        }
    }
}