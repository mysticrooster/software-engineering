package project.server;

import project.annotations.NetworkAPIPrototype;

// 2. The Client Prototype
public class RequestPrototype {
    @NetworkAPIPrototype
    public void prototypeUserComputeEngine(Request api) {
        // The prototype takes the API as its ONLY parameter
        api.configureJob("sftp://server/input.csv", "local_output.txt",
                ';');
    }
}