package project.datastore;

import java.util.List;
import project.annotations.ProcessAPIPrototype;

public class StoragePrototype {
    @ProcessAPIPrototype
    public void prototypeDataStorage(Storage api) {
        List<Integer> mockData = api.readInputData("mock_database_source");
    }
}