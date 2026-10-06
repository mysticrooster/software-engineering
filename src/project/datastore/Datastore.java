package project.datastore;

import project.annotations.ProcessAPI;

@ProcessAPI
public interface Datastore {
    LoadResponse load(LoadRequest request);

    StoreResponse store(StoreRequest request);
}