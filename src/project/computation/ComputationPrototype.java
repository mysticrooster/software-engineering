package project.computation;

import project.annotations.ConceptualAPIPrototype;
import project.server.data.DataOutputFormat;

import java.util.Arrays;
import java.util.List;

public class ComputationPrototype {
    @ConceptualAPIPrototype
    public void prototypeComputation(Computation api) {
        List<Integer> mockInput = Arrays.asList(1, 2, 3, 4, 5);
        ComputationRequest request = new ComputationRequest(mockInput, DataOutputFormat.CSV);
        ComputationResponse result = api.compute(request);

        if (result.isSuccess()) {
            System.out.println("Computation successful: " + result.getResult());
        } else {
            System.out.println("Computation failed: " + result.getErrorMessage());
        }
    }
}