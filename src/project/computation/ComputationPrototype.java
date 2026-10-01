package project.computation;

import project.annotations.ConceptualAPIPrototype;

public class ComputationPrototype {
    @ConceptualAPIPrototype
    public void prototypeComputation(Computation api) {
        int mockInput = 6;
        String mockResult = api.computeResult(mockInput);
    }
}